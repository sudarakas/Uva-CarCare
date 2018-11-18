<%-- 
    Document   : index
    Created on : Nov 18, 2018, 11:14:54 AM
    Author     : NanoX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Uva CareCare - Badulla</title>
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
                                    <div class='item'>
					<img src='resources/img/3.jpg'>
                                    </div>
                                    <div class='item'>
					<img src='resources/img/4.jpg'>
                                    </div>
                                    <div class='item'>
					<img src='resources/img/5.jpg'>
                                    </div>
				</div>
			</div>
		</div>
	</div>
<!--Contents Start-->
<div id="content" class="container">
	<div class="row">
            <div class="col-md-12">
                <div class="col-lg-3 col-md-3">
                    <h3 class="text-primary"><i class="fa fa-car"></i> Welcome</h3>
                        <p style='line-height:200%;'>
                                We at Uva Car Care offer convenient and quality driven services for your vehicle. 	
                                From a basic exterior wash to more specialized interior detailing.
                        </p>
                        
                </div>
                <div class="col-lg-3 col-md-3">
                    <h3 class="text-primary"><i class="fa fa-neuter"></i> About Us</h3>
                        <p style='line-height:200%;'>
                                Uva Car Care division was initiated in the year 2018 as a separate Strategic Business 	
                                Unit (SBU) of NanoLabs PVT Limited.   
                        </p>
                </div>
                <div class="col-lg-3 col-md-3">
                    <h3 class="text-primary"><i class="fa fa-car"></i> Service Categories</h3>
                        <ul class="listx">
                            <li>Car Wash Packages</li>
                            <li>Detailing Services</li>
                            <li>Lubrication Services</li>
                            <li>Wheel Alignment</li>
                            <li>Specialised Services</li>
                        </ul>
                        
                </div>
                <div class="col-lg-3 col-md-3">
                    <h3 class="text-primary"><i class="fa fa-gift"></i>Promotions</h3>
                        <p>
                            Check out our special promotions and offers at LAUGFS Car Care Service Centres. Stay 	tuned to our website for more details. 
                        </p>
                        
                </div>
            </div>
            
<!--            Image Start-->
            <div class="col-md-12 text-center">
                <img src="resources/img/car.png" class=""><br><br>
                <input type="button" class="btn btn-danger" style="width: 50%;" onclick="location.href='reserve.jsp';" value="Reserver Online Now" />
                <br>
                <br>
                <br>
            </div>
<br>
	</div>
</div>
	

<!--Footer Start-->
<jsp:include page="include/footer.jsp"/>

<!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>

