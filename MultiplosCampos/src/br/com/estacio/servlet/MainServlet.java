package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(description = "Multiplos campos", urlPatterns = { "/MainServlet.do" })
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		if (request.getParameter("nome") == null) {
			request.setAttribute("message", "<h1></h1>" );
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			String msg = "<h1>Dados recebidos: " + request.getParameter("nome") + "<h1>";
			request.setAttribute("message", msg );
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		if (request.getParameter("nome") == null) {
			request.setAttribute("message", "" );
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			String msg = "<h1>Dados recebidos: " + request.getParameter("nome") + "<h1>";
			request.setAttribute("message", msg );
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
		}
	}

}
