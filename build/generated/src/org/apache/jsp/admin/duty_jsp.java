package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public final class duty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Duty Assign - Uva CareCare</title>\n");
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
      out.write("<!--Contents Start-->\n");
      out.write("<div id=\"content\" class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("\t\t<div class=\"box\">\n");
      out.write("                    <div class=\"box-header\">\n");
      out.write("\t\t\t<center>\n");
      out.write("                            <img src=\"resources/img/logo.jpg\" alt=\"\" class=\"logo\">\n");
      out.write("                            <h2 style=\"text-transform: uppercase\">Assign Duty</h2>\n");
      out.write("\t\t\t</center>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<form action=\"\" method=\"post\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input type=\"hidden\" name=\"jobinvoice\" value='");
out.print(request.getParameter("invoiceNo"));
      out.write("'>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Select Employee</label>\n");
      out.write("\t\t\t\t\t\t\t<select name=\"emp\" id=\"field_5\" class=\"form-control\"  required>    \n");
      out.write("                                                            <option value=\"Choose your time\" selected=\"\">Choose employee</option>  \n");
      out.write("                                                            ");

                                                                String getEmpSql = "SELECT * FROM users WHERE userType = 'Emp'";
                                                                Statement st = conn.createStatement();
                                                                ResultSet rt = st.executeQuery(getEmpSql);
                                                                while(rt.next()){
                                                            
      out.write("\n");
      out.write("                                                                    <option value='");
out.print(rt.getString(1));
      out.write('\'');
      out.write('>');
out.print(rt.getString(2));
      out.write("</option>\n");
      out.write("                                                                    ");

                                                             }
                                                         
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" name=\"duty\" class=\"btn btn-primary\" style=\"width: 50%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-user-plus\"></i> Assign Employee\n");
      out.write("                                                        </button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
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
      out.write("<!--Add JavaScript Files-->\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write(" ");

     if(request.getParameter("duty") != null){
         String empId = request.getParameter("emp");
         String invoiceNo = request.getParameter("jobinvoice");
         
         String addJobSql ="INSERT INTO job(InvoiceNo, empId) VALUES ('"+invoiceNo+"','"+empId+"')";
         String updateAppSql = "UPDATE appoinment SET Status='Job Assigned' WHERE InvoiceNo='"+invoiceNo+"'";
         
         st.executeUpdate(addJobSql);
         st.execute(updateAppSql);
         
         String getEmpEmailSql = "SELECT * FROM users WHERE userId='"+empId+"'";
         ResultSet rtx = st.executeQuery(getEmpEmailSql);
         rtx.next();
         
         String empEmail = rtx.getString("Email");
         String empName = rtx.getString("Name");
             
         
      out.write("\n");
      out.write("            <!--        Mailing Function using javax.mailer-->\n");
      out.write("            ");
      out.write("\n");
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
            
      out.write("\n");
      out.write("            %>\n");
      out.write("                <script>alert(\"Appointment Assiged Successfully\");</script>\n");
      out.write("            ");

                response.sendRedirect("approvedappointment.jsp");
            }else{
            
      out.write("\n");
      out.write("                <script>alert(\"Somthing Wrong\");</script>\n");
      out.write("         ");
       
                response.sendRedirect("approvedappointment.jsp");
     }
 
 
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
