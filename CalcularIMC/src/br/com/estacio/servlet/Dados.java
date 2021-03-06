package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dados
 */
@WebServlet(description = "Informar os dados da pessoa", urlPatterns = { "/Dados.do" })
public class Dados extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("Usando o verbo Get");
		
		out.println("<form method='get' action='GetDados.do'>");
		out.println("Nome <input type='text' name='nome'> <br/>");
		out.println("Peso <input type='text' name='peso'> <br/>");
		out.println("Altura <input type='text' name='altura'> <br/>");
		out.println("<input type='submit' value='Calcular'>");
		out.println("</form>");

		out.println("Usando o verbo Post");
		
		out.println("<form method='post' action='GetDados.do'>");
		out.println("Nome <input type='text' name='nome'> <br/>");
		out.println("Peso <input type='text' name='peso'> <br/>");
		out.println("Altura <input type='text' name='altura'> <br/>");
		out.println("<input type='submit' value='Calcular'>");
		out.println("</form>");

		out.close();


	}

}
