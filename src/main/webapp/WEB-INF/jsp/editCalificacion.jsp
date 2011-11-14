<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Administraci&oacute;n MadridPlaces</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <link href="<c:url value="/resources/css/estilo.css" />" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="div_centrado">	
<div id="div_sesion">	
	<c:url value="/j_spring_security_logout" var="logout" scope="page" />
	<c:url value="/admin" var="admin" scope="page" />
   <div id="div_volver">
   		<a href="${admin }" data-role="button" data-icon="arrow-r"  class="linkBoton">Volver</a>
   	</div>
   <a href="${logout }" data-role="button" data-icon="arrow-r" class="linkBoton">Logout</a>		
</div>

<div id="div_contenido">
<form:errors path="*" />
<c:set var="submitUrl"><c:url value="/calificacion/edit" /></c:set>
<form:form modelAttribute="calificacion" action="${submitUrl }" method="post">
	<form:hidden path="id"/>
	<form:hidden path="codPostal"/>
	<fieldset>
		<legend class="leyenda">Cambiando opinión sobre <c:out value="${calificacion.codPostal}" /></legend>
		<p>
            <form:label path="comentario">Comentario:</form:label>
		    <form:input path="comentario" cssClass="formulario" size="120"/>
		</p>
        <p>
            <form:label path="nivel">Peligrosidad:</form:label>
		    <form:select path="nivel" cssClass="formulario">
				<form:options items="${peligrosidades}" 
					itemValue="id" itemLabel="nivel" />
			</form:select>
        </p>
        <p align="center">
		    <input type="submit" value="Editar" class="boton" />
        </p>
	</fieldset>

</form:form>
</div>
<div id="div_pie">&copy; Grupo 10</div>
</div>
</body>
</html>