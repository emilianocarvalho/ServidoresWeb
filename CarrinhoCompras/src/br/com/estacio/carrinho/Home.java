package br.com.estacio.carrinho;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
@WebServlet(description = "Página principal exibindo produtos", urlPatterns = { "/Home.do" })
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomeLivro = request.getParameter("livro");  

		Produto produto = new Produto();  
		produto.setLivro(nomeLivro);  

		ArrayList retornoLista = new ArrayList();  

		retornoLista = new AdicionaItensCarrinho().AdicionaItensCarrinho(produto, retornoLista);  


		HttpSession session = request.getSession(true);  

		session.setAttribute("lista", retornoLista);  


		response.sendRedirect("LerCarrinho.jsp");		
	}

}
