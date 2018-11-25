package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class approve_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Approve</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--DB Connection -->\n");
      out.write("        ");

            Connection conn = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare", "", "");
            
      out.write("\n");
      out.write("            ");

            }catch(Exception e){
            
      out.write(" \n");
      out.write("                <script>alert(\"Connection Dead\");</script>\n");
      out.write("            ");

            }
        
      out.write("\n");
      out.write("        ");

            try{
            String appId = request.getParameter("appId");
            String approveAppointSql = "UPDATE appoinment SET Status='Approved' WHERE appoinmentId='"+appId+"'";
            PreparedStatement pst = conn.prepareCall(approveAppointSql);
            
            int update = pst.executeUpdate();
            
            if(update > 0){
            
      out.write("\n");
      out.write("                <script>alert(\"Appointment Approved Successfully\");</script>\n");
      out.write("            ");

                response.sendRedirect("newappointment.jsp");
            }else{
            
      out.write("\n");
      out.write("                <script>alert(\"Somthing Wrong\");</script>\n");
      out.write("            ");
 
                response.sendRedirect("newappointment.jsp");
            }
        }catch(Exception e){
            out.print(e);
        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <!--Add JavaScript Files-->\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\t\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
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
