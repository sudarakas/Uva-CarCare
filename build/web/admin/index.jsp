<%-- 
    Document   : index
    Created on : Nov 25, 2018, 6:57:55 PM
    Author     : NanoX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Area - Uva CareCare</title>
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
                            <h2 style="text-transform: uppercase">Welcome to Uva CareCare Admin Zone </h2>
                            <p class="text-muted">Please Login to Continue</p>
			</center>
                    </div>
                    <div class="col-md-12 text-center">
                        <input type="button" class="btn btn-primary" style="width: 50%;" onclick="location.href='stafflogin.jsp';" value="Login Now" />
                    </div>
                    <br>
                    <br>
                    <br>
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
