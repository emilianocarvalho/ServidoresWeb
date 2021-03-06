package br.com.estacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		HttpSession sessao = request.getSession();

		ArrayList<String> textos = (ArrayList<String>) sessao.getAttribute("textos");

		if(textos == null) {
			textos = new ArrayList<String>();
			sessao.setAttribute("textos",textos); //finally store the processed list
		} else {

			String texto = request.getParameter("texto"); 

			if (!texto.isEmpty()) {
				textos.add(texto);
				sessao.setAttribute("textos", textos);
				for (int i = 0; i < textos.size(); i++) 
				{
					System.out.println(textos.get(i));
				}
				System.out.println(textos + "------------------------------->>");
			}

		}

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
