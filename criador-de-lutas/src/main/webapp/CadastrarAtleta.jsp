<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/pageStyle.css">

<meta charset="ISO-8859-1">
<title>Criador de lutas</title>
</head>
<body>
	<nav class="criadorNav">
		<ul>
			<li><span style="color: brown">Criar Lutas</span></li>
			<li><img src="img/cbkb.png" height="20px"></li>
			<li><a href="cadastrarAtleta.jsp">Cadastrar Atleta</a></li>
			<li><a href="consultarAtleta.jsp">Consultar Atleta</a></li>
		</ul>
	</nav>
	<main class="criadorMain">
		<form action="" method="post" class="criadorForm">
			<div>
				<label><strong>Nome:</strong></label><input type="text"
					name="nome">
			</div>
			<div>
				<label><strong>Equipe:</strong></label><input type="text"
					name="equipe">
			</div>
			<div>
				<label><strong>Faixa:</strong></label><input type="text"
					name="faixa">
			</div>
			<div>
				<label><strong>Sexo:</strong></label><input type="text"
					name="sexo">
			</div>
			<div>
				<label><strong>Idade:</strong></label><input type="text"
					name="idade">
			</div>
			<div>
				<label><strong>Peso:</strong></label><input type="text"
					name="preco">
			</div>
			<div>
				<input id="criadorButton" type="submit" name="salvar"
					value="Cadastrar Atleta">
			</div>
		</form>
	</main>
</body>
</html>