<%-- 
    Document   : aboutus
    Created on : Nov 18, 2018, 11:19:07 AM
    Author     : NanoX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>AboutUs - Uva CareCare</title>
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
					<img src='resources/img/about.jpg'>
                                    </div>
				</div>
			</div>
		</div>
	</div>
<!--Contents Start-->
<div id="content" class="container">
	<div class="row">
            <div class="col-lg-6">
                    <div style="position: relative;color: #FFC107;font-weight: 800;text-transform: uppercase;" class="topic">
                        <h2>About Uva Car Care</h2>
                    </div>

                </div>
                <div class="clearfix"></div>
                <div class="col-lg-7">
                    <ol class="breadcrumb">
                        <li><a href="index.html">Home</a>
                        </li>
                        <li class="active">About</li>
                    </ol>
                </div>

            </div>

            <div class="row">
                <div class="col-md-7">		
  									                    
		  <h2 style="position: relative;color:#222;font-weight: 200;">Our Vision</h2>   
                    <hr/>    
                    <p style="background:#ededed; padding: 15px; min-height: 85px; border-top:2px solid #ffcb08; ">
                           To be the most trusted, recognized and respected solution provider in the automobile industry in Sri Lanka</p>
                    <h2 style="position: relative;color:#222;font-weight: 200;">Our Mission</h2>  
                    <hr/>       
                    <p style="background:#ededed; padding: 15px; min-height: 80px; border-top:2px solid #ffcb08; ">            
                            We strive to provide the best quality automobile product and services through conveniently located Car Care Service Centre’s, at affordable prices by making our brand a consumers’ first choice for automobile product and service supports. Trust will be gained from consumers through the genuine support given to them by our skilled and dedicated service staff.  We are committed to deliver our service values and we are proud of our customized service
		    </p>
                    <br/><br/>
					
                    <h2 style="position: relative;color:#222;font-weight: 200;">Our Values</h2>	
                    <hr/>             
                    <ul class="sde wow fadeInUp" style="background:#ededed; padding: 15px; min-height: 80px; border-top:2px solid #ffcb08;">	
                        <li>We act with integrity and we are honest about our work in order to be fair & ethical.</li>						
                        <li>We develop a long term relationship with our stakeholders by practising fair principles.</li>
                        <li>We will maintain highest standards in professional diagnosis service & repair using state of the art equipment & quality auto parts for our customers.</li>
                    </ul>
                    <br/>	
					
                </div>	
                <div style="position: relative" class="col-lg-5 col-md-5">     
                    <div id="slider2" class="nivoSlider  theme-default">  
                        <img src="resources/img/about2.jpg" class="img-responsive">        
                    </div>    
                </div>	
                <div class="col-md-6">								

                    <div id="slider" class="nivoSlider  theme-default wow bounceInLeft"  data-wow-delay="0.7s">                <img src="images/banners/s7.jpg" alt="" data-transition="fade" data-thumb="images/banners/s4.jpg"  title="" />            </div>		
                </div>

                <div class="clearfix"></div>
                <div class="col-md-6">

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
