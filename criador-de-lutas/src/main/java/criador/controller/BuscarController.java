package criador.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import criador.model.Atleta;

/**
 * Servlet implementation class BuscarController
 */
@WebServlet("/BuscarController")
public class BuscarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscarController() {
		super();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mensagem;
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String cpf = request.getParameter("cpf");
		RequestDispatcher dispatcher = request.getRequestDispatcher("BuscarAtleta.jsp");
		if (cpf != null && !cpf.isEmpty()) {
			ArrayList<Atleta> atletas = new Atleta().buscar(cpf);
			request.setAttribute("atletas", atletas);
		} else {
			mensagem = "Atleta não encontrado!";
			request.setAttribute("mensagem", mensagem);
		}
		dispatcher.forward(request, response);
		
	}

}
