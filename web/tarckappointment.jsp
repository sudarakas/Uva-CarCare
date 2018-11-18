<%-- 
    Document   : tarckappointment
    Created on : Nov 18, 2018, 11:17:48 AM
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
					<img src='resources/img/1.jpg'>
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
                            <h2 style="text-transform: uppercase">Check Appointment</h2>
                            <p class="text-muted">Check Your Appointment Status Online </p>
			</center>
					</div>
					<form action="" method="post">
						<div class="form-group">
							<label>Appointment No</label>
							<input type="text" class="form-control" name="cname" required>
                                                </div>
						<div class="text-center">
							<button type="submit" name="register" class="btn btn-danger" style="width: 50%;">
								<i class="fa fa-arrows"></i> Check Appointment
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
