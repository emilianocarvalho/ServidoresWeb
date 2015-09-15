package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPg1
 */
@WebServlet(description = "Página 1", urlPatterns = { "/ServletPg1.do" })
public class ServletPg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Page 01</title></head>");
		out.println("<body>");
		out.println("<h1>Page 01</h1>");
		out.println("<form action='ServletPg2.do'>");
		out.println("Nome: <input type='text' name='nome'/><br/>");
		out.println("Sobrenome: <input type='text' name='sobrenome'/><br/>");
		out.println("<input type='submit' value='enviar'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
