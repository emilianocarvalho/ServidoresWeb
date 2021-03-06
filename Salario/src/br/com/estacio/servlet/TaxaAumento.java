package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaxaAumento
 */
@WebServlet(description = "Informar a taxa de aumento do salário", urlPatterns = { "/TaxaAumento.do" })
public class TaxaAumento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaxaAumento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("Usando o verbo Post");
		
		out.println("<form method='post' action='Calcular.do'>");
		out.println("Salário <input type='text' name='salario'> <br/>");
		out.println("Taxa Aumento <input type='text' name='taxa'> <br/>");
		out.println("<input type='submit' value='Calcular'>");
		out.println("</form>");

		out.close();
	}

}
