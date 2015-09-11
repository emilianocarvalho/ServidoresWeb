package br.com.estacio.serverweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SaveSessao
 */
@WebServlet("/SaveSessao.do")
public class SaveSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int qtdAcessos;
	
	/*
	 * Construct
	 */
	public SaveSessao() {
		super();
		qtdAcessos = 0;
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		/*
		 * Armazenando em variável
		 */
		qtdAcessos++;
		
		/*
		 * Armazenado na sessao
		 */
		HttpSession sessao = request.getSession();
		
		Integer qtdSessao = (Integer) sessao.getAttribute("qtdSessao");
		
		if (qtdSessao == null) {
			sessao.setAttribute("qtdSessao", 0);
		} else {
			sessao.setAttribute("qtdSessao", ++qtdSessao);
		}
		
		/*
		 * preparando resposta
		 */
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>SaveSessao</title></head>");
		out.println("<body>");
		out.println("<h1>Teste Servlet</h1>");
		out.println("<h2>Variável = "+qtdAcessos+"</h2>");
		out.println("<h2>Sessão = "+qtdSessao+"</h2>");
		out.close();
	}

}
