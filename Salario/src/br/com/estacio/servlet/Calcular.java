package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcular
 */
@WebServlet("/Calcular.do")
public class Calcular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		Double salario = Double.valueOf(request.getParameter("salario"));
		Double taxa = Double.valueOf(request.getParameter("taxa"));
		
		out.println("<h1>Valores Calculados</h1>");
		out.println("<p>Novo Salario:" + Double.valueOf(String.format(Locale.US, "%.2f",salario + (salario*taxa/100))) + "</p>");

	}

}
