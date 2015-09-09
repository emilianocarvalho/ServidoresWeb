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
 * Servlet implementation class RetTabuada
 */
@WebServlet(description = "Receber um número informado e retornar a tabuada deste número", urlPatterns = { "/RetTabuada.do" })
public class RetTabuada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetTabuada() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Enumeration<String> e = request.getParameterNames();

		out.println("<head>");
		out.println("<title>Multiplicação de um número informado</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Multiplicação de um número informado</h1>");
		out.println("<table>");
		while(e.hasMoreElements())
		{
			Object obj = e.nextElement();
			String fieldName = (String) obj;
			String fieldValue = request.getParameter(fieldName);
			Integer fldValue = Integer.valueOf(fieldValue);
			
			for (int i = 1; i < 10; i++) {
				out.println("<tr>");
				out.println("<td> " + fieldValue + " x "+ i + " = " + fldValue * i + "</td>");			
				out.println("</tr>");
			}

		}        

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");		

		
		out.close();

	}

}