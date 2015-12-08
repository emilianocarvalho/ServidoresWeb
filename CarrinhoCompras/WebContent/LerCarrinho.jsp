<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="br.com.estacio.carrinho.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<%@page import="java.util.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="Comprar?livro=Domindo+Ajax"> Dominando Ajax </a><br/>
<a href="Comprar?livro=Dominando+CSS"> Dominando CSS </a><br/>
<a href="Comprar?livro=Dominando+XHTML"> Dominando XHTML </a><br/>
<a href="Comprar?livro=Dominando+Javascript"> Dominando Javacript </a><br/>
<a href="Comprar?livro=Dominando+Eclipse"> Dominando Eclipse </a><br/>


	<%
		ArrayList lista = new ArrayList();

		lista = (ArrayList) session.getAttribute("lista");

		Iterator i = lista.iterator();

		while (i.hasNext()) {

			out.println(i.next());
		}
	%>

</body>
</html>