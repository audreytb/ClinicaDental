<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Calendario</title>
		<meta name="viewport"
		content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="css/bootstrap.min.css ">
		<link rel="stylesheet" href="css/estilo.css ">
		<link href='http://fonts.googleapis.com/css?family=Economica' rel='stylesheet' type='text/css'>
	    <link href="css/responsive-calendar.css" rel="stylesheet">
	</head>
	<body>
		<jsp:include page="menu.jsp" flush="true" />
		<br>
		 <div class="container">
		 	<div id="contenido1">
      			<!-- Responsive calendar - START -->
       			<div class="container-fluid">
    				<div class="responsive-calendar">
       					<div class="controls">
            				<a class="pull-left" data-go="prev">
            					<div class="btn btn-primary">Prev</div>
            				</a>
            				<h4><span data-head-year></span> <span data-head-month></span></h4>
            				<a class="pull-right" data-go="next">
            					<div class="btn btn-primary">Next</div>
            				</a>
        				</div>
        				
        				<div class="day-headers">
					        <div class="day header">Mon</div>
					        <div class="day header">Tue</div>
					        <div class="day header">Wed</div>
					        <div class="day header">Thu</div>
					        <div class="day header">Fri</div>
					        <div class="day header">Sat</div>
					        <div class="day header">Sun</div>
				        </div>
        				<div class="days" data-group="days">
          
        			</div>
        		</div>
      		</div>
      <!-- Responsive calendar - END -->
    	</div>
		
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/responsive-calendar.js"></script>
	    <script type="text/javascript">
	      $(document).ready(function () {
	        $(".responsive-calendar").responsiveCalendar({
	          time: '2016-05',
	          events: {
	            "2013-04-30": {"number": 5, "url": "http://w3widgets.com/responsive-slider"},
	            "2013-04-26": {"number": 1, "url": "http://w3widgets.com"}, 
	            "2013-05-03":{"number": 1}, 
	            "2013-06-12": {}}
	        });
	      });
	    </script>
	</body>
</html>