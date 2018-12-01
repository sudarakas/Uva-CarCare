package org.apache.jsp.admin;

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

public final class addemployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                            <h2 style=\"text-transform: uppercase\">ADD EMPLOYEE</h2>\r\n");
      out.write("                            \r\n");
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
      out.write("\t\t\t\t\t\t\t<label>NIC</label>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"cnic\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label>Gender</label>\r\n");
      out.write("                                                    <select name=\"cgender\" class=\"form-control\" required>\r\n");
      out.write("                                                        <option value=\"Select Gender\">Select Gender</option> \r\n");
      out.write("                                                        <option value=\"Male\">Male</option>    \r\n");
      out.write("                                                        <option value=\"Female\">Female</option>  \r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Password</label>\r\n");
      out.write("                                                        <input type=\"password\" class=\"form-control\" name=\"cpassword\" required> \r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label>User Type</label>\r\n");
      out.write("                                                    <select name=\"cusertype\" class=\"form-control\" required>\r\n");
      out.write("                                                        <option value=\"Select Gender\">Select User Type</option> \r\n");
      out.write("                                                        <option value=\"Male\">Admin</option>    \r\n");
      out.write("                                                        <option value=\"Female\">Employee</option>  \r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                \r\n");
      out.write("                                                \r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" name=\"addemployee\" class=\"btn btn-danger\" style=\"width: 50%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-plus-circle\"></i> Add Employee\r\n");
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
  
//Add Employee
    if(request.getParameter("addemployee") != null){
        try{
            String cName = request.getParameter("cname");
            String cGender = request.getParameter("cgender");
            String cPNo = request.getParameter("cpno");
            String cNIC = request.getParameter("cnic");
            String cEmail = request.getParameter("cemail");
            String cPassword = request.getParameter("cpassword");
            String cUserType = request.getParameter("cusertype");
            

            String addemployeeSql = "INSERT INTO users(Name, Gender, PhoneNo, NIC, Email, Password, userType) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareCall(addemployeeSql);
            //Statement st = conn.prepareStatement(reserveSql);

            

            pst.setString(1, cName);
            pst.setString(2, cGender);
            pst.setString(3, cPNo);
            pst.setString(4, cNIC);
            pst.setString(5, cEmail);
            pst.setString(6, cPassword);
            pst.setString(7, cUserType);

            

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
