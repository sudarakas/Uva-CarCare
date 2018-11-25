package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;

public final class tarckappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("\t\t<div class=\"box\">\n");
      out.write("                    <div class=\"box-header\">\n");
      out.write("\t\t\t<center>\n");
      out.write("                            <h2 style=\"text-transform: uppercase\">Check Appointment</h2>\n");
      out.write("                            <p class=\"text-muted\">Check Your Appointment Status Online </p>\n");
      out.write("\t\t\t</center>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<form action=\"viewappointment.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Invoice No</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"invoiceno\" required>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" name=\"register\" class=\"btn btn-danger\" style=\"width: 50%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-arrows\"></i> Check Appointment\n");
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("<!--Add JavaScript Files-->\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\n");
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
