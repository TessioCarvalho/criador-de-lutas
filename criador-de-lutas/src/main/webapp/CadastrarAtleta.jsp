<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/cadastroStyle.css">
	<meta charset="ISO-8859-1">
	<title>Criador de lutas - Cadastro</title>
</head>
<body>
	<nav class="criadorNav">
		<ul>
			<li><a style="color: #F1AE2B" href="home.jsp">In�cio</a></li>
			<li><img src="img/cbkb900x900.jpg" height="30px"></li>
			<li><span style="color: white">Cadastrar atleta</span></li>
		</ul>
	</nav>
	<main class="criadorMain">
		<form action="cadastrarAtleta" method="post" class="criadorForm">
			<div>
				<label><strong>Nome:</strong></label><input type="text"
					name="nome">
			</div>
			<div>
				<label><strong>CPF:</strong></label><input type="text"
					name="cpf">
			</div>
			<div>
				<label><strong>E-Mail:</strong></label><input type="text"
					name="email">
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
					name="peso">
			</div>
			<div>
				<%
					String mensagem = (String) request.getAttribute("mensagem");
					if(mensagem != null){
						out.print(mensagem);
					}
				%>			
			</div>
			<div>
				<input id="criadorButton" type="submit" name="salvar"
					value="Cadastrar Atleta">
			</div>
		</form>
	</main>
</body>
</html>