<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<meta name="viewport"
		content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="css/bootstrap.min.css ">
		<link rel="stylesheet" href="css/estilo.css ">
	</head>
	<body>
		<jsp:include page="menu.jsp" flush="true" />
		
		<div class="container">
			<br>
			<div id="contenido1">
				<form action="" class="form-horizontal">
					<fieldset> <!--disables para bloquear todo el form-->
						<div class="form-group has-info">
							<section class="main row"> 
								<article class="col-xs-8 col-sm-10  col-md-10 col-lg-1"> 
									<img id="imgSearch" src="images/search.png" class="img-responsive" alt="DoctorLogin">
								</article>
								
								<label for="nombre" class="control-label col-md-2 col-lg-3">Buscar paciente con DNI:</label>
								
								<div class="col-md-10 col-lg-5">
									<input type="text" class="form-control" id="nombre"placeholder="DNI">
								</div>
							
							</section>  
						</div>
					</fielset>
				</form>	
						
			</div>
		</div>
		
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>