<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teste Insert Client</title>
</head>
<body>
	<form action="mvc" method="post">
		<!-- <input type="hidden" name="regra" value="InsertCliente" />-->
		<input type="hidden" name="regra" value="TestePrimeiraRegraFake" />
		Nome: <input type="text" name="nome"/><br/>	
		Email:<input type="text" name="email"/><br/>	
		Endere�o: <input type="text" name="endereco"/><br/>
		
		<input type="submit" value="Inserir">	
	</form>
</body>
</html>