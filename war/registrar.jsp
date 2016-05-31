<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registrar</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css ">
	<link rel="stylesheet" href="css/estilo.css ">
</head>
<body>
	<jsp:include page="menu.jsp" flush="true" />
	<br>
	<div class="container">
		<div id="contenido1">
			<div class="container-fluid">
				<article class="col-lg-2 col-md-2 col-sm-3 col-xs-12 "> 
					<img id="imgAdmin" src="images/user_add.png" class="img-responsive" alt="DoctorLogin">
				</article>
				
				<article class="col-lg-10 col-md-9 col-sm-8 col-xs-12 ">
					<h3>Nuevo Registro de Usuario</h3>
				</article> 
				<br>
				<form action="" class="form-horizontal" >
					<div class="form-group ">
						<label for="Nombre&Apellidos" class="control-label col-lg-2 col-md-3 col-sm-3 col-xs-12">Nombre y Apellidos Completos:</label>
						<div class="col-lg-7 col-md-6 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="nombre&apellidos" placeholder="Nombres y Apellidos"><br>
						</div>
						
						<label for="Numero de Histaria Clinica" class="control-label col-lg-2 col-md-2 col-sm-3 col-xs-12">Numero de Historia Clinica</label>
						<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="numeroHistClin" placeholder="Numero"><br>
						</div>
						
						<label for="Dni" class="control-label col-lg-1 col-md-3 col-sm-3 col-xs-12">Numero de DNI:</label>
						<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="dni"placeholder="DNI"><br>
						</div>
						
						<label for="Fecha&Hora" class="control-label col-lg-2 col-md-2 col-sm-3 col-xs-12">Fecha y Hora de Atención:</label>
						<div class="col-lg-4 col-md-3 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="fecha&hora" placeholder="Fecha y Hora de Atencion"><br>
						</div>
						
						<label for="Fecha&HoraAp" class="control-label col-lg-2 col-md-3 col-sm-3 col-xs-12">Fecha de Apertura de Historia Clinica:</label>
						<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="fecha&horaAp" placeholder="Fecha y Hora de Apertura"><br>
						</div>
						
						<label for="Sexo" class="control-label col-lg-2 col-md-2 col-sm-3 col-xs-12">Sexo:</label>
						<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="sexo" placeholder="Sexo">
						</div>
						
						<label for="Edad" class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">Edad:</label>
						<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="edad" placeholder="Edad">
						</div>
						
						<label for="Lugar de Nacimiento" class="control-label col-lg-2 col-md-2 col-sm-3 col-xs-12">Lugar de Nacimiento:</label>
						<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="lugNac" placeholder="Lugar de Nacimiento"><br>
						</div>
						
						<label for="Fecha de Nacimiento" class="control-label col-lg-2 col-md-2 col-sm-3 col-xs-12">Fecha de Nacimiento:</label>
						<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="fechNac" placeholder="Fecha de Nacimiento">
						</div>
						
						<label for="Grado de Instruccion" class="control-label col-lg-1 col-md-2 col-sm-3 col-xs-12">Grado de Instrucción:</label>
						<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="gradInst" placeholder="Grado de Instruccion">
						</div>
						
						<label for="Raza" class="control-label col-lg-2 col-md-1 col-sm-3 col-xs-12">Raza:</label>
						<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="raza" placeholder="Raza"><br>
						</div>
						
						<label for="Ocupacion" class="control-label col-lg-2 col-md-2 col-sm-3 col-xs-12">Ocupación:</label>
						<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="ocupacion" placeholder="Ocupacion">
						</div>
						
						<label for="Religion" class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">Religión:</label>
						<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="religion" placeholder="Religion">
						</div>
						
						<label for="Estado Civil" class="control-label col-lg-2 col-md-2 col-sm-3 col-xs-12">Estado Civil:</label>
						<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
							<input type="text" class="form-control" id="estadoCivil" placeholder="Estado Civil">
						</div>
						
						<label for="Lugar de procedencia" class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">Lugar de Procedencia:</label>
						<div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
							<input type="text" class="form-control" id="lugProc" placeholder="Lugar de Procedencia"><br>
						</div>
						
						<label for="Domicilio Actual" class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">Domicilio Actual:</label>
						<div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
							<input type="text" class="form-control" id="domAct" placeholder="Domicilio Actual"><br>
						</div>
						
						<label for="Nombre&ApellidosAc" class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">Nombre y Apellidos del Acompañante:</label>
						<div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
							<input type="text" class="form-control" id="nombre&apellidosAc" placeholder="Nombres y Apellidos del Acompañante">
						</div>
						
					</div>
					<div class="form-group container-fluid" >
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<button id="boton1" class="btn btn-success">Registrar Nuevo Paciente</button>
							

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