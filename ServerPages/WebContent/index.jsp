<%@page import="br.serverpages.main.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page errorPage="errorpage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%@ include file="cabecalho.jsp"%>
<body>

	<%!int acessos = 0;%>
	<%
		Usuario u = new Usuario();
		u.setNome("User");
		u.setEmail("user@user.mail");
		/* 		
		 if(u ==null) {
		 throw new ServletException("Usuário não criado");
		 } */

		Date d = new Date();
		String hoje = java.text.DateFormat.getDateInstance().format(d);

		if (Math.random() >= 0.5) {
			out.println("Bom dia!<br/>");
		} else {
			out.println("Tenha um excelente dia!<br />");
		}

		for (int i = 0; i < 5; i++) {
			out.println("Seja bem vindo!<br/>");
		}
		acessos++;

		String nome = request.getParameter("nome");
		if (nome != null) {
	%>
	<div>
	<h2>
		Seu nome é
		<%=nome%></h2> </div>
	<%
		} else {
	%>
	<form action="index.jsp" method="post">
		<input type="text" name="nome" /><br /> <input type="submit"
			value="Enviar" />
	</form>
	<%
		}
	%>
	<h1>
		Hoje é
		<%=hoje%></h1>
	<p>
		Acessos
		<%=acessos%>

		<jsp:include page="rodape.jsp">
</body>
</html>