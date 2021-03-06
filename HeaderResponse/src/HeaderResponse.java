

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderResponse
 */
@WebServlet(
		description = "Servlet Header Response", 
		urlPatterns = { "/HeaderResponse.do" },
		/*
		 *  passando parâmetro pela anotação - questionado
		 */
		initParams = {
				@WebInitParam(name = "param1", value = "value1"),
				@WebInitParam(name = "param2", value = "value2")}
		)
public class HeaderResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*
	 *  recuperando os parametros
	 */
	private String parametro1;
	private String parametro2;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HeaderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * usando a sobrecarga do método init()(non-Javadoc)
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config); // mantra #1
		this.parametro1 = config.getInitParameter("param1");
		this.parametro2 = config.getInitParameter("param2");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String chave;
		String valor;

		response.setContentType("text/html;charset=UTF-8");

		Enumeration<String> header = request.getHeaderNames();

		PrintWriter out = response.getWriter();
		out.println("<head>");
		out.println("<style>");
		out.println("table, th, td {");
		out.println("border: 1px solid black;");
		out.println("border-collapse: collapse;");
		out.println("}");
		out.println("th, td {");
		out.println("padding: 5px;");
		out.println("}");
		out.println("th {");
		out.println("text-align: left;");
		out.println("}");
		out.println("</style></head>");
		out.println("<body>");
		out.println("<h2>Informações contidas no Header</h2>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>Chave</th>");
		out.println("<th>Valor</th>"); 
		out.println("</tr>");
		while (header.hasMoreElements()) {
			chave = (String) header.nextElement();
			valor = request.getHeader(chave);
			out.println("<tr>");			
			out.println("<td>" + chave + "</td><td>" + valor + "</td>");
			out.println("</tr>");
		}
		out.println("<table>");
		out.println("<p><b>User-agent:</b></p>");
		out.println(request.getHeader("user-agent"));

		/*
		 * recuperando parâmetros por meio de um objeto da classe ServletConfig
		 */

		out.println("<h2>Parâmetro - objeto da classe ServletConfig</h2>");

		ServletConfig config = getServletConfig();

		String parametro1= config.getInitParameter("param1");
		out.println("Valor do parâmetro 1: " + parametro1);

		String parametro2 = config.getInitParameter("param2");
		out.println("<br>Valor do parâmetro 1: " + parametro2);

		/*
		 * ou usando direto na saída
		 */
		out.println("<h2>Parâmetro - usando direto na saída</h2>");

		out.println("Valor do parâmetro 1: " + getServletConfig().getInitParameter("param1"));
		out.println("</body>");
		out.close();		
		

	}

}
