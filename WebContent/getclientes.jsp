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
<ul>
	<%
		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getClientes();
		
		for (Cliente cliente:clientes) {
	%>
	<li><%=cliente.getNome()%>,<%=cliente.getEmail()%>,<%=cliente.getEndereco()%></li>
	<%		
		}
	%>
</ul>
</body>
</html>