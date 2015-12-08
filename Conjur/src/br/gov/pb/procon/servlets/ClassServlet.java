package br.gov.pb.procon.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.gov.pb.procon.model.Arquivo;
import br.gov.pb.procon.model.rest.Formularios;



/**
 * Servlet implementation class ClassServlet
 */
@WebServlet(value = "/arquivos/*")
public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Arquivo arquivo = new Arquivo();
	
	private static JAXBContext context;
	
	static {
		try {
			context = JAXBContext.newInstance(Formularios.class);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Marshaller marshaller = context.createMarshaller();
			resp.setContentType("application/xml;charset=UTF-8");
			PrintWriter out = resp.getWriter();
			
			Formularios formularios = new Formularios();
			formularios.setFormularios(new ArrayList<>(arquivo.listarFormularios()));
			marshaller.marshal(formularios, out);
			
		} catch (Exception e) {
			resp.sendError(500, e.getMessage());
		}
	}

}
