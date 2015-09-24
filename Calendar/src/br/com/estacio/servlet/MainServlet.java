package br.com.estacio.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServelet
 */
@WebServlet(description = "Teste JSP", urlPatterns = { "/MainServelet.do" })
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		Calendar c = Calendar.getInstance();
		String hoje = SimpleDateFormat.getInstance().format(c.getTime());
		
		request.setAttribute("message", hoje );
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
