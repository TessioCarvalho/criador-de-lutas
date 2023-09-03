<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/buscaStyle.css">
	<meta charset="ISO-8859-1">
	<title>Criador de lutas - Pesquisa</title>
</head>
<body>
	<nav class="criadorNav">
		<ul>
			<li><span style="color: #F1AE2B">Buscar atleta</span></li>
			<li><img src="img/cbkb900x900.jpg" height="30px"></li>
			<li><a style="color: white" href="CadastrarAtleta.jsp">Cadastrar Atleta</a></li>
			<li><a style="color: white" href="BuscarAtleta.jsp">Buscar Atleta</a></li>
		</ul>
	</nav>
	<main class="criadorMain">
		<form action="" method="post" class="criadorForm">
			<div>
				<label><strong>Digite o CPF:</strong></label><input type="text"
					name="cpf">
			</div>
			<br>
			<div>
				<input id="criadorButton" type="submit" name="salvar"
					value="Buscar atleta">
			</div>
		</form>
	</main>
</body>
</html>