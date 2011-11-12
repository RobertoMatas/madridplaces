<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administración</title>
</head>
<body>
<div>
	<c:url value="/j_spring_security_logout" var="logout" scope="page" />
	<a href="${logout }" data-role="button" data-icon="arrow-r">Logout</a>
</div>
<div>
<ul>
	<c:forEach items="${calificaciones }" var="c">
		<li>
			<c:url value="/calificacion/edit" var="editUrl">
				<c:param name="id" value="${c.id }"/>
			</c:url>
			<a href="${editUrl }">Editar opinión sobre <c:out value="${c.codPostal }" /> </a>
		</li>
	
	</c:forEach>

</ul>
</div>
</body>
</html>