<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome JSP</title>
</head>
<body>
	<%-- Comentario JSP --%>
	<!-- Comentario html -->
	<% String mensagem = "Bem-vindo ao JSP"; %>
	<% out.println(mensagem); %><br /><br /><%-- Variável implícita do Java --%>
	<!-- Variável out do tipo JSPWritter que possui o metodo println -->
	<!-- Imprimimos utilizando scriptlet -->
	<h1>Seja bem-vindo ao JavaServer Pages</h1>
	<%= mensagem %><br /><br />
	<!-- Imprimimos utilizando expressões JSP -->
	<% System.out.println("Onde vai sair esta mensagem???"); %>
</body>
</html>