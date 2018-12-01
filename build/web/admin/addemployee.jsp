<%-- 
    Document   : addemployee
    Created on : Nov 18, 2018, 11:17:03 AM
    Author     : NanoX
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.util.Properties"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Add Employee - Uva CareCare</title>
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

	
<!--Contents Start-->
<div id="content" class="container">
	<div class="row">
            <div class="col-md-8 col-md-offset-2">
		<div class="box">
                    <div class="box-header">
			<center>
                            <h2 style="text-transform: uppercase">ADD EMPLOYEE</h2>
                            
			</center>
					</div>
					<form action="" method="post">
						<div class="form-group">
							<label>Name</label>
							<input type="text" class="form-control" name="cname" required>
						</div>
						<div class="form-group">
							<label>Email</label>
							<input type="email" class="form-control" name="cemail" required>
                                                </div>
                                                <div class="form-group">
							<label>Phone No</label>
                                                        <input type="text" class="form-control" name="cpno" pattern="[0]{1}[0-9]{9}" onchange="this.setCustomValidity(this.validity.patternMismatch ? 'Phone is not valid, Please enter a valid phone number' : ''); if(this.checkValidity()) form.cus_cpass.pattern = this.value;" required>
                                                </div>
                                                <div class="form-group">
							<label>NIC</label>
                                                        <input type="text" class="form-control" name="cnic" required>
                                                </div>
                                                <div class="form-group">
                                                    <label>Gender</label>
                                                    <select name="cgender" class="form-control" required>
                                                        <option value="Select Gender">Select Gender</option> 
                                                        <option value="Male">Male</option>    
                                                        <option value="Female">Female</option>  
                                                    </select>
                                                </div>
                                                <div class="form-group">
							<label>Password</label>
                                                        <input type="password" class="form-control" name="cpassword" required> 
                                                </div>
                                                <div class="form-group">
                                                    <label>User Type</label>
                                                    <select name="cusertype" class="form-control" required>
                                                        <option value="Select User Type">Select User Type</option> 
                                                        <option value="Admin">Admin</option>    
                                                        <option value="Emp">Employee</option>  
                                                    </select>
                                                </div>
                                                
                                                
						<div class="text-center">
							<button type="submit" name="addemployee" class="btn btn-danger" style="width: 50%;">
								<i class="fa fa-plus-circle"></i> Add Employee
                                                        </button>
						</div>
                                            
                                            <br>
                                            <br>
					</form>
				</div>
			</div>
	</div>
</div>
	

<!--Footer Start-->
	<jsp:include page="include/footer.jsp"/>

<!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
        
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
//Add Employee
    if(request.getParameter("addemployee") != null){
        try{
            String cName = request.getParameter("cname");
            String cGender = request.getParameter("cgender");
            String cPNo = request.getParameter("cpno");
            String cNIC = request.getParameter("cnic");
            String cEmail = request.getParameter("cemail");
            String cPassword = request.getParameter("cpassword");
            String cUserType = request.getParameter("cusertype");
            

            String addemployeeSql = "INSERT INTO users(Name, Gender, PhoneNo, NIC, Email, Password, userType) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareCall(addemployeeSql);
            //Statement st = conn.prepareStatement(reserveSql);

            

            pst.setString(1, cName);
            pst.setString(2, cGender);
            pst.setString(3, cPNo);
            pst.setString(4, cNIC);
            pst.setString(5, cEmail);
            pst.setString(6, cPassword);
            pst.setString(7, cUserType);

            pst.executeUpdate();

        }catch(Exception e){
                out.print(e);
        } 
    }
%>

</body>
</html>