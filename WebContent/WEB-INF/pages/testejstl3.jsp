<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Testejstl.jsp WEB-INF</title>
<script type="text/javascript">
function realizarExclusao(id) {
	if (confirm("Deseja excluir o cliente " + id + "?")) {
		window.location.href = "mvc?regra=RegraDeleteClientes&id=" + id;
	}
	return false;
}
</script>
</head>
<body>
<table>
	<c:forEach var="cliente" items="${clientes}">
		<tr>
			<td>${cliente.getId()}</td>
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
			<td><a href="javascript:void(0)" onClick="return realizarExclusao(${cliente.getId()})">Excluir</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>