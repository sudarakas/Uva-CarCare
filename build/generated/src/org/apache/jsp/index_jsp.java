package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <title>Uva CareCare - Badulla</title>\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" id=\"slider\">\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<div id=\"slideshow1\" class=\"carousel slide col-md-12\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("                                    <div class='item active'>\r\n");
      out.write("\t\t\t\t\t<img src='resources/img/1.jpg'>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class='item'>\r\n");
      out.write("\t\t\t\t\t<img src='resources/img/3.jpg'>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class='item'>\r\n");
      out.write("\t\t\t\t\t<img src='resources/img/4.jpg'>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class='item'>\r\n");
      out.write("\t\t\t\t\t<img src='resources/img/5.jpg'>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!--Contents Start-->\r\n");
      out.write("<div id=\"content\" class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa fa-car\"></i> Welcome</h3>\r\n");
      out.write("                        <p style='line-height:200%;'>\r\n");
      out.write("                                We at Uva Car Care offer convenient and quality driven services for your vehicle. \t\r\n");
      out.write("                                From a basic exterior wash to more specialized interior detailing.\r\n");
      out.write("                        </p>\r\n");
      out.write("                        \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa fa-neuter\"></i> About Us</h3>\r\n");
      out.write("                        <p style='line-height:200%;'>\r\n");
      out.write("                                Uva Car Care division was initiated in the year 2018 as a separate Strategic Business \t\r\n");
      out.write("                                Unit (SBU) of NanoLabs PVT Limited.   \r\n");
      out.write("                        </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa fa-car\"></i> Service Categories</h3>\r\n");
      out.write("                        <ul class=\"listx\">\r\n");
      out.write("                            <li>Car Wash Packages</li>\r\n");
      out.write("                            <li>Detailing Services</li>\r\n");
      out.write("                            <li>Lubrication Services</li>\r\n");
      out.write("                            <li>Wheel Alignment</li>\r\n");
      out.write("                            <li>Specialised Services</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa fa-gift\"></i>Promotions</h3>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Check out our special promotions and offers at LAUGFS Car Care Service Centres. Stay \ttuned to our website for more details. \r\n");
      out.write("                        </p>\r\n");
      out.write("                        \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("<!--            Image Start-->\r\n");
      out.write("            <div class=\"col-md-12 text-center\">\r\n");
      out.write("                <img src=\"resources/img/car.png\" class=\"\"><br><br>\r\n");
      out.write("                <input type=\"button\" class=\"btn btn-danger\" style=\"width: 50%;\" onclick=\"location.href='reserve.jsp';\" value=\"Reserver Online Now\" />\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("            </div>\r\n");
      out.write("<br>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!--Footer Start-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
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
