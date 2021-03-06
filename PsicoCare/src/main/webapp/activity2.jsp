<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<title>Activity2</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" href="CSS/actividad2style.css">
<link rel="stylesheet" href="./CSS/csgeneral.css">
<title>Actividad2</title>

</head>

<body>
	<header>
		<nav>
			<div class="nav-wrapper blue lighten-3">
				<a href="./menu.html" class="brand-logo left">
					<div class="brandname">PsicoCare</div> <img
					src="./IMG/logo photoshopeado2.png" alt="Logo" id="logo">
				</a>
				<ul id="menuderecha" class="right hide-on-med-and-down">
					<li><a href="./menu.html">Home</a></li>
					<li><a href="./profile.html">Main Profile</a></li>
					<li><a href="./progress.html">Progress</a></li>
					<li><a href="./homeactividades.html">Activities</a></li>
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
			<li><a href="./menu.html">MENU </a></li>
			<li>
				<div class="divider"></div>
			</li>
			<li><a class="waves-effect" href="./profile.html">PROFILE</a></li>
			<li><a class="waves-effect" href="./progress.html">PROGRESS</a></li>
			<li><a class="waves-effect" href="./homeactividades.html">ACTIVITIES</a></li>
			<li><a class="waves-effect" href="./config.html">OPTIONS</a></li>
			<li><a class="waves-effect" href="./Aboutus.html">ABOUT</a></li>
			<li><a class="waves-effect" href="./login.html">LOG OUT</a></li>
		</ul>
		<a href="#" data-target="slide-out" class="sidenav-trigger"><i
			class="material-icons">menu</i></a>
	</header>
<body>

	<h1>Work out your goals!</h1>
	<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam
		quo nobis nulla minima sed et, consequuntur aspernatur dolore nisi
		similique inventore voluptate non doloremque tempore debitis
		repudiandae asperiores saepe ratione.</p>

	<div>
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
								name="textito" id="cuentame4" rows="10" cols="50" name="comment"
								form="textform" required maxlength="500">Enter your text here</textarea>
							</th>
					</td>
				</tr>
			</tfoot>
		</table>

		<span>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			<input type="button" id="submitboton" value="Submit your answer">
		</span>


	</div>
	<footer>
		<a class="miboton" href="./activity1.jsp">Back</a> <a class="miboton"
			href="./activity3.jsp">Next</a>

	</footer>

	</form>
</body>

<script src="./JS/actividad2.js"></script>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script src="./JS/init.js"></script>
<script src="JS/jquery-3.3.1.min.js"></script>


</html>