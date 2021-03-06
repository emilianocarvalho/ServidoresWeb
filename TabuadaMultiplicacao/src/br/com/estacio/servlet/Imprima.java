package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Imprima
 */
@WebServlet(description = "Imprimir a tabuada de 1 a 9", urlPatterns = { "/Imprima.do" })
public class Imprima extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Imprimindo de 1 a 9
		 */
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<head>");
		out.println("<title>Multiplicação de 1 a 9</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Multiplicação de 1 a 9</h1>");
		out.println("<table>");
		for (int i = 1; i < 10; i++) {
			out.println("<tr>");
			out.println("<td> 1 x "+ i + " = " + 1 * i + "</td>");			
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");		
		
		
	}

}
