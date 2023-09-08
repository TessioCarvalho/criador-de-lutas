<%@page import="criador.model.Atleta"%>
<%@page import="java.util.List"%>
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
			<li><a style="color: #F1AE2B" href="home.jsp">Início</a></li>
			<li><img src="img/cbkb900x900.jpg" height="30px"></li>
			<li><span style="color: white">Buscar atleta</span></li>
		</ul>
	</nav>
	<main class="criadorMain">
	<div class="criadorForm">
		<form action="buscaAtleta" method="post">
			<div>
				<label><strong>Digite o CPF:</strong></label><input
					type="text" name="cpf">
			</div>
			<br>
			<div class="criadorColumn">
				<input id="criadorButton" type="submit" name="salvar"
					value="Consultar Atleta">
			</div>
			<div class="criadorColumn">
				<%
				String mensagem = (String) request.getAttribute("mensagem");
				if (mensagem != null)
					out.print(mensagem);
				%>
			</div>
		</form>
		<%if (request.getAttribute("atletas") != null) {
			List<?> atletas = (List<?>) request.getAttribute("atletas");
			for (int contador = 0; contador <= (atletas.size() - 1); contador++) {
				Atleta atleta = (Atleta) atletas.get(contador);%>
		<form action="modificarAtleta" method="post">
			<div class="criadorDivMother">
				<div class="criadorDivItem">
					<div class="criadorColumn">
						<span style="font-weight: bold">Nome:</span> 
						<span><%out.print(atleta.getNome());%></span> 
						<input type="hidden" name="nome" value="<%out.print(atleta.getNome());%>">
					</div>
					<div class="criadorColumn">
						<span style="font-weight: bold">Equipe:</span>
						<span><%out.print(atleta.getEquipe());%></span>
					</div>
					<div class="criadorColumn">
						<span style="font-weight: bold">Peso:</span>
						<span><%out.print(atleta.getPeso());%>
						</span>
					</div>
					<div class="criadorColumn">
						<input id="criadorItemButton" type="submit" name="alterar"
							value="Alterar"> <input id="criadorItemButton"
							type="submit" name="apagar" value="Apagar">
					</div>
				</div>
			</div>
		</form>
		<%
		}
		}
		%>
	</div>
	</main>
</body>
</html>