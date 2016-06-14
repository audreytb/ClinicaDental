<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="modelClinicaDental.*"%>
<%@ page import="modelClinicaDental.Query"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%
	
	ArrayList <String> patient=(ArrayList <String>)request.getAttribute("patient");
	ArrayList <String> consultas=(ArrayList <String>)request.getAttribute("consultas");
	//if(!consultas.isEmpty()){}
	List<String> background=(ArrayList<String>)request.getAttribute("background");
	List<String> current=(ArrayList<String>)request.getAttribute("current");
	List<String> diagnosis=(ArrayList<String>)request.getAttribute("diagnosis");
	List<String> forecast=(ArrayList<String>)request.getAttribute("forecast");
	List<String> odontograma=(ArrayList<String>)request.getAttribute("odontograma");
	List<String> discharge=(ArrayList<String>)request.getAttribute("discharge");
	List<String> physical=(ArrayList<String>)request.getAttribute("physical");
	List<String> treatment=(ArrayList<String>)request.getAttribute("treatment");
	List<String> workplan=(ArrayList<String>)request.getAttribute("workplan");
	
	
	//SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Consulta</title>
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
				<form action="/search_Dni" method="get" "form-horizontal">
					<!--disabled para bloquear todo el form-->
						<div class="form-group has-info">
							<section class="main row"> 
								<article class="col-xs-2 col-sm-2  col-md-1 col-lg-1"> 
									<img id="imgSearch" src="images/search.png" class="img-responsive" alt="DoctorLogin">
								</article>
								
								<label for="nombre" class="control-label col-md-4 col-lg-3">Buscar paciente con DNI:</label>
								<div class="col-md-12 col-lg-12">
									<div class="form-group">
										<div class="input-group">
											<input type="text" class="form-control" name="dni" placeholder="DNI">
											<span class="input-group-btn">
												<button class="btn btn-primary">Buscar</button>
											</span>
										</div>	
									</div>
								</div>
								
								<div class="container">
									<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
										<a href="#" title="Ver Anterior Historial"  class="col-xs-3 col-sm-3 col-md-3 col-lg-3 btn btn-info"><span class="hidden-xs">Ver anteriores Historiales</span></a>
										<a href="#" title="Elminar Historial" class="col-xs-3 col-sm-3 col-md-3 col-lg-3 btn btn-danger"><span class="hidden-xs">Eliminar</span></a>
										<a href="nuevaConsulta" title="Nuevo Historial"  class="col-xs-3 col-sm-3 col-md-3 col-lg-3 btn btn-success"><span class="hidden-xs">Ingresar Nuevo Historial</span></a>
									</div>
								</div>
							</section>
						</div>					
				</form>	
				
				
				<!-- Acordeon -->
				<div class="container-fluid">
					<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingOne">
					      <h4 class="panel-title">
					        <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
					         	Historia Clinica
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
					      <div class="panel-body">
					        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
					      </div>
					    </div>
					  </div>
					  
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingTwo">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
					          Identificacion del Cliente
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
					      <div class="panel-body">
					      	
					      	<article class=" col-lg-5 col-md-5 col-sm-5 col-xs-10 "> 
								<img id="imgSearch" src="images/family.png" class="img-responsive" alt="DoctorLogin">
							</article>
					      
					      	<div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
					      		<ul class="list-group">
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-user "></span> Nombre: </li>
									<li class="list-group-item"><%=patient.get(0)%></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-plus-sign "></span> Numero de Historia Clinica: </li>
									<li class="list-group-item"><%=patient.get(1)%></li>
									<li class="list-group-item list-group-item-info"><span class="glyphicon glyphicon-list-alt "></span> Numero de DNI: </li>
									<li class="list-group-item"><%=patient.get(2)%></li>
									<li class="list-group-item list-group-item-warning"><span class="glyphicon glyphicon-sound-5-1 "></span> Fecha y Hora de Atención: </li>
									<li class="list-group-item"><%=patient.get(3)%></li>
									
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-sound-6-1 "></span> Fecha de Apertura de Historia Clinica: </li>
									<li class="list-group-item"><%=patient.get(4) %></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-eye-open "></span> Sexo: </li>
									<li class="list-group-item"><%=patient.get(5)%></li>
									<li class="list-group-item list-group-item-info"><span class="glyphicon glyphicon-sound-7-1 "></span> Edad: </li>
									<li class="list-group-item"><%=patient.get(6)%></li>
									<li class="list-group-item list-group-item-warning"><span class="glyphicon glyphicon-baby-formula"></span> Lugar de Nacimiento: </li>
									<li class="list-group-item"><%=patient.get(7)%></li>
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-calendar"></span> Fecha de Nacimiento: </li>
									<li class="list-group-item"><%=patient.get(8)%></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-education"></span> Grado de Instrucción: </li>
									<li class="list-group-item"><%=patient.get(9)%></li>
									<li class="list-group-item list-group-item-info"><span class="glyphicon glyphicon-tower"></span> Raza: </li>
									<li class="list-group-item"><%=patient.get(10)%></li>
									<li class="list-group-item list-group-item-warning"><span class="glyphicon glyphicon-bishop"></span> Ocupación: </li>
									<li class="list-group-item"><%=patient.get(11)%></li>
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Religion: </li>
									<li class="list-group-item"><%=patient.get(12)%></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-glass"></span> Estado Civil: </li>
									<li class="list-group-item"><%=patient.get(13)%></li>
									<li class="list-group-item list-group-item-info"><span class="glyphicon glyphicon-map-marker"></span> Lugar de Procedencia: </li>
									<li class="list-group-item"><%=patient.get(14)%></li>
									<li class="list-group-item list-group-item-warning"><span class="glyphicon glyphicon-home"></span> Domicilio Actual: </li>
									<li class="list-group-item"><%=patient.get(15)%></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-ok"></span> Nombre y Apellidos del Acompañante: </li>
									<li class="list-group-item"><%=patient.get(16)%></li>
								</ul>
					      	</div>
					      	
					      	
					      </div>
					    </div>
					  </div>
					  
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingThree">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
					          Enfermedad Actual

					        </a>
					      </h4>
					    </div>
					    <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
					      <div class="panel-body">
					      <%if(current.size()>0){ %>
					      <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
					      		<ul class="list-group">
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-user "></span> Nombre: </li>
									<li class="list-group-item"><%=current.get(0)%></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-plus-sign "></span> Numero de Historia Clinica: </li>
									<li class="list-group-item"><%=current.get(1)%></li>
									<li class="list-group-item list-group-item-info"><span class="glyphicon glyphicon-list-alt "></span> Numero de DNI: </li>
									<li class="list-group-item"><%=current.get(2)%></li>
									<li class="list-group-item list-group-item-warning"><span class="glyphicon glyphicon-eye-open "></span> Sexo: </li>
									<li class="list-group-item"><%=current.get(3)%></li>
									
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Edad: </li>
									<li class="list-group-item"><%=current.get(4)%></li>
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Religion: </li>
									<li class="list-group-item"><%=current.get(5)%></li>
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Religion: </li>
									<li class="list-group-item"><%=current.get(6)%></li>
								
							
								</ul>
					      	</div>
					      
					     <%}else{%>	
							<%}%>
					      
					      
					      
					      
					      </div>
					    </div>
					  </div>
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingFour">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
					          Antecedentes
					        </a>
					      </h4>
					    </div>
					    <div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
					      <div class="panel-body">
							
							 <%if(current.size()>0){ %>			      
					        <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
					      		<ul class="list-group">
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-user "></span> Nombre: </li>
									<li class="list-group-item"><%=background.get(0)%></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-plus-sign "></span> Numero de Historia Clinica: </li>
									<li class="list-group-item"><%=background.get(1) %></li>
									
								</ul>
					      	</div>
					      	   <%}else{%>	
							<%}%>
					   
					      </div>
					    </div>
					  </div>
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingFive">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
					         	Exploracion Fisica
					        </a>
					      </h4>
					    </div>
					    <div id="collapseFive" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFive">
					      <div class="panel-body">
					        
					      <%if(current.size()>0){ %>	
							 <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
					      		<ul class="list-group">
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-user "></span> Nombre: </li>
									<li class="list-group-item"><%=physical.get(0)%></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-plus-sign "></span> Numero de Historia Clinica: </li>
									<li class="list-group-item"><%=physical.get(1)%></li>
									<li class="list-group-item list-group-item-info"><span class="glyphicon glyphicon-list-alt "></span> Numero de DNI: </li>
									<li class="list-group-item"><%=physical.get(2)%></li>
									<li class="list-group-item list-group-item-warning"><span class="glyphicon glyphicon-eye-open "></span> Sexo: </li>
									<li class="list-group-item"><%=physical.get(3)%></li>
									
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Edad: </li>
									<li class="list-group-item"><%=physical.get(4)%></li>
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Religion: </li>
									<li class="list-group-item"><%=physical.get(5)%></li>
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Religion: </li>
									<li class="list-group-item"><%=physical.get(6)%></li>
							 <%}else{%>	
							<%}%>
									
								</ul>
					      	</div>					     
					   
					     
					      </div>
					    </div>
					  </div>
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingSix">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseSix" aria-expanded="false" aria-controls="collapseSix">
					          Diagnostico
					        </a>
					      </h4>
					    </div>
					    <div id="collapseSix" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSix">
					      <div class="panel-body">
					        
					        
					        <%if(current.size()>0){ %>	
							 <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
					      		<ul class="list-group">
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-user "></span> Nombre: </li>
									<li class="list-group-item"><%=diagnosis.get(0)%></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-plus-sign "></span> Numero de Historia Clinica: </li>
									<li class="list-group-item"><%=diagnosis.get(1)%></li>						
								
									
								</ul>
					      	</div>	
					   <%}else{%>	
							<%}%>
					      	
					      						     
					      </div>
					    </div>
					  </div>
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingSeven">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseSeven" aria-expanded="false" aria-controls="collapseSeven">
					          Plan de Trabajo
					        </a>
					      </h4>
					    </div>
					    <div id="collapseSeven" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSeven">
					      <div class="panel-body">
					     	 
					     	<%if(current.size()>0){ %>
							 <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
					      		<ul class="list-group">
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-user "></span> Nombre: </li>
									<li class="list-group-item"><%=workplan.get(0)%></li>
									
									
								</ul>
					      	</div>
					      	<%}else{%>	
							<%}%>			      
					      
					      </div>
					    </div>
					  </div>
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingEight">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseEight" aria-expanded="false" aria-controls="collapseEight">
					          Pronostico
					        </a>
					      </h4>
					    </div>
					    <div id="collapseEight" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingEight">
					      <div class="panel-body">
					        
					      	<%if(current.size()>0){ %>
					        
							 <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
					      		<ul class="list-group">
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-user "></span> Nombre: </li>
									<li class="list-group-item"><%=forecast.get(0)%></li>

									
								</ul>
					      	</div>	
					      	
					      		<%}else{%>	
							<%}%>		     
					     
					      </div>
					    </div>
					  </div>
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingNine">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseNine" aria-expanded="false" aria-controls="collapseNine">
					         	Tratamiento/Recomendaciones
					        </a>
					      </h4>
					    </div>
					    <div id="collapseNine" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingNine">
					      <div class="panel-body">
					        
					        <%if(current.size()>0){ %>
					        
							 <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
					      		<ul class="list-group">
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-user "></span> Nombre: </li>
									<li class="list-group-item"><%=treatment.get(0)%></li>
									<li class="list-group-item list-group-item-danger"><span class="glyphicon glyphicon-plus-sign "></span> Numero de Historia Clinica: </li>
									<li class="list-group-item"><%=treatment.get(1)%></li>
									<li class="list-group-item list-group-item-info"><span class="glyphicon glyphicon-list-alt "></span> Numero de DNI: </li>
									<li class="list-group-item"><%=treatment.get(2)%></li>
									<li class="list-group-item list-group-item-warning"><span class="glyphicon glyphicon-eye-open "></span> Sexo: </li>
									<li class="list-group-item"><%=treatment.get(3)%></li>
									
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Edad: </li>
									<li class="list-group-item"><%=treatment.get(4)%></li>
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Religion: </li>
									<li class="list-group-item"><%=treatment.get(5)%></li>
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-plus "></span> Religion: </li>
									<li class="list-group-item"><%=treatment.get(6)%></li>
								
									
								</ul>
					      	</div>						     
					     	
					    	<%}else{%>	
							<%}%>	
					     
					      </div>
					    </div>
					  </div>
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingTen">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTen" aria-expanded="false" aria-controls="collapseTen">
					          Odontograma
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTen">
					      <div class="panel-body">
					       
					       
							 <%if(current.size()>0){ %>
							 <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
					      		<ul class="list-group">
									<li class="list-group-item list-group-item-success"><span class="glyphicon glyphicon-user "></span> Nombre: </li>
									<li class="list-group-item"><%=odontograma.get(0)%></li>

									
								</ul>
					      	</div>					      
					      	
					   		<%}else{%>	
							<%}%>	
					      
					      
					      </div>
					    </div>
					  </div>
					  
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingEleven">
					      <h4 class="panel-title">
					        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseEleven" aria-expanded="false" aria-controls="collapseEleven">
					          Enfermedad Actual
					        </a>
					      </h4>
					    </div>
					    <div id="collapseEleven" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingEleven">
					      <div class="panel-body">
					        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
					      </div>
					    </div>
					  </div>
					  
					  
					</div>
				</div>
				 
						
			</div>
		</div>
		
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>