package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPg2
 */
@WebServlet(description = "Página 2", urlPatterns = { "/ServletPg2.do" })
public class ServletPg2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPg2() {
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
		
		if (nome.isEmpty() && sobrenome.isEmpty()) {
			out.println("Informe os valores");
			response.sendRedirect("ServletPg1.do");
		}
		
		out.println("<html><head><title>Page 02</title></head>");
		out.println("<body>");
		out.println("<h1>Page 02</h1>");
		out.println("<form action='ServletPg3.do'>");
		out.println("<input type='hidden' name='nome' value="+nome+"/>");
		out.println("<input type='hidden' name='sobrenome' value="+sobrenome+"/>");
		out.println("Login: <input type='text' name='login'/><br/>");
		out.println("Senha: <input type='password' name='senha'/><br/>");
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
