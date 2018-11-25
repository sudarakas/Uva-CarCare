<%-- 
    Document   : dbcfg
    Created on : Nov 25, 2018, 12:40:38 AM
    Author     : NanoX
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
    <%
    Connection conn = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare", "root", "");
    %>
    <%
    }catch(Exception e){
    %> 
        <script>alert('Connection Dead')</script>
    <%
    }
    %>
    </body>
</html>


