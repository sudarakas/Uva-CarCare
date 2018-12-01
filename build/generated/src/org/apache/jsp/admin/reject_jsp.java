package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public final class reject_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                public static class SMTPAuthenticator extends Authenticator{
                    public PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication("uvacarcare", "uvacarcare@uwu");
                    }
                }
            
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");

        if(session.getAttribute("email") == null){
            response.sendRedirect("stafflogin.jsp");
        }
        if(session.getAttribute("utype") != "Admin"){
            response.sendRedirect("finishjob.jsp");
        }
    
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Approve</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--DB Connection -->\r\n");
      out.write("        ");

            Connection conn = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare", "root", "");
            
      out.write("\r\n");
      out.write("            ");

            }catch(Exception e){
            
      out.write(" \r\n");
      out.write("                <script>alert(\"Connection Dead\");</script>\r\n");
      out.write("            ");

            }
        
      out.write("\r\n");
      out.write("        ");

            try{
            String appId = request.getParameter("appId");
            String rejectAppointSql = "UPDATE appoinment SET Status='Rejected' WHERE appoinmentId='"+appId+"'";
            
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
            
      out.write("   \r\n");
      out.write("                <!--        Mailing Function using javax.mailer-->\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");

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
                m_subject = "Your Appointment Rejected";
                m_text = "<h3>Hi! ";
                m_text = m_text.concat(cName);
                m_text = m_text.concat("</h3>");
                m_text = m_text.concat("<br><p>We are sorry to inform you that your appointment has been Rejected. Please be kind enough to contact us, if you need futher infromation</p>");
                m_text = m_text.concat("<br><h3>Please use invoice no refer your problem</h3>");
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
            
      out.write("\r\n");
      out.write("            %>\r\n");
      out.write("                <script>alert(\"Appointment Rejected Successfully\");</script>\r\n");
      out.write("            ");

                response.sendRedirect("newappointment.jsp");
            }else{
            
      out.write("\r\n");
      out.write("                <script>alert(\"Somthing Wrong\");</script>\r\n");
      out.write("            ");
 
                response.sendRedirect("newappointment.jsp");
            }
        }catch(Exception e){
            out.print(e);
        }
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!--Add JavaScript Files-->\r\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\r\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
