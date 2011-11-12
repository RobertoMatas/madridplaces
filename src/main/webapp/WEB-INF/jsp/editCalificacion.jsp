<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<c:url value="/j_spring_security_logout" var="logout" scope="page" />
	<c:url value="/admin" var="admin" scope="page" />
	<ul>
		<li>
			<a href="${logout }" data-role="button" data-icon="arrow-r">Logout</a>
		</li>
		<li>
			<a href="${admin }" data-role="button" data-icon="arrow-r">Volver</a>
		</li>
	</ul>
</div>
<div>
<form:errors path="*" />
<c:set var="submitUrl"><c:url value="/calificacion/edit" /></c:set>
<form:form modelAttribute="calificacion" action="${submitUrl }" method="post">
	<form:hidden path="id"/>
	<form:hidden path="codPostal"/>
	<fieldset>
		<legend>Cambiando opinión sobre <c:out value="${calificacion.codPostal}" /></legend>
		<p><c:out value="${calificacion.codPostal}" /></p>
	</fieldset>
	<fieldset>
		<legend>Opinión</legend>
		<form:label path="comentario">Comentario:</form:label>
		<form:input path="comentario"/>
		<form:label path="nivel">Peligrosidad:</form:label>
		<form:select path="nivel">
			<form:options items="${peligrosidades}" 
				itemValue="id" itemLabel="nivel" />
		</form:select>
		<input type="submit" value="Editar" />
	</fieldset>
</form:form>
</div>
</body>
</html>