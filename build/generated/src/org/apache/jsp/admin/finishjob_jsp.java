package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class finishjob_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     ");

        if(session.getAttribute("email") == null){
            response.sendRedirect("stafflogin.jsp");
        }
    
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Approved Appointments - Uva CareCare</title>\n");
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!--DB Connection -->\n");
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
      out.write("<!--Contents Start-->\n");
      out.write("<div id=\"content\" class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"box\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                    <h3 class=\"text-primary text-uppercase text-center\" style=\"font-weight: 600\">Approved Appointments</h3>\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"panel-title\">\n");
      out.write("                                <i class=\"fa fa-desktop\"></i> View Details\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-bordered table-striped\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Id</th>\n");
      out.write("                                            <th>InvoiceNo</th>\n");
      out.write("                                            <th>Name</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            <th>PNo</th>\n");
      out.write("                                            <th>Service</th>\n");
      out.write("                                            <th>Center</th>\n");
      out.write("                                            <th>Date</th>\n");
      out.write("                                            <th>Time</th>\n");
      out.write("                                            <th>Msg</th>\n");
      out.write("                                            <th>Approve</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");

                                            String userType = String.valueOf(session.getAttribute("utype"));
                                            String uid = String.valueOf(session.getAttribute("uid"));
                                            String sql;
                                            if(userType.equalsIgnoreCase("Admin")){
                                                sql = "SELECT * FROM appoinment WHERE InvoiceNo IN (SELECT InvoiceNo FROM job WHERE 1)";
                                            }else{
                                                 sql = "SELECT * FROM appoinment WHERE InvoiceNo IN (SELECT InvoiceNo FROM job WHERE empId='"+uid+"')";
                                            }
                                            
                                            
                                            PreparedStatement pst = conn.prepareCall(sql);
                                            ResultSet rt = pst.executeQuery();
                                            
                                            while(rt.next()){
                                           
      out.write("\n");
      out.write("                                           <tr>\n");
      out.write("                                               <td>");
out.print(rt.getString(1));
      out.write("</td>\n");
      out.write("                                               <td>");
out.print(rt.getString(2));
      out.write("</td>\n");
      out.write("                                               <td>");
out.print(rt.getString(3));
      out.write("</td>\n");
      out.write("                                               <td>");
out.print(rt.getString(4));
      out.write("</td>\n");
      out.write("                                               <td>");
out.print(rt.getString(5));
      out.write("</td>\n");
      out.write("                                               <td>");
out.print(rt.getString(6));
      out.write("</td>\n");
      out.write("                                               <td>");
out.print(rt.getString(7));
      out.write("</td>\n");
      out.write("                                               <td>");
out.print(rt.getString(8));
      out.write("</td>\n");
      out.write("                                               <td>");
out.print(rt.getString(9));
      out.write("</td>\n");
      out.write("                                               <td>");
out.print(rt.getString(10));
      out.write("</td>\n");
      out.write("                                               <td><a href='complete.jsp?invoiceNo=");
out.print(rt.getString(2));
      out.write("' class='btn btn-warning btn-sm'>Complted</a></td>\n");
      out.write("                                           </tr>\n");
      out.write("                                           ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("<!--Footer Start-->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("<!--Add JavaScript Files-->\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\n");
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
