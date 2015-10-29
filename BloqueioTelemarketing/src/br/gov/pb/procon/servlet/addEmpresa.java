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

import br.gov.pb.procon.dao.FornecedorDAO;
import br.gov.pb.procon.model.Fornecedor;

/**
 * Servlet implementation class addEmpresa
 */
@WebServlet(description = "Cadastro da Empresa", urlPatterns = { "/addEmpresa.do" })
public class addEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		// pegando os parâmetros do request
		String razao = request.getParameter("fn_razao_social");
		String cnpj = request.getParameter("fn_cnpj");
		String email = request.getParameter("fn_email");
		String telb4 = request.getParameter("fn_telb4");
		
		int ativo = 0;

		/**
		 * Fornecedor
		 */
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setFn_razao_social(razao);
		fornecedor.setFn_email(email);
		fornecedor.setFn_cnpj(cnpj);
		fornecedor.setFn_telb4(telb4);
		fornecedor.setFn_ativo(ativo);
		fornecedor.setFn_lastip(InetAddress.getLocalHost().getHostAddress());		
		fornecedor.setFn_lastlogin(Calendar.getInstance());

		FornecedorDAO dao;
		try {
			dao = new FornecedorDAO();
			dao.adiciona(fornecedor);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// imprime o nome do contato que foi adicionado
		out.println("<html>");
		out.println("<body>");
		out.println("Fornecedor " + fornecedor.getFn_razao_social()
				+ " adicionado com sucesso");
		out.println("<a href='index.html'>Retornar</a>" );
		out.println("</body>");
		out.println("</html>");
	}

}
