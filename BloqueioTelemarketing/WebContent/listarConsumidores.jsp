<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.*,
    br.gov.pb.procon.dao.*,
    br.gov.pb.procon.model.*,
    java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar Consumidores</title>
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
</style>

</head>
<body>
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

		<%
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			ConsumidorDAO dao = new ConsumidorDAO();
			List<Consumidor> consumidores = dao.getLista();

			for (Consumidor consumidor : consumidores) {
		%>
		<tr>
			<td><%=consumidor.getCn_nome()%></td>
			<td><%=consumidor.getCn_email()%></td>
			<td><%=consumidor.getCn_telb1()%></td>
			<td><%=consumidor.getCn_telb2()%></td>
			<td><%=consumidor.getCn_telb3()%></td>
			<td><%=consumidor.getCn_telb4()%></td>
			<td><%=consumidor.getCn_lastip()%></td>			
			<td><%=sdf.format(consumidor.getCn_lastlogin().getTime())%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>