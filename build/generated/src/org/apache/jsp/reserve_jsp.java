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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Reserve Online - Uva CareCare</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        <!--Add CSS Files-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/styles.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\"  type=\"text/css\" href=\"resources/fontawesome/css/font-awesome.min.css\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Nunito:200,300,400,700,900\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!--\tNavigation Bar Start-->\n");
      out.write("\t\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"container\" id=\"slider\">\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t<div id=\"slideshow1\" class=\"carousel slide col-md-12\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("                                    <div class='item active'>\n");
      out.write("\t\t\t\t\t<img src='resources/img/3.jpg'>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!--Contents Start-->\n");
      out.write("<div id=\"content\" class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("\t\t<div class=\"box\">\n");
      out.write("                    <div class=\"box-header\">\n");
      out.write("\t\t\t<center>\n");
      out.write("                            <h2 style=\"text-transform: uppercase\">RESERVE NOW</h2>\n");
      out.write("                            <p class=\"text-muted\">A state of the art online reservation system has been created for your convenience. \n");
      out.write("                                Now make reservations for your next vehicle service from the comfort of your desk. \n");
      out.write("                                Simply fill in the short form and click 'Send Request' to make your car care reservation. \n");
      out.write("                                Once your request has been sent, a customer service representative will call you to confirm the booking.</p>\n");
      out.write("\t\t\t</center>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<form action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Name</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"cname\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Email</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" name=\"cemail\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Phone No</label>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"cpno\" pattern=\"[0]{1}[0-9]{9}\" onchange=\"this.setCustomValidity(this.validity.patternMismatch ? 'Phone is not valid, Please enter a valid phone number' : ''); if(this.checkValidity()) form.cus_cpass.pattern = this.value;\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Service</label>\n");
      out.write("                                                    <select name=\"service\" class=\"form-control\" required>    \n");
      out.write("                                                        <option value=\"Car Wash Only\">Car Wash Only</option>    \n");
      out.write("                                                        <option value=\"Auto Car Wash Only\">Auto Car Wash Only</option>  \n");
      out.write("                                                        <option value=\"Car Vacuum Only\">Car Vacuum Only</option>    \n");
      out.write("                                                        <option value=\"Auto Car Wash with Vacuum\">Auto Car Wash with Vacuum</option>    \n");
      out.write("                                                        <option value=\"Car Wash with Vacuum\">Car Wash with Vacuum</option>  \n");
      out.write("                                                        <option value=\"Car Service\">Car Service</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                        <label>Service Center</label>\n");
      out.write("                                                        <select name=\"servicecenter\" class=\"form-control\" required>    \n");
      out.write("                                                            <option value=\"Badulla\">Badulla</option>    \n");
      out.write("                                                            <option value=\"Passara\">Passara</option>  \n");
      out.write("                                                            <option value=\"Hali Ela\">Hali Ela</option>    \n");
      out.write("                                                            <option value=\"Bandarawela\">Bandarawela</option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Date</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"date\" class=\"form-control\" name=\"cdate\" id=\"sdate\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Time</label>\n");
      out.write("\t\t\t\t\t\t\t<select name=\"ctime\" id=\"field_5\" class=\"form-control\"  required>    \n");
      out.write("                                                            <option value=\"Choose your time\" selected=\"\">Choose your time</option>  \n");
      out.write("                                                            <option value=\"7am to 9am\">7am to 9am</option>  \n");
      out.write("                                                            <option value=\"9am to 11am\">9am to 11am</option>    \n");
      out.write("                                                            <option value=\"11am to 1pm\">11am to 1pm</option>    \n");
      out.write("                                                            <option value=\"1pm to 3pm\">1pm to 3pm</option>  \n");
      out.write("                                                            <option value=\"3pm to 5pm\">3pm to 5pm</option>  \n");
      out.write("                                                            <option value=\"5pm to 7pm\">5pm to 7pm</option>  \n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Message(Car Model)</label>\n");
      out.write("                                                        <textarea name=\"cmsg\" class=\"form-control\" rows=\"5\"></textarea>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" name=\"register\" class=\"btn btn-danger\" style=\"width: 50%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-car\"></i> Reserve Now\n");
      out.write("                                                        </button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("                                            <br>\n");
      out.write("                                            <br>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!--Footer Start-->\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("<!--limit date selection code-->\n");
      out.write("    <script>\n");
      out.write("        var minDate = new Date();\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\"#sdate\").datepicker({\n");
      out.write("                showAnim: 'drop',\n");
      out.write("                dateFormat: 'yy-mm-dd',\n");
      out.write("                minDate: minDate,\n");
      out.write("                onclose:function(selectedDate){\n");
      out.write("                    $('#sdate').datepicker(\"option\", \"minDate\", selectedDate );\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("<!--Add JavaScript Files-->\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("<!--JSP Code Goes Here-->\n");
      out.write("\n");
      out.write("<!--DB Connection -->\n");

    Connection conn = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare", "root", "");
    
      out.write("\n");
      out.write("    ");

    }catch(Exception e){
    
      out.write(" \n");
      out.write("        <script>alert(\"Connection Dead\");</script>\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    \n");
  
//Make Reservation
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
        String possible = "1234567890";
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
        
        
        int insertData = pst.executeUpdate();
        if(insertData > 0){
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("            <script>alert(\"Appointment submitted successfully\");</script>\n");
      out.write("        ");

        }else{
        
      out.write("\n");
      out.write("            <script>alert(\"Something Worng! Please check back later\");</script>\n");
      out.write("        ");

        }
        
    }catch(Exception e){
            out.print(e);
    }

      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
