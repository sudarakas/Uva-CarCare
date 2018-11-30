<%-- 
    Document   : finishjob
    Created on : Dec 1, 2018, 1:46:09 AM
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
                    <h3 class="text-success text-uppercase text-center" style="font-weight: 600">Completed Jobs</h3>
                    <div class="panel panel-success">
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
                                            <th>Complete</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
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
                                               <td><a href='complete.jsp?invoiceNo=<%out.print(rt.getString(2));%>' class='btn btn-success btn-sm'>Completed</a></td>
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