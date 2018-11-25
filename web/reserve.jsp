<%-- 
    Document   : reserve
    Created on : Nov 18, 2018, 11:17:03 AM
    Author     : NanoX
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Reserve Online - Uva CareCare</title>
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
					<img src='resources/img/3.jpg'>
                                    </div>
				</div>
			</div>
		</div>
	</div>
<!--Contents Start-->
<div id="content" class="container">
	<div class="row">
            <div class="col-md-8 col-md-offset-2">
		<div class="box">
                    <div class="box-header">
			<center>
                            <h2 style="text-transform: uppercase">RESERVE NOW</h2>
                            <p class="text-muted">A state of the art online reservation system has been created for your convenience. 
                                Now make reservations for your next vehicle service from the comfort of your desk. 
                                Simply fill in the short form and click 'Send Request' to make your car care reservation. 
                                Once your request has been sent, a customer service representative will call you to confirm the booking.</p>
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
                                                    <label>Service</label>
                                                    <select name="service" class="form-control" required>    
                                                        <option value="Car Wash Only">Car Wash Only</option>    
                                                        <option value="Auto Car Wash Only">Auto Car Wash Only</option>  
                                                        <option value="Car Vacuum Only">Car Vacuum Only</option>    
                                                        <option value="Auto Car Wash with Vacuum">Auto Car Wash with Vacuum</option>    
                                                        <option value="Car Wash with Vacuum">Car Wash with Vacuum</option>  
                                                        <option value="Car Service">Car Service</option>
                                                    </select>
                                                </div>
                                                <div class="form-group">
                                                        <label>Service Center</label>
                                                        <select name="servicecenter" class="form-control" required>    
                                                            <option value="Badulla">Badulla</option>    
                                                            <option value="Passara">Passara</option>  
                                                            <option value="Hali Ela">Hali Ela</option>    
                                                            <option value="Bandarawela">Bandarawela</option>
                                                        </select>
                                                </div>
                                                <div class="form-group">
							<label>Date</label>
							<input type="date" class="form-control" name="cdate" required>
                                                </div>
                                                <div class="form-group">
							<label>Time</label>
							<select name="ctime" id="field_5" class="form-control"  required>    
                                                            <option value="Choose your time" selected="">Choose your time</option>  
                                                            <option value="7am to 9am">7am to 9am</option>  
                                                            <option value="9am to 11am">9am to 11am</option>    
                                                            <option value="11am to 1pm">11am to 1pm</option>    
                                                            <option value="1pm to 3pm">1pm to 3pm</option>  
                                                            <option value="3pm to 5pm">3pm to 5pm</option>  
                                                            <option value="5pm to 7pm">5pm to 7pm</option>  
							</select>
                                                </div>
                                                <div class="form-group">
							<label>Message</label>
                                                        <textarea name="cmsg" class="form-control" rows="5"></textarea>
                                                </div>
						<div class="text-center">
							<button type="submit" name="register" class="btn btn-danger" style="width: 50%;">
								<i class="fa fa-car"></i> Reserve Now
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
//Make Reservation
    try{
        String cName = request.getParameter("cname");
        String cEmail = request.getParameter("cemail");
        String cPNo = request.getParameter("cpno");
        String service = request.getParameter("service");
        String serviceCenter = request.getParameter("servicecenter");
        String date = request.getParameter("cdate");
        String time = request.getParameter("ctime");
        String cmsg = request.getParameter("cmsg");
    
        String reserveSql = "INSERT INTO appoinment(InvoiceNo, Name, Email, PhoneNo, Service, ServiceCenter, Date, Time, Message,Status) VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareCall(reserveSql);
        //Statement st = conn.prepareStatement(reserveSql);
        
        String invoiceNo = "";
        String possible = "1234567890";
        for (int i = 0; i < 10; i++) {
            invoiceNo += possible.charAt((int)Math.floor(Math.random()*possible.length()));
        }
        
        pst.setString(1, invoiceNo);
        pst.setString(2, cName);
        pst.setString(3, cEmail);
        pst.setString(4, cPNo);
        pst.setString(5, service);
        pst.setString(6, serviceCenter);
        pst.setString(7, date);
        pst.setString(8, time);
        pst.setString(9, cmsg);
        pst.setString(10, "New");
        
        
        int insertData = pst.executeUpdate();
        if(insertData > 0){
        %>
            <script>alert("Appointment submitted successfully");</script>
        <%
        }else{
        %>
            <script>alert("Something Worng! Please check back later");</script>
        <%
        }
        
    }catch(Exception e){
            out.print(e);
    } 
%>
</body>
</html>