<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Administrador</title>
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<link rel="stylesheet" href="css/bootstrap.min.css ">
<link rel="stylesheet" href="css/estilo.css ">
</head>
<body>
	<jsp:include page="menu.jsp" flush="true" />
	<br>
	<div class="container">
		<div id="contenido1">
			<div id="container-fluid">

				<form action="/login" method="get" class="form-horizontal">
					<div class=container-fluid>
						<article class="col-xs-12 col-sm-3  col-md-3 col-lg-3">
							<img id="imgAdmin" src="images/adminlogin.png" class="img-responsive" alt="DoctorLogin"> 
						</article>
						<div class="form-group">
							<label for="nombre" class="control-label col-lg-2 col-md-2 col-sm-2">Usuario:</label>
							<div class=" col-lg-6 col-md-8 col-sm-8">
								<input type="text" name="nombre" class="form-control" id="usuario" placeholder="Usuario"><br>
							</div>
							
							<label for="nombre" class="control-label col-lg-2 col-md-2 col-sm-2">Password:</label>
							<div class=" col-lg-6 col-md-8 col-sm-8">
								<input type="text" name="clave" class="form-control " id=password" placeholder="Password"><br>
							</div>
							
							<label for="boton" class="control-label col-lg-2 col-md-2 col-sm-2"></label>
							<div class="col-lg-6 col-md-8 col-sm-8">
								<button type="submit" class="btn btn-info">Iniciar sesion</button>
							</div>
							
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>


	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>