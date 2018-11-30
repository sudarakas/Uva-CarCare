<%-- 
    Document   : duty
    Created on : Nov 30, 2018, 9:37:23 PM
    Author     : NanoX
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.util.Properties"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Duty Assign - Uva CareCare</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <!--Add CSS Files-->
	<link rel="stylesheet" type="text/css" href="resources/css/styles.css">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet"  type="text/css" href="resources/fontawesome/css/font-awesome.min.css">
	<link href="https://fonts.googleapis.com/css?family=Nunito:200,300,400,700,900" rel="stylesheet">
        
    </head>
    <body>
<!--	Navigation Bar Start-->
	
	<jsp:include page="include/navbar.jsp"/>
<!--JSP Code Goes Here-->

<!--DB Connection -->
<%
    Connection conn = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare", "root", "");
    %>
    <%
    }catch(Exception e){
    %> 
        <script>alert("Connection Dead");</script>
    <%
    }
    %>
<!--Contents Start-->
<div id="content" class="container">
	<div class="row">
            <div class="col-md-8 col-md-offset-2">
		<div class="box">
                    <div class="box-header">
			<center>
                            <img src="resources/img/logo.jpg" alt="" class="logo">
                            <h2 style="text-transform: uppercase">Assign Duty</h2>
			</center>
					</div>
					<form action="" method="post">
                                                <div class="form-group">
                                                    <input type="hidden" name="jobinvoice" value='<%out.print(request.getParameter("invoiceNo"));%>'>
                                                </div>
						<div class="form-group">
							<label>Select Employee</label>
							<select name="emp" id="field_5" class="form-control"  required>    
                                                            <option value="Choose your time" selected="">Choose employee</option>  
                                                            <%
                                                                String getEmpSql = "SELECT * FROM users WHERE userType = 'Emp'";
                                                                Statement st = conn.createStatement();
                                                                ResultSet rt = st.executeQuery(getEmpSql);
                                                                while(rt.next()){
                                                            %>
                                                                    <option value='<%out.print(rt.getString(1));%>'><%out.print(rt.getString(2));%></option>
                                                                    <%
                                                             }
                                                         %>
							</select>
                                                </div>
						<div class="text-center">
							<button type="submit" name="duty" class="btn btn-primary" style="width: 50%;">
								<i class="fa fa-user-plus"></i> Assign Employee
                                                        </button>
						</div>
                                            <br>
                                            <br>
					</form>
				</div>
			</div>
	</div>
</div>
	

<!--Footer Start-->
	<jsp:include page="include/footer.jsp"/>
<!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
        
        
 <%
     if(request.getParameter("duty") != null){
         String empId = request.getParameter("emp");
         String invoiceNo = request.getParameter("jobinvoice");
         
         String addJobSql ="INSERT INTO job(InvoiceNo, empId) VALUES ('"+invoiceNo+"','"+empId+"')";
         String updateAppSql = "UPDATE appoinment SET Status='Job Assigned' WHERE InvoiceNo='"+invoiceNo+"'";
         
         int chk = st.executeUpdate(addJobSql);
         st.execute(updateAppSql);
         
         String getEmpEmailSql = "SELECT * FROM users WHERE userId='"+empId+"'";
         ResultSet rtx = st.executeQuery(getEmpEmailSql);
         rtx.next();
         
         String empEmail = rtx.getString("Email");
         String empName = rtx.getString("Name");
             
         %>
            <!--        Mailing Function using javax.mailer-->
            <%!
                public static class SMTPAuthenticator extends Authenticator{
                    public PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication("uvacarcare", "uvacarcare@uwu");
                    }
                }
            %>
            <%
                int mailsent = 0;
                String d_uname = "uvacarcare";
                String d_password = "uvacarcare@uwu";
                String d_host = "smtp.gmail.com";
                int d_port = 465;

                String m_to = new String();
                String m_from = "uvacarcare@gmail.com";
                String m_subject = new String();
                String m_text = new String();

                m_to = empEmail;
                m_subject = "New Job Assigned";
                m_text = "<h3>Hi! ";
                m_text = m_text.concat(empName);
                m_text = m_text.concat("</h3>");
                m_text = m_text.concat("<br><p>System administrator assigned a new job to you</p>");
                m_text = m_text.concat("<br><h3>Please use invoice no refer your job</h3>");
                m_text = m_text.concat("<br><br><b>Invoice No: <i>");
                m_text = m_text.concat(invoiceNo);
                m_text = m_text.concat("</i></b>");
                m_text = m_text.concat("<br><br><br><p>Thank You</p><br>");
                m_text = m_text.concat("<b>Team - Uva CareCare</b>");

                Properties props = new Properties();
                SMTPAuthenticator auth = new SMTPAuthenticator();
                Session sess = Session.getInstance(props, auth);
                MimeMessage msg = new MimeMessage(sess);

                msg.setContent(m_text, "text/html");
                msg.setSubject(m_subject);
                msg.setFrom(new InternetAddress(m_from));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(m_to));

                try{
                    Transport trans = sess.getTransport("smtps");
                    trans.connect(d_host,d_port,d_uname,d_password);
                    trans.sendMessage(msg, msg.getAllRecipients());
                    trans.close();
                }catch(Exception e){
                    out.print(e);
                }
            %>
            <% if(chk > 0){ %>
                <script>alert("Appointment Assiged Successfully");</script>
            <%    response.sendRedirect("approvedappointment.jsp");
            }else{%>
                <script>alert("Somthing Wrong");</script>
            <%
                response.sendRedirect("approvedappointment.jsp");
            }    
}
 %>
</body>
</html>
