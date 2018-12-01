package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public final class reserve_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Reserve Online - Uva CareCare</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        \r\n");
      out.write("        <!--Add CSS Files-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/styles.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\"  type=\"text/css\" href=\"resources/fontawesome/css/font-awesome.min.css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Nunito:200,300,400,700,900\" rel=\"stylesheet\">\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("<!--\tNavigation Bar Start-->\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" id=\"slider\">\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<div id=\"slideshow1\" class=\"carousel slide col-md-12\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("                                    <div class='item active'>\r\n");
      out.write("\t\t\t\t\t<img src='resources/img/3.jpg'>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!--Contents Start-->\r\n");
      out.write("<div id=\"content\" class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("                    <div class=\"box-header\">\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("                            <h2 style=\"text-transform: uppercase\">RESERVE NOW</h2>\r\n");
      out.write("                            <p class=\"text-muted\">A state of the art online reservation system has been created for your convenience. \r\n");
      out.write("                                Now make reservations for your next vehicle service from the comfort of your desk. \r\n");
      out.write("                                Simply fill in the short form and click 'Send Request' to make your car care reservation. \r\n");
      out.write("                                Once your request has been sent, a customer service representative will call you to confirm the booking.</p>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<form action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Name</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"cname\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Email</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" name=\"cemail\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Phone No</label>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"cpno\" pattern=\"[0]{1}[0-9]{9}\" onchange=\"this.setCustomValidity(this.validity.patternMismatch ? 'Phone is not valid, Please enter a valid phone number' : ''); if(this.checkValidity()) form.cus_cpass.pattern = this.value;\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label>Service</label>\r\n");
      out.write("                                                    <select name=\"service\" class=\"form-control\" required>    \r\n");
      out.write("                                                        <option value=\"Car Wash Only\">Car Wash Only</option>    \r\n");
      out.write("                                                        <option value=\"Auto Car Wash Only\">Auto Car Wash Only</option>  \r\n");
      out.write("                                                        <option value=\"Car Vacuum Only\">Car Vacuum Only</option>    \r\n");
      out.write("                                                        <option value=\"Auto Car Wash with Vacuum\">Auto Car Wash with Vacuum</option>    \r\n");
      out.write("                                                        <option value=\"Car Wash with Vacuum\">Car Wash with Vacuum</option>  \r\n");
      out.write("                                                        <option value=\"Car Service\">Car Service</option>\r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                        <label>Service Center</label>\r\n");
      out.write("                                                        <select name=\"servicecenter\" class=\"form-control\" required>    \r\n");
      out.write("                                                            <option value=\"Badulla\">Badulla</option>    \r\n");
      out.write("                                                            <option value=\"Passara\">Passara</option>  \r\n");
      out.write("                                                            <option value=\"Hali Ela\">Hali Ela</option>    \r\n");
      out.write("                                                            <option value=\"Bandarawela\">Bandarawela</option>\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Date</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"date\" class=\"form-control\" name=\"cdate\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Time</label>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"ctime\" id=\"field_5\" class=\"form-control\"  required>    \r\n");
      out.write("                                                            <option value=\"Choose your time\" selected=\"\">Choose your time</option>  \r\n");
      out.write("                                                            <option value=\"7am to 9am\">7am to 9am</option>  \r\n");
      out.write("                                                            <option value=\"9am to 11am\">9am to 11am</option>    \r\n");
      out.write("                                                            <option value=\"11am to 1pm\">11am to 1pm</option>    \r\n");
      out.write("                                                            <option value=\"1pm to 3pm\">1pm to 3pm</option>  \r\n");
      out.write("                                                            <option value=\"3pm to 5pm\">3pm to 5pm</option>  \r\n");
      out.write("                                                            <option value=\"5pm to 7pm\">5pm to 7pm</option>  \r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Message(Car Model)</label>\r\n");
      out.write("                                                        <textarea name=\"cmsg\" class=\"form-control\" rows=\"5\"></textarea>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" name=\"register\" class=\"btn btn-danger\" style=\"width: 50%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-car\"></i> Reserve Now\r\n");
      out.write("                                                        </button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <br>\r\n");
      out.write("                                            <br>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!--Footer Start-->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Add JavaScript Files-->\r\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\r\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("<!--JSP Code Goes Here-->\r\n");
      out.write("\r\n");
      out.write("<!--DB Connection -->\r\n");

    Connection conn = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare", "root", "");
    
      out.write("\r\n");
      out.write("    ");

    }catch(Exception e){
    
      out.write(" \r\n");
      out.write("        <script>alert(\"Connection Dead\");</script>\r\n");
      out.write("    ");

    }
    
      out.write("\r\n");
      out.write("    \r\n");
  
//Make Reservation
    if(request.getParameter("register") != null){
        try{
            String cName = request.getParameter("cname");
            String cEmail = request.getParameter("cemail");
            String cPNo = request.getParameter("cpno");
            String service = request.getParameter("service");
            String serviceCenter = request.getParameter("servicecenter");
            String date = request.getParameter("cdate");
            String time = request.getParameter("ctime");
            String cmsg = request.getParameter("cmsg");

            String reserveSql = "INSERT INTO appoinment(InvoiceNo, Name, Email, PhoneNo, Service, ServiceCenter, Date, Time, Message,Status) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareCall(reserveSql);
            //Statement st = conn.prepareStatement(reserveSql);

            String invoiceNo = "";
            String possible = "1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
            for (int i = 0; i < 10; i++) {
                invoiceNo += possible.charAt((int)Math.floor(Math.random()*possible.length()));
            }

            pst.setString(1, invoiceNo);
            pst.setString(2, cName);
            pst.setString(3, cEmail);
            pst.setString(4, cPNo);
            pst.setString(5, service);
            pst.setString(6, serviceCenter);
            pst.setString(7, date);
            pst.setString(8, time);
            pst.setString(9, cmsg);
            pst.setString(10, "New");

            int insertData = 0;
            if(invoiceNo != null){
                insertData = pst.executeUpdate();
            }

            if(insertData > 0){
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--        Mailing Function using javax.mailer-->\r\n");
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
                m_subject = "Your Appointment Received Successfully";
                m_text = "<h3>Hi! ";
                m_text = m_text.concat(cName);
                m_text = m_text.concat("</h3>");
                m_text = m_text.concat("<br><p>Your appointment has been received successfully. Please be kind enough to handover the vehicle before the time you selected.</p>");
                m_text = m_text.concat("<br><h3>You can track your appointment on our site, Using Invoice No:</h3>");
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
      out.write("                <script>alert(\"Appointment submitted successfully\");</script>\r\n");
      out.write("            ");

            }else{
            
      out.write("\r\n");
      out.write("                <script>alert(\"Something Worng! Please check back later\");</script>\r\n");
      out.write("            ");

            }

        }catch(Exception e){
                out.print(e);
        } 
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
