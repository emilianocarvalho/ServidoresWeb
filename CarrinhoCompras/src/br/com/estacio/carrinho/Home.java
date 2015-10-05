package br.com.estacio.carrinho;

import java.io.IOException;
import java.io.PrintWriter;
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
		HttpSession sessao = request.getSession();
		Vector<String> carrinho = (Vector<String>) sessao.getAttribute("carrinho");
		if (carrinho == null) {
			carrinho = new Vector<String>();
			sessao.setAttribute("carrinho", carrinho);
		}

		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("Usando o verbo Get");
		carrinho.add("Produto 1");
		out.append("<h1>Carrinho de Compras</h1>");
		out.append("Carrinho: " + carrinho.lastElement());
		out.append("Sessão: " + sessao.getId());
		out.close();
	}

}
