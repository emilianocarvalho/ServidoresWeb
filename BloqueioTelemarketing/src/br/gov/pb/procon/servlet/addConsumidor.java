package br.gov.pb.procon.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.SQLException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.gov.pb.procon.dao.ConsumidorDAO;
import br.gov.pb.procon.model.Consumidor;

/**
 * Servlet implementation class addConsumidor
 */
@WebServlet(description = "Adiciona consumidores", urlPatterns = { "/addConsumidor.do" })
public class addConsumidor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		// pegando os parâmetros do request
		String nome = request.getParameter("cn_nome");
		String email = request.getParameter("cn_email");
		String telb1 = request.getParameter("cn_telb1");
		String telb2 = request.getParameter("cn_telb2");
		String telb3 = request.getParameter("cn_telb3");
		String telb4 = request.getParameter("cn_telb4");
		String retBlq = request.getParameter("cn_bltmk");

		if (retBlq == null)
			retBlq = "0";
		
		Integer bltmk = Integer.parseInt(retBlq);

		/**
		 * consumidor
		 */
		Consumidor consumidor = new Consumidor();
		consumidor.setCn_nome(nome);
		consumidor.setCn_email(email);
		consumidor.setCn_telb1(telb1);
		consumidor.setCn_telb2(telb2);
		consumidor.setCn_telb3(telb3);
		consumidor.setCn_telb4(telb4);
		consumidor.setCn_bltmk(bltmk);
		consumidor.setCn_lastip(InetAddress.getLocalHost().getHostAddress());		
		consumidor.setCn_lastlogin(Calendar.getInstance());

		ConsumidorDAO dao;
		try {
			dao = new ConsumidorDAO();
			dao.adiciona(consumidor);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// imprime o nome do contato que foi adicionado
		out.println("<html>");
		out.println("<body>");
		out.println("Consumidor " + consumidor.getCn_nome()
				+ " adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
	}

}
