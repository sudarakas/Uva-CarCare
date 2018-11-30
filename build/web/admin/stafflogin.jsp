<%-- 
    Document   : stafflogin
    Created on : Nov 18, 2018, 11:52:51 AM
    Author     : NanoX
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Staff Login - Uva CareCare</title>
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
                            <h2 style="text-transform: uppercase">Staff login</h2>
                            <p class="text-muted">Uva CarCare Emplyee Login Panel</p>
			</center>
		</div>
                    <form action="" method="post">
			<div class="form-group">
                            <label>Email</label>
                            <input type="email" class="form-control" name="email" required>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" class="form-control" name="pass" required>
                        </div>
                            <div class="text-center">
				<button type="submit" name="login" class="btn btn-danger" style="width: 50%;">
                                    <i class="fa fa-car"></i> Login Now
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
        
        <%
                if(request.getParameter("login") != null){
                    String uname = request.getParameter("email");
                    String pass = request.getParameter("pass");
                    Connection con = null;
    
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uvacarcare","root","");
                    String query = "SELECT * FROM users WHERE Email='"+uname+"' AND Password='"+pass+"'";
                    ResultSet rs;
                    Statement ps;
                    ps = con.createStatement();
                    rs = ps.executeQuery(query);
                    
                    if(rs.next()){
                        String userType = rs.getString("userType");
                        int userId = rs.getInt(1);
                        if(userType.equals("Admin")){
                            
                            session.setAttribute("email",uname);
                            session.setAttribute("utype",userType);
                            session.setAttribute("uid", userId);
                            response.sendRedirect("admin.jsp");
                            
                        }else if(userType.equals("Emp")){
                            
                            session.setAttribute("email",uname);
                            response.sendRedirect("finishjob.jsp");
                            session.setAttribute("uid", userId);
                            session.setAttribute("utype",userType);
                        }
                        else{%>
                            <script>alert("No User Found");</script>
                        <%
                        }
                    }else{
                       %>
                            <script>alert("No User Found");</script>
                        <%
                    }
                }catch(Exception ex){
                    out.println(ex);    
                    
                }
                }
            %>
</body>
</html>

