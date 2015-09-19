package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(description = "Controll Session", urlPatterns = { "/MainServlet.do" })
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ArrayList<String> txtDig = new ArrayList<String>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession sessao = request.getSession();
		
		
		//ArrayList<String> textos = (ArrayList<String>) sessao.getAttribute("textos");
		String textos = (String)sessao.getAttribute("textos"); //get the list from session
		
		if(textos == null) {
			System.out.println("getAttribute textos foi null");
			sessao.setAttribute("textos",textos); //finally store the processed list
		} else {
			//sessao = request.getSession(true);
			
			//here do some processing with orders
			String texto = request.getParameter("textos"); // recebe texto do form e adiciona a sessão
			
			if (!texto.isEmpty()) {
				
				sessao.setAttribute("textos", texto);
			}
			
			//for (int i = 0; i < sessao.getValueNames().length; i++) {
			//	System.out.println(sessao.getAttributeNames().toString());
			//}
			
			
			System.out.println(textos + "------------------------------->>");
		}
				
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Page 02</title></head>");
		out.println("<body>");
		out.println("<h1>Página Texto</h1>");
		out.println("<form action='MainServlet.do'>");
		out.println("Texto: <input type='text' name='texto'/><br/>");
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
