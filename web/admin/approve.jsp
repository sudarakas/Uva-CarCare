<%-- 
    Document   : approve
    Created on : Nov 25, 2018, 11:58:31 PM
    Author     : NanoX
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        if(session.getAttribute("email") == null){
            response.sendRedirect("stafflogin.jsp");
        }
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Approve</title>
    </head>
    <body>
        <!--DB Connection -->
        <%
            Connection conn = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare", "root", "");
            %>
            <%
            }catch(Exception e){
            %> 
                <script>alert("Connection Dead");</script>
            <%
            }
        %>
        <%
            try{
            String appId = request.getParameter("appId");
            String approveAppointSql = "UPDATE appoinment SET Status='Approved' WHERE appoinmentId='"+appId+"'";
            PreparedStatement pst = conn.prepareCall(approveAppointSql);
            
            int update = pst.executeUpdate();
            
            if(update > 0){
            %>
                <script>alert("Appointment Approved Successfully");</script>
            <%
                response.sendRedirect("newappointment.jsp");
            }else{
            %>
                <script>alert("Somthing Wrong");</script>
            <% 
                response.sendRedirect("newappointment.jsp");
            }
        }catch(Exception e){
            out.print(e);
        }
        %>
        
        <!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
    </body>
</html>
