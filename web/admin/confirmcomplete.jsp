<%-- 
    Document   : confirmcomplete
    Created on : Dec 1, 2018, 12:11:20 PM
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
    <%
        if(session.getAttribute("email") == null){
            response.sendRedirect("stafflogin.jsp");
        }
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Approve</title>
    </head>
    <body>
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
            String appId = request.getParameter("appId");
            String rejectAppointSql = "UPDATE appoinment SET Status='Completed' WHERE appoinmentId='"+appId+"'";
            
            PreparedStatement pst = conn.prepareCall(rejectAppointSql);
            
            int update = pst.executeUpdate();
            
            if(update > 0){
                String getCustomerEmailSql = "SELECT * FROM appoinment WHERE appoinmentId='"+appId+"'";
                PreparedStatement pst2 = conn.prepareCall(getCustomerEmailSql);
                ResultSet rt = pst2.executeQuery();
                rt.next();
                String cEmail = rt.getString("Email");
                String cName = rt.getString("Name");
                String invoiceNo = rt.getString("InvoiceNo");
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

                m_to = cEmail;
                m_subject = "Your Car is Ready to PickUp";
                m_text = "<h3>Hi! ";
                m_text = m_text.concat(cName);
                m_text = m_text.concat("</h3>");
                m_text = m_text.concat("<p>We are happy to inform that your car has been completly serviced. Please come and pickup your car</p>");
                m_text = m_text.concat("<br><h3>Please use invoice no refer your bill</h3>");
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
            %>
                <script>alert("Job Confirmed Successfully");</script>
            <%
                response.sendRedirect("finishjob.jsp");
            }else{
            %>
                <script>alert("Somthing Wrong");</script>
            <% 
                response.sendRedirect("finishjob.jsp");
            }
        }catch(Exception e){
            out.print(e);
        }
        %>
        
        <!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
    </body>
</html>
