<%-- 
    Document   : navbar
    Created on : Nov 18, 2018, 11:53:59 AM
    Author     : NanoX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--	Navigation Bar Start-->
	
	<div class="navbar navbar-default" id="navbar">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand home" href="../index.jsp">
					<img src="resources/img/logox.jpg" alt="logo" class="logo">
				</a>
				
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation">
					<span class="sr-only">Toggle Navigation</span>
					<i class="fa fa-align-justify"></i>
				</button>
			</div>
			
			<div class="navbar-collapse navbar-default collapse" id="navigation">
				<div class="padding-nav">
					 <ul class="nav navbar-nav navbar-right">
                                                <%
                                                    if(session.getAttribute("email") != null){
                                                %>
                                                    <li>
                                                        <a href="admin.jsp">Admin</a>
                                                    </li>
                                                <%
                                                    }else{%>
                                                    <li>
                                                        <a href="stafflogin.jsp">Admin</a>
                                                    </li>
                                                <%
                                                    
                                                }
                                                %> 
                                                <li>
                                                    <a href="../tarckappointment.jsp">Track Car</a>
					 	</li>
                                                <%
                                                    if(session.getAttribute("email") != null){
                                                %>
                                                    <li>
                                                        <a href="logout.jsp">Logout</a>
                                                    </li>
                                                <%
                                                    }
                                                %>
					</ul>
				</div>
			</div>
		</div>
	</div>
