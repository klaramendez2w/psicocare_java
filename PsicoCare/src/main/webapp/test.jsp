
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
<link rel="stylesheet" href="CSS/teststyle.css">
</head>
<body>
	<header>
		<nav class="nav-wrapper blue lighten-3">

			<div style="position: relative; display: inline-block;"
				class="brand-logo">
				PsicoCare <img src="./IMG/logo photoshopeado2.png" alt="Logo"
					id="logo">
			</div>

		</nav>

	</header>

	<h1>Test</h1>

	<form action="" method="POST">
		<input type="hidden" name="paso" value="" />

		<tr>
			<td><input class="inputsubmitbtn" id="q1" name="question"
				type="radio" value="1"></td>
			<td><span> I am not particulary discouraged about my
					future.</span></td>
		</tr>

		<tr>
			<td><input class="inputsubmitbtn" id="q1" name="question"
				type="radio" value="2"></td>
			<td>I feel discouraged about the future.</td>
		</tr>
		<tr>
			<td><input class="inputsubmitbtn" id="q1" name="question"
				type="radio" value="3"></td>
			<td>I feel I have nothing to look forward to.</td>
		</tr>
		<tr>
			<td><input class="inputsubmitbtn" id="q1" name="question"
				type="radio" value="4"></td>
			<td>I feel the future is hopeless.</td>
		</tr>
		<div>
			<button>Guardar</button>
		</div>
	</form>



</body>
</html>