<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!int acessos = 0;%>
	<%
		java.util.Date d = new java.util.Date();
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
			<h2>Seu nome é <%=nome %></h2>
			<%
		} else {
			%> 
			<form action="index.jsp" method="post">
			<input type="text" name="nome" /><br/>
			<input type="submit" value="Enviar"/>
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
</body>
</html>