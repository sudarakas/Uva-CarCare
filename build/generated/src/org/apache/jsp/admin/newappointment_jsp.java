package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;

public final class newappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <title>New Appointments - Uva CareCare</title>\r\n");
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
      out.write("<!--DB Connection -->\r\n");
      out.write("            ");

                Connection conn = null;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare", "root", "");
                
      out.write("\r\n");
      out.write("                ");

                }catch(Exception e){
                
      out.write(" \r\n");
      out.write("                    <script>alert(\"Connection Dead\");</script>\r\n");
      out.write("                ");

                }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Contents Start-->\r\n");
      out.write("<div id=\"content\" class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                    <h3 class=\"text-success text-uppercase text-center\" style=\"font-weight: 600\">New Appointments</h3>\r\n");
      out.write("                    <div class=\"panel panel-success\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <div class=\"panel-title\">\r\n");
      out.write("                                <i class=\"fa fa-car\"></i> View Details\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div class=\"table-responsive\">\r\n");
      out.write("                                <table class=\"table table-bordered table-striped\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>Id</th>\r\n");
      out.write("                                            <th>InvoiceNo</th>\r\n");
      out.write("                                            <th>Name</th>\r\n");
      out.write("                                            <th>Email</th>\r\n");
      out.write("                                            <th>PNo</th>\r\n");
      out.write("                                            <th>Service</th>\r\n");
      out.write("                                            <th>Center</th>\r\n");
      out.write("                                            <th>Date</th>\r\n");
      out.write("                                            <th>Time</th>\r\n");
      out.write("                                            <th>Msg</th>\r\n");
      out.write("                                            <th>Approve</th>\r\n");
      out.write("                                            <th>Reject</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                        ");

                                            String getNewAppoSql = "SELECT * FROM appoinment WHERE Status='New'";
                                            PreparedStatement pst = conn.prepareCall(getNewAppoSql);
                                            ResultSet rt = pst.executeQuery();
                                            
                                            while(rt.next()){
                                           
      out.write("\r\n");
      out.write("                                           <tr>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(1));
      out.write("</td>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(2));
      out.write("</td>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(3));
      out.write("</td>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(4));
      out.write("</td>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(5));
      out.write("</td>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(6));
      out.write("</td>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(7));
      out.write("</td>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(8));
      out.write("</td>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(9));
      out.write("</td>\r\n");
      out.write("                                               <td>");
out.print(rt.getString(10));
      out.write("</td>\r\n");
      out.write("                                               <td><a href='approve.jsp?appId=");
out.print(rt.getString(1));
      out.write("' class='btn btn-success btn-sm'>Approve</a></td>\r\n");
      out.write("                                               <td><a href='reject.jsp?appId=");
out.print(rt.getString(1));
      out.write("' class='btn btn-danger btn-sm'>Reject</a></td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                           ");

                                            }
                                        
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("<!--Footer Start-->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<!--Add JavaScript Files-->\r\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\r\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\r\n");
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
