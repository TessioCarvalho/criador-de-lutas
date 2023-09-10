<%@page import="criador.model.Atleta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/cadastroStyle.css">
	<meta charset="ISO-8859-1">
	<title>Criador de lutas - Alterar</title>
</head>
<body>
	<nav class="criadorNav">
		<ul>
			<li><a style="color: #F1AE2B" href="home.jsp">Início</a></li>
			<li><img src="img/cbkb900x900.jpg" height="30px"></li>
			<li><span style="color: white">Alterar dados do atleta</span></li>
		</ul>
	</nav>
	<main class="criadorMain">
		<form action="alterarAtleta" method="post" class="criadorForm">
			<%
			Atleta atleta = null;
			if(request.getAttribute("atleta") != null){
				atleta = (Atleta) request.getAttribute("atleta");
			}
			%>	
			<div>
				<label><strong>Nome:</strong></label><input type="text"
					name="nome" value="<%out.print(atleta.getNome());%>">
			</div>
			<div>
				<label><strong>E-Mail:</strong></label><input type="text"
					name="email" value="<%out.print(atleta.getEmail());%>">
			</div>
			<div>
				<label><strong>Equipe:</strong></label><input type="text"
					name="equipe" value="<%out.print(atleta.getEquipe());%>">
			</div>
			<div>
				<label><strong>Faixa:</strong></label><input type="text"
					name="faixa" value="<%out.print(atleta.getFaixa());%>">
			</div>
			<div>
				<label><strong>Sexo:</strong></label><input type="text"
					name="sexo" value="<%out.print(atleta.getSexo());%>">
			</div>
			<div>
				<label><strong>Idade:</strong></label><input type="text"
					name="idade" value="<%out.print(atleta.getIdade());%>">
			</div>
			<div>
				<label><strong>Peso:</strong></label><input type="text"
					name="peso" value="<%out.print(atleta.getPeso());%>">
			</div>
			<div>
				<input type="hidden" name="cpf" value="<%out.print(atleta.getCpf());%>">
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
				<input id="criadorButton" type="submit" name="alterar"
					value="Alterar dados do Atleta">
			</div>
		</form>
	</main>
</body>
</html>