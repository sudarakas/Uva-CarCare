<%-- 
    Document   : logout
    Created on : Nov 30, 2018, 10:17:34 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    session.invalidate();
    response.sendRedirect("stafflogin.jsp");
%>
