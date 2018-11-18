<%-- 
    Document   : admin
    Created on : Nov 18, 2018, 11:51:51 AM
    Author     : NanoX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin - Uva CareCare</title>
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
					<img src='resources/img/5.jpg'>
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
                            <h2 style="text-transform: uppercase">Admin Area</h2>
			</center>
                    </div>
                    <br><br><br>
                    <div class="col-md-12">
                        <div class="col-md-3">
                            <input type="button" class="btn btn-primary" style="width: 100%;" onclick="location.href='reserve.html';" value="New Appointments" />
                        </div>
                        <div class="col-md-3">
                            <input type="button" class="btn btn-primary" style="width: 100%;" onclick="location.href='reserve.html';" value="Duty Assign" />
                        </div>
                        <div class="col-md-3">
                            <input type="button" class="btn btn-primary" style="width: 100%;" onclick="location.href='reserve.html';" value="Finish Jobs" />
                        </div>
                        <div class="col-md-3">
                            <input type="button" class="btn btn-primary" style="width: 100%;" onclick="location.href='reserve.html';" value="All Appointments" />
                        </div>
                    </div>
                    <br><br><br>
                    <div class="col-md-12">
                        <div class="col-md-3">
                            <input type="button" class="btn btn-primary" style="width: 100%;" onclick="location.href='reserve.html';" value="Add Employee" />
                        </div>
                        <div class="col-md-3">
                            <input type="button" class="btn btn-primary" style="width: 100%;" onclick="location.href='reserve.html';" value="View Employee" />
                        </div>
                        <div class="col-md-3">
                            <input type="button" class="btn btn-primary" style="width: 100%;" onclick="location.href='reserve.html';" value="Track Orders" />
                        </div>
                        <div class="col-md-3">
                            <input type="button" class="btn btn-primary" style="width: 100%;" onclick="location.href='reserve.html';" value="Rejected Orders" />
                        </div>
                    </div>
					
		</div>
            </div>
	</div>
    <br>
    <br>
    <br>
</div>
	

<!--Footer Start-->
    <jsp:include page="include/footer.jsp"/>
<!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>

