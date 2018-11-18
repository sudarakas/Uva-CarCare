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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Uva CareCare - Badulla</title>\n");
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
      out.write("                                    <div class='item'>\n");
      out.write("\t\t\t\t\t<img src='resources/img/3.jpg'>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class='item'>\n");
      out.write("\t\t\t\t\t<img src='resources/img/4.jpg'>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class='item'>\n");
      out.write("\t\t\t\t\t<img src='resources/img/5.jpg'>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!--Contents Start-->\n");
      out.write("<div id=\"content\" class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa fa-car\"></i> Welcome</h3>\n");
      out.write("                        <p style='line-height:200%;'>\n");
      out.write("                                We at Uva Car Care offer convenient and quality driven services for your vehicle. \t\n");
      out.write("                                From a basic exterior wash to more specialized interior detailing.\n");
      out.write("                        </p>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa fa-neuter\"></i> About Us</h3>\n");
      out.write("                        <p style='line-height:200%;'>\n");
      out.write("                                Uva Car Care division was initiated in the year 2018 as a separate Strategic Business \t\n");
      out.write("                                Unit (SBU) of NanoLabs PVT Limited.   \n");
      out.write("                        </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa fa-car\"></i> Service Categories</h3>\n");
      out.write("                        <ul class=\"listx\">\n");
      out.write("                            <li>Car Wash Packages</li>\n");
      out.write("                            <li>Detailing Services</li>\n");
      out.write("                            <li>Lubrication Services</li>\n");
      out.write("                            <li>Wheel Alignment</li>\n");
      out.write("                            <li>Specialised Services</li>\n");
      out.write("                        </ul>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa fa-gift\"></i>Promotions</h3>\n");
      out.write("                        <p>\n");
      out.write("                            Check out our special promotions and offers at LAUGFS Car Care Service Centres. Stay \ttuned to our website for more details. \n");
      out.write("                        </p>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("<!--            Image Start-->\n");
      out.write("            <div class=\"col-md-12 text-center\">\n");
      out.write("                <img src=\"resources/img/car.png\" class=\"\"><br><br>\n");
      out.write("                <input type=\"button\" class=\"btn btn-danger\" style=\"width: 50%;\" onclick=\"location.href='reserve.html';\" value=\"Reserver Online Now\" />\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("<br>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!--Footer Start-->\n");
      out.write("\t<div id=\"foot\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
      out.write("\t\t\t\t<h4>Links</h4>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">About Us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Gallery</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Contact Us</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
      out.write("\t\t\t\t<h4>What We Do</h4>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Car Wash</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Engine Cleaning</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Brake Fluid Change</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Engine Scanning</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
      out.write("\t\t\t\t<h4>Location</h4>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t\t<address>\n");
      out.write("\t\t\t\t\tNo 99,\n");
      out.write("                                        Passara Road,\n");
      out.write("                                        Badulla,\n");
      out.write("                                        LK.\n");
      out.write("\t\t\t\t</address>\n");
      out.write("\t\t\t\t<a href=\"conatctus.html\">Questions?</a>\n");
      out.write("\t\t\t\t<hr class=\"hidden-md hidden-lg\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
      out.write("\t\t\t\t<h4>Get Latest Offers</h4>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t\t<p>Get latest offers and discounts</p>\n");
      out.write("\t\t\t\t<form method=\"post\" action=\"\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"email\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Subscribe\" class=\"btn btn-info \">\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t\t<h4>Connect Us</h4>\n");
      out.write("\t\t\t\t<p class=\"social\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("                                <hr>\n");
      out.write("                                    <ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"admin/stafflogin.html\">Staff Login</a></li>         \n");
      out.write("                                    </ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("<div id=\"cright\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t<p class=\"pull-left\">Uva CarCare @2018</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t<p class=\"pull-right\">All Rights Reserved By UWU-CST (Project of CST 243-3)</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
