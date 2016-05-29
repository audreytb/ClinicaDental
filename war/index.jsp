<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<meta name="viewport"
		content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css ">
	<link rel="stylesheet" href="css/estilo.css ">
</head>
<body>
	<header>
	<div class="container">
		<div id="logo">
			<img src="images/logo.png" class="img-responsive"
				alt="Responsive image">
		</div>
		<div id="menu">
			<div class="social-icons">
				<a href="#" class="icon-2"></a> <a href="#" class="icon-1"></a>
			</div>
		</div>


	</div>
	<div class="container" id="main">
		<nav class="navbar navbar-static-top ">
		<div class="navbar-header navbar-inverse">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar-1">
				<!--Con el # vamos estamos diciendole que va apuntar a un Id ="navbar-1 el cual vemos abajo"-->
				<span class="sr-only"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				<!--cada span que pusimos en una rayita en nuestro menu para dispositivos moviles-->
			</button>


		</div>
		<div class="collapse navbar-collapse" id="navbar-1">

			<form action="" class="navbar-form navbar-right role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Buscar">
				</div>
			</form>

			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="">Consultar</a></li>
				<li><a href="">Calendario</a></li>
				<li><a href="">Registrar</a></li>
				<li><a href="">Eliminar</a></li>
			</ul>
		</div>
		</nav>
	</div>

	</header>
	<div class="container">
		<section class="main row"> <article
			class="col-xs-6 col-sm-4  col-md-6  col-lg-6"> <a href="#"><img
			id="docLogin" src="images/admin1.png" class="img-responsive"
			alt="DoctorLogin"></a> <br>
		<span class="usuario"><h3>Admin</h3></span> </article> <article
			class="col-xs-6 col-sm-4  col-md-6  col-lg-6"> <a href="#"><img
			id="userLogin" src="images/user1.png" class="img-responsive"
			alt="UserLogin"></a> <br>
		<span class="usuario"><h3>Users</h3></span> </article> </section>
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