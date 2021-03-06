package br.com.estacio.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Listar
 */
@WebServlet(description = "Listar dados do Header", urlPatterns = { "/Listar.do" })
public class Listar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chave;
		String valor;

		response.setContentType("text/html;charset=UTF-8");

		Enumeration<String> header = request.getHeaderNames();

		PrintWriter out = response.getWriter();
		
		out.println("<head>");
		out.println("<style>");
		out.println("table, th, td {border: 1px solid black; border-collapse: collapse;}");
		out.println("th, td {padding: 5px;}");
		out.println("th {text-align: left;}");
		out.println("</style>");
		out.println("</head>");

		out.println("<body>");

		out.println("<h2>Informações contidas no Header</h2>");

		out.println("<table>");
			out.println("<tr>");
				out.println("<th>Chave</th>");
				out.println("<th>Valor</th>"); 
			out.println("</tr>");
			
			while (header.hasMoreElements()) {
				
				chave = (String) header.nextElement();
				valor = request.getHeader(chave);

				out.println("<tr>");			
					out.println("<td>" + chave + "</td>");
					out.println("<td>" + valor + "</td>");
				out.println("</tr>");
				
			}
		out.println("<table>");
		out.close();
	}

}
