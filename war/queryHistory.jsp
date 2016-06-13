<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="modelClinicaDental.*"%>
<%@ page import="modelClinicaDental.Query"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

    
 <%
	
	Patient patient = (Patient) request.getAttribute("patient");
	List<Query> consultas = (List<Query>) request.getAttribute("consultas");
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
		<title>Nuevo Historial</title>
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
			<div class="container-fluid">
			
				<article class="col-lg-2 col-md-2 col-sm-3 col-xs-12 "> 
					<img id="imgAdmin" src="images/icon-dentist.png" class="img-responsive" alt="DoctorLogin">
				</article> 
				<article class="col-lg-10 col-md-9 col-sm-8 col-xs-12 ">
					<h1>Nuevo Historial Clinico</h1>
				</article>
				
				<div class="row">
				<div class="col-md-12 col-lg-12">
					<div tole="tabpanel">
						<ul class="nav nav-tabs" role="tablist">
							<li role="presentation" class="active"><a href="#seccion1"aria-controls="seccion1"data-toggle="tab" role="tab">Enfermedad Actual</a></li>
							<li role="presentation"><a href="#seccion2"aria-controls="seccion2"data-toggle="tab" role="tab">Antecedentes</a></li>
							<li role="presentation"><a href="#seccion3"aria-controls="seccion3"data-toggle="tab" role="tab">Exploracion Fisica</a></li>
							<li role="presentation"><a href="#seccion4"aria-controls="seccion4"data-toggle="tab" role="tab">Diagnostico</a></li>
							<li role="presentation"><a href="#seccion5"aria-controls="seccion5"data-toggle="tab" role="tab">Plan de Trabajo</a></li>
							<li role="presentation"><a href="#seccion6"aria-controls="seccion6"data-toggle="tab" role="tab">Pronostico</a></li>
							<li role="presentation"><a href="#seccion7"aria-controls="seccion7"data-toggle="tab" role="tab">Tratamiento</a></li>
							<li role="presentation"><a href="#seccion8"aria-controls="seccion8"data-toggle="tab" role="tab">Odontograma</a></li>
						</ul>

						<div class="tab-content">
							
							<div role="tabpanel"class="tab-pane active"id="seccion1">
								<div class=container-fluid>
									<h3>Enfermedad Actual</h3>
									<form action="newCurrent_Illness" method="post" class="form-horizontal" >
									<%if(current.size()>0){ %>
										<div class="form-group container-fluid">
											<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="enfermedad_actual" ><%=current.get(0)%></textarea>
										</div>
										
										<div class="form-group ">
											<label for="nombre" class="control-label col-md-2 col-lg-2">Datos del Informante:</label>
											<div class="col-md-10 col-lg-10">

												<input type="text" class="form-control" id="nombre" name="data_reporting" value="<%=current.get(1)%>">

											</div>
										</div>	
								
										<div class="form-group ">
											<label for="motConsulta" class="control-label col-md-2 col-lg-2">Motivos de Consulta:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="motivos" name="reason_consultation" value="<%=current.get(2)%>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="Enfermedad" class="control-label col-md-2 col-lg-2">Tipo de Enfermedad:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="enfermedad" name="sick_time" value="<%=current.get(3)%>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="Sig/sin" class="control-label col-md-2 col-lg-2">Signos y Sintomas Principales:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="sig/sin" name="signs_symptoms_main" value="<%=current.get(4)%>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="Relato" class="control-label col-md-2 col-lg-2">Relato Cronologico:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="relato" name="chronological_story" value="<%=current.get(5)%>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="FuncionesBio" class="control-label col-md-2 col-lg-2">Funciones Biologicas:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="funciones" name="biological_functions" value="<%=current.get(6)%>">
												
											</div>
										</div>
									<%}else{%>
									<div class="form-group container-fluid">
											<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="enfermedad_actual" ></textarea>
										</div>
										
										<div class="form-group ">
											<label for="nombre" class="control-label col-md-2 col-lg-2">Datos del Informante:</label>
											<div class="col-md-10 col-lg-10">

												<input type="text" class="form-control" id="nombre" name="data_reporting" value="">

											</div>
										</div>	
								
										<div class="form-group ">
											<label for="motConsulta" class="control-label col-md-2 col-lg-2">Motivos de Consulta:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="motivos" name="reason_consultation" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="Enfermedad" class="control-label col-md-2 col-lg-2">Tipo de Enfermedad:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="enfermedad" name="sick_time" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="Sig/sin" class="control-label col-md-2 col-lg-2">Signos y Sintomas Principales:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="sig/sin" name="signs_symptoms_main" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="Relato" class="control-label col-md-2 col-lg-2">Relato Cronologico:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="relato" name="chronological_story" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="FuncionesBio" class="control-label col-md-2 col-lg-2">Funciones Biologicas:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="funciones" name="biological_functions" value="">
												
											</div>
										</div>
									<%}%>
										
										<div class="form-group" >
											<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
												<button  name="action" value="data" id="boton1" class="btn btn-success">Guardar</button>
												<button  id="boton2" name="action" value="salir" class="btn btn-danger">Salir</button>
											</div>
										</div>
										
									
									</form>
								</div>
							</div>
							
							<div role="tabpanel"class="tab-pane"id="seccion2">
								<div class="container-fluid">
									<h3>Antecedentes</h3>
									<div class="container-fluid">
										<form action="newBackground" method="post" class="form-horizontal" >
										<%if(background.size()>0){ %>				
											<div class="form-group ">
												<label for="antecedentesFam" class="control-label col-md-2 col-lg-3">Antecedentes Familiares:</label>
												<div class="col-md-10 col-lg-12">
													<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="family_background" value="<%=background.get(0)%>"></textarea>
												</div>
											</div>
											
											<div class="form-group ">
												<label for="antecedentesPer" class="control-label col-md-2 col-lg-3">Antecedentes Personales:</label>
												<div class="col-md-10 col-lg-12">
													<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="personal_history" value="<%=background.get(1)%>"></textarea>
												</div>
											</div>
										<%}else{%>
											<div class="form-group ">
												<label for="antecedentesFam" class="control-label col-md-2 col-lg-3">Antecedentes Familiares:</label>
												<div class="col-md-10 col-lg-12">
													<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="family_background" value=""></textarea>
												</div>
											</div>
											
											<div class="form-group ">
												<label for="antecedentesPer" class="control-label col-md-2 col-lg-3">Antecedentes Personales:</label>
												<div class="col-md-10 col-lg-12">
													<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="personal_history" value=""></textarea>
												</div>
											</div>
										<%}%>
											<div class="form-group" >
												<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
													<button  name="action" value="data" id="boton1" class="btn btn-success">Guardar</button>
													<button  id="boton2" name="action" value="salir" class="btn btn-danger">Salir</button>
												</div>
											</div>
										
										</form>
									
									</div>
								</div>
							</div>

							<div role="tabpanel"class="tab-pane"id="seccion3">
								<div class="container-fluid">
									<h3>Exploracion Fisica</h3>
									<form action="newPhysicalExploration" method="post" class="form-horizontal" >
									<%if(physical.size()>0){ %>	
										<div class="form-group ">
											<label for="P.A." class="control-label col-lg-2 col-md-2 col-sm-3 col-xs-12">Signos Vitales P.A.</label>
											<div class="col-lg-1 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="nombre"placeholder="P.A." name="vitalSigns_pa" value="<%=physical.get(0)%>" >
											</div>
											
											<label for="Pulso." class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">Pulso </label>
											<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="pulso" placeholder="Pulso" name="vitalSigns_pulso" value="<%=physical.get(1)%>">
											</div>
											
											<label for="Temperatura" class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">Temp </label>
											<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="nombre"placeholder="Temp" name="vitalSigns_temp" value="<%=physical.get(2)%>">
											</div>
											
											<label for="Frecuencia" class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">F.C. </label>
											<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="nombre"placeholder="F.C." name="vitalSigns_fc" value="<%=physical.get(3)%>">
											</div>
											
											<label for="Frecuencia" class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">F.C. </label>
											<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="nombre"placeholder="F.C." name="vitalSigns_frecResp" value="<%=physical.get(4)%>">
											</div>
											
											<div class="form-group ">
												<label for="examCG" class="control-label col-md-2 col-lg-3">Examen Clinico General:</label>
												<div class="col-md-10 col-lg-8">
													<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="clinica_examination" value="<%=physical.get(5)%>"></textarea>
												</div>
											</div>
											
											<div class="form-group ">
												<label for="odontoestomatologico" class="control-label col-md-2 col-lg-3">Odontoestomatologico:</label>
												<div class="col-md-10 col-lg-8">
													<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="odontoestomatologico" value="<%=physical.get(6)%>"></textarea>
												</div>
											</div>
										</div>
										<%}else{%>
										<div class="form-group ">
											<label for="P.A." class="control-label col-lg-2 col-md-2 col-sm-3 col-xs-12">Signos Vitales P.A.</label>
											<div class="col-lg-1 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="nombre"placeholder="P.A." name="vitalSigns_pa" value="" >
											</div>
											
											<label for="Pulso." class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">Pulso </label>
											<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="pulso" placeholder="Pulso" name="vitalSigns_pulso" value="">
											</div>
											
											<label for="Temperatura" class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">Temp </label>
											<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="nombre"placeholder="Temp" name="vitalSigns_temp" value="">
											</div>
											
											<label for="Frecuencia" class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">F.C. </label>
											<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="nombre"placeholder="F.C." name="vitalSigns_fc" value="">
											</div>
											
											<label for="Frecuencia" class="control-label col-lg-1 col-md-1 col-sm-3 col-xs-12">F.C. </label>
											<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
												<input type="text" class="form-control" id="nombre"placeholder="F.C." name="vitalSigns_frecResp" value="">
											</div>
											
											<div class="form-group ">
												<label for="examCG" class="control-label col-md-2 col-lg-3">Examen Clinico General:</label>
												<div class="col-md-10 col-lg-8">
													<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="clinica_examination" value=""></textarea>
												</div>
											</div>
											
											<div class="form-group ">
												<label for="odontoestomatologico" class="control-label col-md-2 col-lg-3">Odontoestomatologico:</label>
												<div class="col-md-10 col-lg-8">
													<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="odontoestomatologico" value=""></textarea>
												</div>
											</div>
										</div>
										
										<%}%>
										<div class="form-group" >
											<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
												<button  name="action" value="data" id="boton1" class="btn btn-success">Guardar</button>
												<button  id="boton2" name="action" value="salir" class="btn btn-danger">Salir</button>
											</div>
										</div>
									</form>
									
								</div>
							</div>
							
							<div role="tabpanel"class="tab-pane"id="seccion4">
								<div class="container-fluid">
									<h3>Diagnostico (CIE 10)</h3>
									<form action="newDiagnosis" method="post" class="form-horizontal" >
									<%if(diagnosis.size()>0){ %>	
										<div class="form-group ">
											<label for="diagPres" class="control-label col-lg-2 col-md-6 col-sm-3 col-xs-12">Diagnostico Presuntivo:</label>
											<div div class="col-md-10 col-lg-10">
												<textarea class="col-lg-10 col-md-12 col-sm-12 col-xs-12" rows="5px" name="presumptive_diagnosis" value="<%=diagnosis.get(0)%>"></textarea>
											</div>
										</div>
										
										<div class="form-group ">
											<label for="diagDef" class="control-label col-lg-2 col-md-6 col-sm-3 col-xs-12">Diagnostico Definitivo:</label>
											<div div class="col-md-10 col-lg-10">
												<textarea class="col-lg-10 col-md-12 col-sm-12 col-xs-12" rows="5px" name="definitive_diagnosis" value="<%=diagnosis.get(1)%>"></textarea>
											</div>
										</div>
										<%}else{%>
										<div class="form-group ">
											<label for="diagPres" class="control-label col-lg-2 col-md-6 col-sm-3 col-xs-12">Diagnostico Presuntivo:</label>
											<div div class="col-md-10 col-lg-10">
												<textarea class="col-lg-10 col-md-12 col-sm-12 col-xs-12" rows="5px" name="presumptive_diagnosis" value=""></textarea>
											</div>
										</div>
										
										<div class="form-group ">
											<label for="diagDef" class="control-label col-lg-2 col-md-6 col-sm-3 col-xs-12">Diagnostico Definitivo:</label>
											<div div class="col-md-10 col-lg-10">
												<textarea class="col-lg-10 col-md-12 col-sm-12 col-xs-12" rows="5px" name="definitive_diagnosis" value=""></textarea>
											</div>
										</div>
										<%}%>
										<div class="form-group" >
											<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
												<button  name="action" value="data" id="boton1" class="btn btn-success">Guardar</button>
												<button  id="boton2" name="action" value="salir" class="btn btn-danger">Salir</button>
											</div>
										</div>
										
									</form>
								</div>
							</div>
							
							<div role="tabpanel"class="tab-pane"id="seccion5">
								<div class="container-fluid">
									<h3>Plan de Trabajo</h3>
									<form action="newWorkplan" method="post" class="form-horizontal" >
									<%if(workplan.size()>0){ %>	
										<div class="form-group ">
											<div div class="col-md-10 col-lg-12">
												<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="work_plan" value="<%=workplan.get(0)%>"></textarea>
											</div>
										</div>
									<%}else{%>
									<div class="form-group ">
											<div div class="col-md-10 col-lg-12">
												<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="work_plan" value=""></textarea>
											</div>
										</div>
									<%}%>
										<div class="form-group" >
											<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
												<button  name="action" value="data" id="boton1" class="btn btn-success">Guardar</button>
												<button  id="boton2" name="action" value="salir" class="btn btn-danger">Salir</button>
											</div>
										</div>
										
									</form>
								</div>
							</div>
							
							<div role="tabpanel"class="tab-pane"id="seccion6">
								<div class="container-fluid">
									<h3>Pronóstico</h3>
									<form action="newForecast" method="post" class="form-horizontal" >
									<%if(forecast.size()>0){ %>	
										<div class="form-group ">
											<div div class="col-md-10 col-lg-12">
												<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="fore_cast" value="<%=forecast.get(0)%>"></textarea>
											</div>
										</div>
									<%}else{%>
									<div class="form-group ">
											<div div class="col-md-10 col-lg-12">
												<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="fore_cast" value=""></textarea>
											</div>
										</div>
									<%}%>
										<div class="form-group" >
											<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
												<button  name="action" value="data" id="boton1" class="btn btn-success">Guardar</button>
												<button  id="boton2" name="action" value="salir" class="btn btn-danger">Salir</button>
											</div>
										</div>
										
									</form>
								</div>
							
							</div>
							
							<div role="tabpanel"class="tab-pane"id="seccion7">
								<div class=container-fluid>
									<h3>Tratamiento/ Recomendaciones</h3>
									<form action="newTreatment_Recomendation" method="post" class="form-horizontal" >
									<%if(treatment.size()>0){ %>	
										<div class="form-group container-fluid">
											<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="treatmentRecomendations" value="<%=treatment.get(0) %>"></textarea>
										</div>
										
										<div class="form-group ">
											<label for="nombreMed" class="control-label col-md-2 col-lg-2">Nombre Generico del Medico:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="nombreMed"placeholder="Nombre" name="generic_drug_name" value="<%=treatment.get(1) %>">
											</div>
										</div>	
								
										<div class="form-group ">
											<label for="dosis" class="control-label col-md-2 col-lg-2">Dosis:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="dosis" placeholder="Dosis" name="dose" value="<%=treatment.get(2) %>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="administracion" class="control-label col-md-2 col-lg-2">Via de Administración:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="administracion" placeholder="Via de Administracion" name="way_administration" value="<%=treatment.get(3) %>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="cuidados" class="control-label col-md-2 col-lg-2">Cuidados:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="cuidados" placeholder="Cuidados" name="care" value="<%=treatment.get(4) %>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="Medidas" class="control-label col-md-2 col-lg-2">Medidas higiénico-dietéticas:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="medidas" placeholder="Medidas" name="hygiene_measures_dietary" value="<%=treatment.get(5) %>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="preventivos" class="control-label col-md-2 col-lg-2">Preventivos:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="preventivos" placeholder="Preventivos" name="preventive" value="<%=treatment.get(6) %>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="preventivos" class="control-label col-lg-2 col-md-2 col-xs-12">Alta del Paciente:</label>
											<div class="col-xs-12 col-md-4 col-lg-4">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="Day">
													<span class="input-group-addon">/</span>
													<input type="text" class="form-control" placeholder="Month">
													<span class="input-group-addon">/</span>
													<input type="text" class="form-control" placeholder="Year">
													
												</div>		
												
											</div>
											
										</div>
									<%}else{%>
									<div class="form-group container-fluid">
											<textarea class="col-lg-12 col-md-12 col-sm-12 col-xs-12" rows="5px" name="treatmentRecomendations" value=""></textarea>
										</div>
										
										<div class="form-group ">
											<label for="nombreMed" class="control-label col-md-2 col-lg-2">Nombre Generico del Medico:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="nombreMed"placeholder="Nombre" name="generic_drug_name" value="">
											</div>
										</div>	
								
										<div class="form-group ">
											<label for="dosis" class="control-label col-md-2 col-lg-2">Dosis:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="dosis" placeholder="Dosis" name="dose" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="administracion" class="control-label col-md-2 col-lg-2">Via de Administración:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="administracion" placeholder="Via de Administracion" name="way_administration" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="cuidados" class="control-label col-md-2 col-lg-2">Cuidados:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="cuidados" placeholder="Cuidados" name="care" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="Medidas" class="control-label col-md-2 col-lg-2">Medidas higiénico-dietéticas:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="medidas" placeholder="Medidas" name="hygiene_measures_dietary" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="preventivos" class="control-label col-md-2 col-lg-2">Preventivos:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="preventivos" placeholder="Preventivos" name="preventive" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="preventivos" class="control-label col-lg-2 col-md-2 col-xs-12">Alta del Paciente:</label>
											<div class="col-xs-12 col-md-4 col-lg-4">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="Day">
													<span class="input-group-addon">/</span>
													<input type="text" class="form-control" placeholder="Month">
													<span class="input-group-addon">/</span>
													<input type="text" class="form-control" placeholder="Year">
													
												</div>		
												
											</div>
											
										</div>
									
									<%}%>
										<div class="form-group" >
											<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
												<button  name="action" value="data" id="boton1" class="btn btn-success">Guardar</button>
												<button  id="boton2" name="action" value="salir" class="btn btn-danger">Salir</button>
											</div>
										</div>
										
	
									</form>
								</div>
							</div>
							
							<div role="tabpanel"class="tab-pane"id="seccion8">
								<div class="container-fluid">
									<h3>Odontograma</h3>
									<form action="newOdontograma" method="post" class="form-horizontal" >
									<%if(odontograma.size()>0){ %>
										<div class="form-group ">
											<div div class="col-md-10 col-lg-12">
												<img alt="odontograma" class="img-responsive" src="images/odonto.jpg">
											</div>
										</div>
											
										<div class="form-group ">
											<label for="especificaciones" class="control-label col-md-2 col-lg-2">Especificaciones:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="Especificaciones" placeholder="Especificaciones" name="odontogram" value="<%=odontograma.get(0)%>">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="observaciones" class="control-label col-md-2 col-lg-2">Observaciones:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="observaciones" placeholder="Observaciones">
												
											</div>
										</div>
									<%}else{%>
									<div class="form-group ">
											<div div class="col-md-10 col-lg-12">
												<img alt="odontograma" class="img-responsive" src="images/odonto.jpg">
											</div>
										</div>
											
										<div class="form-group ">
											<label for="especificaciones" class="control-label col-md-2 col-lg-2">Especificaciones:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="Especificaciones" placeholder="Especificaciones" name="odontogram" value="">
												
											</div>
										</div>
										
										<div class="form-group ">
											<label for="observaciones" class="control-label col-md-2 col-lg-2">Observaciones:</label>
											<div class="col-md-10 col-lg-10">
												<input type="text" class="form-control" id="observaciones" placeholder="Observaciones">
												
											</div>
										</div>
									<%}%>
										<div class="form-group" >
											<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
												<button  name="action" value="data" id="boton1" class="btn btn-success">Guardar</button>
												<button  id="boton2" name="action" value="salir" class="btn btn-danger">Salir</button>
											</div>
										</div>
										
									</form>
								</div>
								
							</div>
							
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