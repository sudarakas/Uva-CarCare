<%-- 
    Document   : viewappointment
    Created on : Nov 25, 2018, 1:09:58 PM
    Author     : NanoX
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>View Appointment - Uva CareCare</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <!--Add CSS Files-->
	<link rel="stylesheet" type="text/css" href="resources/css/styles.css">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet"  type="text/css" href="resources/fontawesome/css/font-awesome.min.css">
	<link href="https://fonts.googleapis.com/css?family=Nunito:200,300,400,700,900" rel="stylesheet">
        
    </head>
    <body>
<!--	Navigation Bar Start-->
	
	<jsp:include page="include/navbar.jsp"/>

	<div class="container" id="slider">
		<div class="col-md-12">
			<div id="slideshow1" class="carousel slide col-md-12" data-ride="carousel">
				<div class="carousel-inner">
                                    <div class='item active'>
					<img src='resources/img/1.jpg'>
                                    </div>
				</div>
			</div>
		</div>
	</div>
<!--Contents Start-->
<div id="content" class="container">
	<div class="row">
            <!--JSP Code Goes Here-->

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
                //Car Status
                String invoiceNo = request.getParameter("invoiceno");

                String getInvoiceStatusSql = "SELECT * FROM appoinment WHERE InvoiceNo='"+invoiceNo+"'";
                PreparedStatement pst = conn.prepareCall(getInvoiceStatusSql);
                ResultSet rt = pst.executeQuery();

                rt.next();

                String cName = rt.getString(3);
                String cEmail = rt.getString(4);
                String cPNo = rt.getString(5);
                String service = rt.getString(6);
                String serviceCenter = rt.getString(7);
                String date = rt.getString(8);
                String time = rt.getString(9);
                String cmsg = rt.getString(10);
                String cstatus = rt.getString(11); 
            %>
                <div class="col-lg-12">
                    <h3 class="text-success text-uppercase text-center" style="font-weight: 600">Current Status : <% out.print(cstatus); %></h3>
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <div class="panel-title">
                                <i class="fa fa-car"></i> View Details
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped">
                                    <thead>
                                        <tr>
                                            <th></th>
                                            <th>Details</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th>Your Name</th>
                                            <th><%out.print(cName);%></th>
                                        </tr>
                                        <tr>
                                            <th>Your Email</th>
                                            <th><%out.print(cEmail);%></th>
                                        </tr>
                                        <tr>
                                            <th>Your Phone No</th>
                                            <th><%out.print(cPNo);%></th>
                                        </tr>
                                        <tr>
                                            <th>Requested Service</th>
                                            <th><%out.print(service);%></th>
                                        </tr>
                                        <tr>
                                            <th>Selected Service Center</th>
                                            <th><%out.print(serviceCenter);%></th>
                                        </tr>
                                        <tr>
                                            <th>Service Date</th>
                                            <th><%out.print(date);%></th>
                                        </tr>
                                        <tr>
                                            <th>Selected Time</th>
                                            <th><%out.print(time);%></th>
                                        </tr>
                                        <tr>
                                            <th>Message</th>
                                            <th><%out.print(cmsg);%></th>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
    </div>	

<!--Footer Start-->
    <jsp:include page="include/footer.jsp"/>
    
<!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>

