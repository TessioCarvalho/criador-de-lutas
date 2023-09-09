package criador.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import criador.model.Atleta;

/**
 * Servlet implementation class CadastrarController
 */
@WebServlet("/CadastrarController")
public class CadastrarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastrarController() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String mensagem;
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf").replace(".", "").replace("-", "");
		String email = request.getParameter("email");
		String equipe = request.getParameter("equipe");
		String faixa = request.getParameter("faixa");
		String sexo = request.getParameter("sexo");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("CadastrarAtleta.jsp");
		if (nome != null && !nome.isEmpty() 
				&& cpf != null && !cpf.isEmpty() 
				&& email != null && !email.isEmpty() 
				&& equipe != null && !equipe.isEmpty()
				&& faixa != null && !faixa.isEmpty() 
				&& sexo != null && !sexo.isEmpty()
				&& request.getParameter("idade") != null && !request.getParameter("idade").isEmpty()
				&& request.getParameter("peso") != null && !request.getParameter("peso").isEmpty()) {
			int idade = Integer.parseInt(request.getParameter("idade"));
			double peso = Double.parseDouble(request.getParameter("peso").replace(",", "."));
			Atleta atleta = new Atleta(nome, cpf, email, equipe, faixa, sexo, idade, peso);
			atleta.cadastrar();
			mensagem = "Atleta cadastrado com sucesso!";
		} else {
			mensagem = "ATENCAO!!! Todos os campos devem ser preenchidos.";
		}
		request.setAttribute("mensagem", mensagem);
		dispatcher.forward(request, response);

	}

}
