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
		<form action="buscarAtleta" method="post" class="criadorForm">
			<div>
				<label><strong>Digite o CPF:</strong></label><input type="text"
					name="cpf">
			</div>
			<div>
				<input id="criadorButton" type="submit" name="salvar"
					value="Consultar Atleta">
			</div>
			<div>
				<%
				String mensagem = (String) request.getAttribute("mensagem");
				if (mensagem != null)
					out.print(mensagem);
				%>
			</div>
		</form>
		<%
		if (request.getAttribute("atletas") != null) {
			List<?> atletas = (List<?>) request.getAttribute("atletas");
			for (int contador = 0; contador <= (atletas.size() - 1); contador++) {
				Atleta atleta = (Atleta) atletas.get(contador);
		%>
		<form action="excluirAtleta" method="post">
			<div class="criadorForm">
				<div>
					<span style="font-weight: bold">Nome:</span> <span>
						<%
						out.print(atleta.getNome());
						%>
						<input type="hidden" name="cpf" value="<%out.print(atleta.getCpf());%>">
					</span>
				</div>
				<div>
					<span style="font-weight: bold">Equipe:</span> <span>
						<%
						out.print(atleta.getEquipe());
						%>
					</span>
				</div>
				<div>
					<span style="font-weight: bold">Peso:</span> <span>
						<%
						out.print(atleta.getPeso());
						%>
					</span>
				</div>
				<br>
				<div>
					<input id="criadorButton" type="submit" 
						name="alterar" value="Alterar"> 
					<input id="criadorButton" type="submit"
						name="excluir" value="Excluir">
				</div>
			</div>
		</form>
		<%
		}
		}
		%>
	</main>
</body>
</html>