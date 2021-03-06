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
 * Servlet implementation class GetDados
 */
@WebServlet(description = "Recebe os dados da pessoa", urlPatterns = { "/GetDados.do" })
public class GetDados extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		Pessoa p = new Pessoa();

		out.println("<head>");
		out.println("<title>Calcular IMC</title>");
		out.println("<style>");
		out.println("table, th, td {border: 1px solid black; border-collapse: collapse;}");
		out.println("th, td {padding: 5px;}");
		out.println("th {text-align: left;}");
		out.println("</style>");
		
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Calcular IMC</h1>");
		out.println("<table>");
		out.println("<tr>");

		p.setNome(request.getParameter("nome"));
		p.setPeso(Double.valueOf(request.getParameter("peso")));
		p.setAltura(Double.valueOf(request.getParameter("altura")));

		/*
		 * Calcular o IMC
		 */
		out.println("<tr>");
		out.println("<td>Dados Recebidos</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Nome</th>");
		out.println("<th>Peso</th>");
		out.println("<th>Altura</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+p.getNome()+"</td>");
		out.println("<td>"+p.getPeso()+"</td>");
		out.println("<td>"+p.getAltura()+"</td>");
		out.println("</tr>");

		Double peso = p.getPeso();
		Double altura = p.getAltura();
		Double ResultadoIMC = peso/Math.pow(altura,2);
		String msgRet;

		if( ResultadoIMC > 30 )
			msgRet = "Obesidade";

		else if (ResultadoIMC > 25)
			msgRet = "Acima do peso normal";

		else if (ResultadoIMC > 18.5)
			msgRet = "Peso normal";

		else
			msgRet = "Abaixo do peso normal";

		out.println("<tr>");
		out.println("<td></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Resultado</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Avaliação</td>");			
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>IMC de " + Double.valueOf(String.format(Locale.US, "%.2f",ResultadoIMC)) + "</td>");			
		out.println("<td> <b>" +  msgRet + "</b></td>");			
		out.println("</tr>");

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");		


		out.close();		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		Pessoa p = new Pessoa();

		out.println("<head>");
		out.println("<title>Calcular IMC</title>");
		out.println("<style>");
		out.println("table, th, td {border: 1px solid black; border-collapse: collapse;}");
		out.println("th, td {padding: 5px;}");
		out.println("th {text-align: left;}");
		out.println("</style>");
		
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Calcular IMC</h1>");
		out.println("<table>");
		out.println("<tr>");

		p.setNome(request.getParameter("nome"));
		p.setPeso(Double.valueOf(request.getParameter("peso")));
		p.setAltura(Double.valueOf(request.getParameter("altura")));

		/*
		 * Calcular o IMC
		 */
		out.println("<tr>");
		out.println("<td>Dados Recebidos</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Nome</th>");
		out.println("<th>Peso</th>");
		out.println("<th>Altura</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+p.getNome()+"</td>");
		out.println("<td>"+p.getPeso()+"</td>");
		out.println("<td>"+p.getAltura()+"</td>");
		out.println("</tr>");

		Double peso = p.getPeso();
		Double altura = p.getAltura();
		Double ResultadoIMC = peso/Math.pow(altura,2);
		String msgRet;

		if( ResultadoIMC > 30 )
			msgRet = "Obesidade";

		else if (ResultadoIMC > 25)
			msgRet = "Acima do peso normal";

		else if (ResultadoIMC > 18.5)
			msgRet = "Peso normal";

		else
			msgRet = "Abaixo do peso normal";

		out.println("<tr>");
		out.println("<td></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Resultado</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Avaliação</td>");			
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>IMC de " + Double.valueOf(String.format(Locale.US, "%.2f",ResultadoIMC)) + "</td>");			
		out.println("<td> <b>" +  msgRet + "</b></td>");			
		out.println("</tr>");

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");		


		out.close();		
	}
	
}
