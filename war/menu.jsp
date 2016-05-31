<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
					data-toggle="collapse" data-target="#navbar-1" >
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
					<li class="active"><a href="consultaPaciente.jsp">Consultar</a></li>
					<li><a href="calendario.jsp">Calendario</a></li>
					<li><a href="registrar.jsp">Registrar</a></li>
					<li><a href="eliminar.jsp">Eliminar</a></li>
				</ul>
			</div>
		</nav>
	</div>

	</header>
