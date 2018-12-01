package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");

        if(session.getAttribute("email") == null){
            response.sendRedirect("stafflogin.jsp");
        }
        if(!session.getAttribute("utype").equals("Admin")){
            response.sendRedirect("finishjob.jsp");
        }
    
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Admin - Uva CareCare</title>\r\n");
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" id=\"slider\">\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<div id=\"slideshow1\" class=\"carousel slide col-md-12\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("                                    <div class='item active'>\r\n");
      out.write("\t\t\t\t\t<img src='resources/img/5.jpg'>\r\n");
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
      out.write("                            <h2 style=\"text-transform: uppercase\">Admin Area</h2>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br><br><br>\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-primary\" style=\"width: 100%;\" onclick=\"location.href='newappointment.jsp';\" value=\"New Appointments\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-primary\" style=\"width: 100%;\" onclick=\"location.href='approvedappointment.jsp';\" value=\"Duty Assign\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-primary\" style=\"width: 100%;\" onclick=\"location.href='reserve.html';\" value=\"Finished Jobs\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-primary\" style=\"width: 100%;\" onclick=\"location.href='allappointments.jsp';\" value=\"All Appointments\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br><br><br>\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-success\" style=\"width: 100%;\" onclick=\"location.href='addemployee.jsp';\" value=\"Add Employee\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-success\" style=\"width: 100%;\" onclick=\"location.href='reserve.html';\" value=\"View Employee\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-success\" style=\"width: 100%;\" onclick=\"location.href='../tarckappointment.jsp';\" value=\"Track Orders\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-success\" style=\"width: 100%;\" onclick=\"location.href='reserve.html';\" value=\"Rejected Orders\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!--Footer Start-->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<!--Add JavaScript Files-->\r\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\r\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
