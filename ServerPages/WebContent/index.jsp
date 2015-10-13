<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if (Math.random() >= 0.5) {
			out.println("Bom dia!<br/>");
		} else {
			out.println("Tenha um excelente dia!<br />");
		}

		for (int i = 0; i < 5; i++) {
			out.println("Seja bem vindo!<br/>");
		}
	%>

</body>
</html>