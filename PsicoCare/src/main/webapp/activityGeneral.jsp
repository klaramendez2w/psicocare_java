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
<title>header</title>

</head>
<body>
	<header>
		<nav>
			<div class="nav-wrapper blue lighten-3">
				<a href="./menu.jsp" class="brand-logo left">
					<div class="brandname">PsicoCare</div> <img
					src="./IMG/logo photoshopeado2.png" alt="Logo" id="logo">
				</a>
				<ul id="menuderecha" class="right hide-on-med-and-down">
					<li><a href="./menu.jsp">Home</a></li>
					<li><a href="./profile.jsp">Main Profile</a></li>
					<li><a href="./progress.jsp">Progress</a></li>
					<li><a href="./homeactividades.jsp">Activities</a></li>
				</ul>

			</div>
		</nav>

		<ul id="slide-out" class="sidenav">
			<li>
				<div class="user-view">
					<div class="background">
						<img src="./IMG/backgroun menu.jpg">
					</div>
					<a href="#user"><img class="circle" src="./IMG/gato.png"></a>
					<a href="#name"><span class="white-text name">Klara</span></a> <a
						href="#email"><span class="white-text email">ansiedadatope@gmail.com</span></a>
				</div>
			</li>
			<li><a href="./menu.jsp">MENU </a></li>
			<li>
				<div class="divider"></div>
			</li>
			<li><a class="waves-effect" href="./profile.jsp">PROFILE</a></li>
			<li><a class="waves-effect" href="./progress.jsp">PROGRESS</a></li>
			<li><a class="waves-effect" href="./homeactividades.jsp">ACTIVITIES</a></li>
			<li><a class="waves-effect" href="./config.jsp">OPTIONS</a></li>
			<li><a class="waves-effect" href="./Aboutus.jsp">ABOUT</a></li>
			<li><a class="waves-effect" href="./login.jsp">LOG OUT</a></li>
		</ul>
		<a href="#" data-target="slide-out" class="sidenav-trigger"><i
			class="material-icons">menu</i></a>
	</header>
	<div>
		<div>algo${unContent.value}</div>
		<div>${unContent.statement}</div>
		<div>${unContent.content}</div>
	</div>
	
</body>

<footer>
	<a class="miboton" href="./menu.html">Back</a>
</footer>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script src="./JS/init.js"></script>

</html>