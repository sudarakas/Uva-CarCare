<%-- 
    Document   : contactus
    Created on : Nov 18, 2018, 11:18:31 AM
    Author     : NanoX
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.util.Properties"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contact Us - Uva CareCare</title>
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

	<div class="container" id="slider">
		<div class="col-md-12">
			<div id="slideshow1" class="carousel slide col-md-12" data-ride="carousel">
				<div class="carousel-inner">
                                    <div class='item active'>
					<img src='resources/img/3.jpg'>
                                    </div>
				</div>
			</div>
		</div>
	</div>
<!--Contents Start-->
<div id="content" class="container">
	<div class="row">
            <div class="col-md-8 col-md-offset-2">
		<div class="box">
                    <div class="box-header">
			<center>
                            <img src="resources/img/logo.jpg" alt="" class="logo">
                            <h2 style="text-transform: uppercase">Contact Us</h2>
                            <p class="text-muted">Drop a message, We are 24/7 active</p>
			</center>
					</div>
					<form action="" method="post">
						<div class="form-group">
							<label>Name</label>
							<input type="text" class="form-control" name="cus_name" required>
						</div>
						<div class="form-group">
							<label>Email</label>
							<input type="email" class="form-control" name="cus_email" required>
                                                </div>
                                                <div class="form-group">
							<label>Phone No</label>
							<input type="text" class="form-control" name="cus_pno" required>
                                                </div>
                                                <div class="form-group">
							<label>Message</label>
                                                        <textarea name="msg" class="form-control" rows="5"></textarea>
                                                </div>
						
						<div class="text-center">
							<button type="submit" name="contact" class="btn btn-danger" style="width: 50%;">
								<i class="fa fa-paper-plane"></i> Submit
                                                        </button>
						</div>
                                            <br>
                                            <br>
					</form>
				</div>
			</div>
	</div>
</div>
<%
    if(request.getParameter("contact") != null){
        
        String cName = request.getParameter("cus_name");
        String cEmail = request.getParameter("cus_email");
        String cPNo = request.getParameter("cus_pno");
        String cMsg = request.getParameter("msg");
 %>

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
        <%
            try{

  %>              <!--        Mailing Function using javax.mailer-->
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

                m_to = "uvacarcare@gmail.com";
                m_subject = "New Message From Uva CarCare Support";
                m_text = "<h3>Hi! ";
                m_text = m_text.concat("Admin");
                m_text = m_text.concat("</h3>");
                m_text = m_text.concat("<p>Name: ");
                m_text = m_text.concat(cName);
                m_text = m_text.concat("</p>");
                m_text = m_text.concat("<p>Email: ");
                m_text = m_text.concat(cEmail);
                m_text = m_text.concat("</p>");
                m_text = m_text.concat("<p>Phone No: ");
                m_text = m_text.concat(cPNo);
                m_text = m_text.concat("</p>");
                m_text = m_text.concat("<p>Message: ");
                m_text = m_text.concat(cMsg);
                m_text = m_text.concat("</p>");
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
            %>
                <script>alert("Job Confirmed Successfully");</script>
            <%
                response.sendRedirect("conatctus.jsp");
            
            
        }catch(Exception e){
            out.print(e);
        }
        }
        %>

<!--Footer Start-->
	<jsp:include page="include/footer.jsp"/>
<!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>

