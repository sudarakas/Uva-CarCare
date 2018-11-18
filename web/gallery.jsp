<%-- 
    Document   : gallery
    Created on : Nov 18, 2018, 11:16:17 AM
    Author     : NanoX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Gallery - Uva CareCare</title>
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
            <div class="col-lg-3 col-sm-4 col-xs-6"><a title="" href="#"><img class="thumbnail img-responsive" src="resources/img/gallery/s1.jpg"></a></div>
            <div class="col-lg-3 col-sm-4 col-xs-6"><a title="" href="#"><img class="thumbnail img-responsive" src="resources/img/gallery/s2.jpg"></a></div>
            <div class="col-lg-3 col-sm-4 col-xs-6"><a title="" href="#"><img class="thumbnail img-responsive" src="resources/img/gallery/s3.jpg"></a></div>
            <div class="col-lg-3 col-sm-4 col-xs-6"><a title="" href="#"><img class="thumbnail img-responsive" src="resources/img/gallery/s5.jpg"></a></div>
            <div class="col-lg-3 col-sm-4 col-xs-6"><a title="" href="#"><img class="thumbnail img-responsive" src="resources/img/gallery/s6.jpg"></a></div>
            <div class="col-lg-3 col-sm-4 col-xs-6"><a title="" href="#"><img class="thumbnail img-responsive" src="resources/img/gallery/s7.jpg"></a></div>
            <div class="col-lg-3 col-sm-4 col-xs-6"><a title="" href="#"><img class="thumbnail img-responsive" src="resources/img/gallery/s15.jpg"></a></div>
            <div class="col-lg-3 col-sm-4 col-xs-6"><a title="" href="#"><img class="thumbnail img-responsive" src="resources/img/gallery/s16.jpg"></a></div>
            <hr>
            <hr>
        </div>
</div>
<div tabindex="-1" class="modal fade" id="myModal" role="dialog">
  <div class="modal-dialog">
  <div class="modal-content">
    <div class="modal-header">
		<button class="close" type="button" data-dismiss="modal">×</button>
	</div>
	<div class="modal-body">
		
	</div>
	<div class="modal-footer">
		<button class="btn btn-danger" data-dismiss="modal">Close</button>
	</div>
   </div>
  </div>
</div>
<!--Footer Start-->
	<jsp:include page="include/footer.jsp"/>
        
<!--Add JavaScript Files-->
	<script src="resources/js/jquery.min.js"></script>	
	<script src="resources/js/bootstrap.min.js"></script>
        <script src="resources/js/gallery.js"></script>
</body>
</html>
