<%-- 
    Document   : reserve
    Created on : Nov 18, 2018, 11:17:03 AM
    Author     : NanoX
--%>

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
							<input type="email" class="form-control" name="cpno" required>
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
							<select name="time" id="field_5" class="form-control"  required>    
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
                                                        <textarea name="msg" class="form-control" rows="5"></textarea>
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
</body>
</html>
