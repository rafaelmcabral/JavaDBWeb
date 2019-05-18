<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP getclientes</title>
</head>
<body>
<%@ page import="dao.*, modelo.*,servlets.*,jdbc.*" %>
<table border="1" cellspacing="0">
	<%
		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getClientes();
		
		for (Cliente cliente:clientes) {
	%>
	<tr>
		<td><%=cliente.getNome()%></td>
		<td><%=cliente.getEmail()%></td>
		<td><%=cliente.getEndereco()%></td>
	</tr>
	<%		
		}
	%>
</table>
</body>
</html>