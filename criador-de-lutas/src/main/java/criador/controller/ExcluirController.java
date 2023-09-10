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
 * Servlet implementation class ExcluirController
 */
@WebServlet("/ExcluirController")
public class ExcluirController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExcluirController() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
		String excluir = request.getParameter("excluir");
		String alterar = request.getParameter("alterar");
		String cpf = request.getParameter("cpf");
		
		if (excluir != null && cpf != null) {
			new Atleta().excluir(cpf);
			RequestDispatcher dispatcher = request.getRequestDispatcher("BuscarAtleta.jsp");
			request.setAttribute("mensagem", "Atleta excluído com suscesso!");
			dispatcher.forward(request, response);
		} else if(alterar != null && cpf != null) {
			Atleta atleta = new Atleta().buscarCpf(cpf);
			RequestDispatcher dispatcher = request.getRequestDispatcher("AlterarAtleta.jsp");
			request.setAttribute("atleta", atleta);
			dispatcher.forward(request, response);
		}

	}

}
