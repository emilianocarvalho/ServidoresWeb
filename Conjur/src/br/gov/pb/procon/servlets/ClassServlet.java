package br.gov.pb.procon.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


import br.gov.pb.procon.model.*;



/**
 * Servlet implementation class ClassServlet
 */
@WebServlet(value = "/arquivos/*")
public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Arquivo arquivo = new Arquivo();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		Collection<Formulario> formularios = arquivo.listarFormularios();
		for (Formulario formulario : formularios) {
			out.print(formulario);
		}
	}

}
