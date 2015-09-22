<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Usando o verbo Get</h1>

	<form method='post' action='MainServlet.do'>
		<p>
			Nome <input type='text' name='nome'> <br />
		</p>
		<p>
			Peso <input type='text' name='peso'> <br />
		</p>
		<p>
			Altura <input type='text' name='altura'> <br />
		</p>
		<p>
			<input type='submit' value='Calcular'>
		</p>
	</form>

	

	<c:if test="${not empty message}">
		${message}
	</c:if>


</body>
</html>