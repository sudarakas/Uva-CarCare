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
				<a class="navbar-brand home" href="index.jsp">
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
                                                <li>
                                                    <a href="admin.jsp">Admin</a>
					 	</li>
					 	<li>
                                                    <a href="../index.jsp">Home</a>
					 	</li>
					 	<li>
                                                    <a href="../aboutus.jsp">About Us</a>
					 	</li>
					 	<li>
                                                    <a href="../gallery.jsp">Gallery</a>
					 	</li>
					 	<li>
                                                    <a href="../conatctus.jsp">Contact Us</a>
					 	</li>
                                                <li>
                                                    <a href="../tarckappointment.jsp">Track Car</a>
					 	</li>
					 	<li class="blackMe">
                                                    <a href="../reserve.jsp">Reserve Online</a>
					 	</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
