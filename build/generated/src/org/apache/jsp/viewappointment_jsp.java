package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class viewappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\t\t\t\t\t<img src='resources/img/1.jpg'>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!--Contents Start-->\n");
      out.write("<div id=\"content\" class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("            <!--JSP Code Goes Here-->\n");
      out.write("\n");
      out.write("            <!--DB Connection -->\n");
      out.write("            ");

                Connection conn = null;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare", "root", "");
                
      out.write("\n");
      out.write("                ");

                }catch(Exception e){
                
      out.write(" \n");
      out.write("                    <script>alert(\"Connection Dead\");</script>\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("\n");
      out.write("            ");

                //Car Status
                String invoiceNo = request.getParameter("invoiceno");

                String getInvoiceStatusSql = "SELECT * FROM appoinment WHERE InvoiceNo='"+invoiceNo+"'";
                PreparedStatement pst = conn.prepareCall(getInvoiceStatusSql);
                ResultSet rt = pst.executeQuery();

                rt.next();

                String cName = rt.getString(3);
                String cEmail = rt.getString(4);
                String cPNo = rt.getString(5);
                String service = rt.getString(6);
                String serviceCenter = rt.getString(7);
                String date = rt.getString(8);
                String time = rt.getString(9);
                String cmsg = rt.getString(10);
                String cstatus = rt.getString(11); 
            
      out.write("\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h3 class=\"text-success text-uppercase text-center\">Current Status : ");
 out.print(cstatus); 
      out.write("</h3>\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"panel-title\">\n");
      out.write("                                <i class=\"fa fa-car\"></i> View Details\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-bordered table-striped\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th></th>\n");
      out.write("                                            <th>Details</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Your Name</th>\n");
      out.write("                                            <th>");
out.print(cName);
      out.write("</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Your Email</th>\n");
      out.write("                                            <th>");
out.print(cEmail);
      out.write("</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Your Phone No</th>\n");
      out.write("                                            <th>");
out.print(cPNo);
      out.write("</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Requested Service</th>\n");
      out.write("                                            <th>");
out.print(service);
      out.write("</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Selected Service Center</th>\n");
      out.write("                                            <th>");
out.print(serviceCenter);
      out.write("</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Service Date</th>\n");
      out.write("                                            <th>");
out.print(date);
      out.write("</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Selected Time</th>\n");
      out.write("                                            <th>");
out.print(time);
      out.write("</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Message</th>\n");
      out.write("                                            <th>");
out.print(cmsg);
      out.write("</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\t\n");
      out.write("\n");
      out.write("<!--Footer Start-->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("<!--Add JavaScript Files-->\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
