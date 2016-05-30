<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login Asministrador</title>
		<meta name="viewport"
		content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="css/bootstrap.min.css ">
		<link rel="stylesheet" href="css/estilo.css ">
	</head>
	<body>
		<jsp:include page="menu.jsp" flush="true" />
		
		<div class="container">
			<div id="contenido">
				<div id="izq">
					
						<article class="col-xs-8 col-sm-10  col-md-10 col-lg-8"> 
							<img id="imgAdmin" src="images/adminlogin.png" class="img-responsive" alt="DoctorLogin">
						</article> 
					
				</div>
				
				<div id="der">
					<form action="login" method="get" class="form-horizontal">
						<fieldset> <!--disables para bloquear todo el form-->
							<div class="form-group has-success">
								<label for="nombre" class="control-label col-md-2 col-lg-3">Nombre:</label>
								<div class="col-md-10 col-lg-12">
									<input type="text" class="form-control" id="nombre"placeholder="Nombre">
								</div>
							</div>	
					
							<div class="form-group has-error">
								<label for="correo" class="control-label col-md-2 col-lg-3">Pasword:</label>
								<div class="col-md-10 col-lg-12">
									<input type="text" class="form-control" id="clave" placeholder="Correo">
									<!--disabled permite bloquear propiedades-->
								</div>
							</div>
					
							<div class="form-group">
								<div class="col-md-2 col-md-offset-2">
									<button  class="btn btn-info">Iniciar sesion</button>
								</div>
							</div>
						</fielset>
					</form>
				</div>	
			
			</div>
		</div>
		
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>