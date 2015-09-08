

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Iniciar
 */
//@WebServlet(description = "Imprime de 1 a 90", urlPatterns = { "/Iniciar.do" })
public class Iniciar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Iniciar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>This is a Servlet</h1>");
		out.println("<p>Hello World</p>");
		out.println("<p>");
		for (int i = 0; i < 100; i++) {
			out.print("Item: " + i + "<br />");			
		}		
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
	
	}

}
