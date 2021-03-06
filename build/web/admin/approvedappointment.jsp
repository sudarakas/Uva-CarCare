<%-- 
    Document   : approvedappointment
    Created on : Nov 30, 2018, 10:19:50 PM
    Author     : NanoX
--%>

<%@page import="java.sql.ResultSet"%>
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
        if(!session.getAttribute("utype").equals("Admin")){
            response.sendRedirect("finishjob.jsp");
        }
    %>
    <head>
        <title>Approved Appointments - Uva CareCare</title>
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

<!--Contents Start-->
<div id="content" class="container">
	<div class="row">
		<div class="box">
                    <div class="col-lg-12">
                    <h3 class="text-primary text-uppercase text-center" style="font-weight: 600">Approved Appointments</h3>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="panel-title">
                                <i class="fa fa-desktop"></i> View Details
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>InvoiceNo</th>
                                            <th>Name</th>
                                            <th>Email</th>
                                            <th>PNo</th>
                                            <th>Service</th>
                                            <th>Center</th>
                                            <th>Date</th>
                                            <th>Time</th>
                                            <th>Msg</th>
                                            <th>Approve</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            String getNewAppoSql = "SELECT * FROM appoinment WHERE Status='Approved'";
                                            PreparedStatement pst = conn.prepareCall(getNewAppoSql);
                                            ResultSet rt = pst.executeQuery();
                                            
                                            while(rt.next()){
                                           %>
                                           <tr>
                                               <td><%out.print(rt.getString(1));%></td>
                                               <td><%out.print(rt.getString(2));%></td>
                                               <td><%out.print(rt.getString(3));%></td>
                                               <td><%out.print(rt.getString(4));%></td>
                                               <td><%out.print(rt.getString(5));%></td>
                                               <td><%out.print(rt.getString(6));%></td>
                                               <td><%out.print(rt.getString(7));%></td>
                                               <td><%out.print(rt.getString(8));%></td>
                                               <td><%out.print(rt.getString(9));%></td>
                                               <td><%out.print(rt.getString(10));%></td>
                                               <td><a href='duty.jsp?invoiceNo=<%out.print(rt.getString(2));%>' class='btn btn-primary btn-sm'>Assign Job</a></td>
                                           </tr>
                                           <%
                                            }
                                        %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
		</div>
            </div>
	</div>
    <br>
    <br>
    <br>
<!--Footer Start-->
    <jsp:include page="include/footer.jsp"/>
<!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>