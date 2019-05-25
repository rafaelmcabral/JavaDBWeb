<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Testejstl.jsp</title>
</head>
<body>
<jsp:useBean id="dao" class="dao.ClienteDao"></jsp:useBean>
<table>
	<c:forEach var="cliente" items="${dao.getClientes()}">
		<tr>
			<td>${cliente.getNome()}</td>
			<td>
				<c:if test="${not empty cliente.getEmail()}">
					<a href="mailto:${cliente.getEmail()}">${cliente.getEmail()}</a>
				</c:if>
				<c:if test="${empty cliente.getEmail()}">
					E-mail não informado
				</c:if>
			</td>
			<td>${cliente.getEndereco()}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>