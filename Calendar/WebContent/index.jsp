<%@page import="br.com.estacio.servlet.Usuario"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar</title>
</head>
<body>
	<%
		Calendar c = Calendar.getInstance();
		String hoje = SimpleDateFormat.getInstance().format(c.getTime());
	%>
	<h1>Hoje é <%=hoje%></h1>
	<%
		Usuario user = new Usuario();
		user.setNome("Emiliano");
		user.setIdade(19);
		String nome = user.getNome();
		int idade = user.getIdade();
	%>

	<h1>Nome <%=nome%>, Idade <%=idade %> anos</h1>
	
	<% if (Math.random() < 0.5) {%>
	Tenha um <b>Bom</b> dia!
	<br />
	<% } else { %>
	Tenha um <b>excelente</b> dia!
	<%
		}
	%>
	<h1>Seja bem vindo!</h1>
	<%
		for (int i = 0; i < 10; i++) {
	%>
	Tenha um <b>bom</b> dia!
	<br />
	<%
		}
	%>
	<h2>Essa página foi desenvolvida para...</h2>
</body>
</html>