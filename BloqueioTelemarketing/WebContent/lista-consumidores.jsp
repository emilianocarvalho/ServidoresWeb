<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista Consumidores</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
}

th {
	text-align: left;
}

img {
	width: 200px;
	display: block;
}
</style>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<c:import url="cabecalho.jsp" />

	<jsp:useBean id="dao" class="br.gov.pb.procon.dao.ConsumidorDAO" />
	<table>
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Telefone 1</th>
			<th>Telefone 2</th>
			<th>Telefone 3</th>
			<th>Telefone 4</th>
			<th>Último IP</th>
			<th>Ultimo Login</th>
		</tr>
		<c:forEach var="consumidor" items="${dao.lista}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
				<td>${consumidor.cn_nome}</td>
				<td><c:choose>
						<c:when test="${not empty consumidor.cn_email}">
							<a href="mailto:${consumidor.cn_email}">${consumidor.cn_email}</a>
						</c:when>
						<c:otherwise>
    					E-mail não informado
  					</c:otherwise>
					</c:choose></td>
				<td>${consumidor.cn_telb1}</td>
				<td>${consumidor.cn_telb2}</td>
				<td>${consumidor.cn_telb3}</td>
				<td>${consumidor.cn_telb4}</td>
				<td>${consumidor.cn_lastip}</td>
				<td>
				<fmt:formatDate value="${consumidor.cn_lastlogin.time}"
					pattern="dd/MM/yyyy" />
					</td>
			</tr>

		</c:forEach>
	</table>
	<c:import url="rodape.jsp" />
</body>
</html>