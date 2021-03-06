package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPg3
 */
@WebServlet(description = "Pagina 3", urlPatterns = { "/ServletPg3.do" })
public class ServletPg3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPg3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if (login.isEmpty() && senha.isEmpty()) {
			out.println("Informe os valores");
			response.sendRedirect("ServletPg2.do");
		}
		
		out.println("<html><head><title>Page 01</title></head>");
		out.println("<body>");
		out.println("<h1>Page 03</h1>");
		out.println("<p>Nome: "+nome+"</p>");
		out.println("<p>Sobrenome: "+sobrenome+"</p>");
		out.println("<p>Login: "+login+"</p>");
		out.println("<p>Senha: "+senha+"</p>");
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
