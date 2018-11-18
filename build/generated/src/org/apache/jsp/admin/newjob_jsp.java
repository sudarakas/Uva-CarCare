package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjob_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>New Jobs - Uva CareCare</title>\n");
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
      out.write("            <div class=\"row\">\n");
      out.write("\t\t<div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("\t\t\t<div class=\"panel-heading\">\n");
      out.write("                            <div class=\"panel-title\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-car\"></i> Car Status\n");
      out.write("                            </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\t\t\t\t<div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table table-bordered table-striped\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Invoice No</th>\n");
      out.write("                                                <th>Service</th>\n");
      out.write("\t\t\t\t\t\t<th>Center</th>\n");
      out.write("                                                <th>Date</th>\n");
      out.write("                                                <th>Time</th>\n");
      out.write("                                                <th>Approve</th>\n");
      out.write("                                                <th>Reject</th>\n");
      out.write("                                            </tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>49461ABC</td>\n");
      out.write("                                                <td>Car Full Wash</td>\n");
      out.write("                                                <td>Badulla</td>\n");
      out.write("                                                <td>23-11-2018</td>\n");
      out.write("                                                <td>12.30AM</td>\n");
      out.write("                                                <td><a href='' class=\"btn btn-success\">Approve</a></td>\n");
      out.write("                                                <td>Washing</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
