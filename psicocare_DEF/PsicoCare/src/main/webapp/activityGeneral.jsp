<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Activity1</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" href="CSS/cssactividad1.css">
<link rel="stylesheet" href="CSS/csgeneral.css">
<link rel="stylesheet" href="CSS/countdown.css">
<link rel="stylesheet" href="CSS/actividad3style.css">
<title>header</title>

</head>
<body>
<jsp:include page="./header.jsp"></jsp:include>
<!-- 	<header> -->
<!-- 		<nav> -->
<!-- 			<div class="nav-wrapper blue lighten-3"> -->
<!-- 				<a href="./menu.jsp" class="brand-logo left"> -->
<!-- 					<div class="brandname">PsicoCare</div> <img -->
<!-- 					src="./IMG/logo photoshopeado2.png" alt="Logo" id="logo"> -->
<!-- 				</a> -->
<!-- 				<ul id="menuderecha" class="right hide-on-med-and-down"> -->
<!-- 					<li><a href="./menu.jsp">Home</a></li> -->
<!-- 					<li><a href="./profile.jsp">Main Profile</a></li> -->
<!-- 					<li><a href="./progress.jsp">Progress</a></li> -->
<!-- 					<li><a href="./homeactividades.jsp">Activities</a></li> -->
<!-- 				</ul> -->

<!-- 			</div> -->
<!-- 		</nav> -->

<!-- 		<ul id="slide-out" class="sidenav"> -->
<!-- 			<li> -->
<!-- 				<div class="user-view"> -->
<!-- 					<div class="background"> -->
<!-- 						<img src="./IMG/backgroun menu.jpg"> -->
<!-- 					</div> -->
<!-- 					<a href="#user"><img class="circle" src="./IMG/gato.png"></a> -->
<!-- 					<a href="#name"><span class="white-text name">Klara</span></a> <a -->
<!-- 						href="#email"><span class="white-text email">ansiedadatope@gmail.com</span></a> -->
<!-- 				</div> -->
<!-- 			</li> -->
<!-- 			<li><a href="./menu.jsp">MENU </a></li> -->
<!-- 			<li> -->
<!-- 				<div class="divider"></div> -->
<!-- 			</li> -->
<!-- 			<li><a class="waves-effect" href="./profile.jsp">PROFILE</a></li> -->
<!-- 			<li><a class="waves-effect" href="./progress.jsp">PROGRESS</a></li> -->
<!-- 			<li><a class="waves-effect" href="./homeactividades.jsp">ACTIVITIES</a></li> -->
<!-- 			<li><a class="waves-effect" href="./config.jsp">OPTIONS</a></li> -->
<!-- 			<li><a class="waves-effect" href="./Aboutus.jsp">ABOUT</a></li> -->
<!-- 			<li><a class="waves-effect" href="./login.jsp">LOG OUT</a></li> -->
<!-- 		</ul> -->
<!-- 		<a href="#" data-target="slide-out" class="sidenav-trigger"><i -->
<!-- 			class="material-icons">menu</i></a> -->
<!-- 	</header> -->
	
	<h1>${miActivity.value}</h1>
	<section id='bodypad'>
		<div>
			<P>${miActivity.description}</P>
			<c:if test="${miActivity.aid == 3}">
				<div class="video-container">
					<video class="responsive-video" controls>
						<iframe width="300" height="300"
							type="video/mp4
							frameborder=" 0" allowfullscreen></iframe>
						<source src="${miActivity.content}">
						Video is not supported by your browser
					</video>
				</div>
			</c:if>
			<c:if test="${miActivity.aid == 4}">
				<div id="clockdiv" class="center">
					<div>
						<span class="minutes"></span>
						<div class="smalltext">Minutes</div>
					</div>
					<div>
						<span class="seconds"></span>
						<div class="smalltext">Seconds</div>
					</div>
				</div>
			</c:if>
			<c:if test="${miActivity.aid == 1}">
				<div>
					<audio controls>
						<source src="${miActivity.content}" type="audio/ogg">
					</audio>
				</div>
			</c:if>
			<c:if test="${miActivity.aid == 2}">
				<table>
					<thead>
						<tr>
							<th>
							<td>Important</td>
							<td>Not important</td>
							</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Urgent</td>
							<td style="height: 300px;">
								<form id="textform" method="POST">

									<div>
										<label for="textito"></label>

										<textarea style="height: 200px;" onclick="cleartext(1)"
											name="textito" id="cuentame1" name="comment" form="textform"
											required maxlength="500">Enter your text here</textarea>

										</th>
							</td>
							<td>
								<div>
									<textarea style="height: 200px;" onclick="cleartext(2)"
										; name="textito" id="cuentame2" rows="10" cols="50"
										name="comment" form="textform" required maxlength="500">Enter your text here</textarea>
									</th>
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td>Not urgent</td>
							<td>
								<div>
									<textarea onclick="cleartext(3)"
										; style="height: 200px; text-align: left;" name="textito"
										id="cuentame3" rows="10" cols="50" name="comment"
										form="textform" required maxlength="500">Enter your text here</textarea>
									</th>
							</td>
							<td>
								<div>
									<textarea onclick="cleartext(4)" ; style="height: 200px;"
										name="textito" id="cuentame4" rows="10" cols="50"
										name="comment" form="textform" required maxlength="500">Enter your text here</textarea>
									</th>
							</td>
						</tr>
					</tfoot>
				</table>
			</c:if>
		</div>
	</section>
</body>

</body>

<footer>
	<a class="miboton" href="./menu.html">Back</a>
</footer>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script src="./JS/init.js"></script>
<script src="JS/countdown.js"></script>
</html>