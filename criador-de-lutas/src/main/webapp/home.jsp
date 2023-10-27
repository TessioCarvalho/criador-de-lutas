<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/homeStyle.css">
<meta charset="ISO-8859-1">
<title>Criador de lutas</title>
</head>
<body>
	<nav class="criadorNav">
		<ul>
			<li><img src="img/cbkb900x900.jpg" height="30px"></li>
			<li><a style="color: #F1AE2B" href="CadastrarAtleta.jsp">Cadastrar</a></li>
			<li><a style="color: #F1AE2B" href="BuscarAtleta.jsp">Buscar
					cadastrado</a></li>
		</ul>
	</nav>
	<main class="criadorMain">
		<form action="" class="criadorForm">
			<div>
			<h2>Seja bem-vindo ao Criador de lutas!</h2>
			<p>Escolha uma das opções.</p>
			</div>
			<br>
			<div>
				<input id="button" type="submit" name="admin"
					value="Sou Administrador">
				<input id="button" type="submit" name="atleta"
					value="Sou Atleta">
			</div>
		</form>
	</main>
</body>
</html>