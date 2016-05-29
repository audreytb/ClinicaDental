<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Clinica Dental</title>
	<meta name="viewport"
		content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css ">
	<link rel="stylesheet" href="css/estilo.css ">
</head>
<body>
	
	<jsp:include page="menu.jsp" flush="true" />
	
	<!-- Contenido de la pagina, arriba esta el menu -->
	
	
	<div class="container">
		<section class="main row"> 
			<article class="col-xs-6 col-sm-4  col-md-6  col-lg-6"> 
				<a href="loginAdmin.jsp">
					<img id="docLogin" src="images/admin1.png" class="img-responsive" alt="DoctorLogin">
				</a><br>
				<span class="usuario">
					<h3>Admin</h3>
				</span> 
			</article> 
			
			<article class="col-xs-6 col-sm-4  col-md-6  col-lg-6"> 
				<a href="#">
					<img id="userLogin" src="images/user1.png" class="img-responsive" alt="UserLogin">
				</a><br>
				<span class="usuario">
					<h3>Users</h3>
				</span> 
			</article> 
		</section>
		
		<article id="pie" class="col-lg-12 col-md-9 col-sm-6 hidden-xs ">
			<h1>Ten una hermosa y saludable sonrisa</h1>
		</article>

	</div>
	<footer>
		<div class="container" id="footer">
			<section class="col-xs-4">
				<h5 class="footerMessage">
					<span class="glyphicon glyphicon-ok"></span> Titulo de prueba H5
				</h5>
			</section>
			<section class="col-xs-4">
				<h5 class="footerMessage">
					<span class="glyphicon glyphicon-ok"></span> Titulo de prueba H5
				</h5>
			</section>
			<section class="col-xs-4">
				<h5 class="footerMessage">
					<span class="glyphicon glyphicon-ok"></span> Titulo de prueba H5
				</h5>
			</section>
	
		</div>
	</footer>


	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>