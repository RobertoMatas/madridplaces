<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>The Man of the Vara Mobile</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.0b2/jquery.mobile-1.0b2.min.css" />
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.2.min.js"></script>
        <script type="text/javascript" src="http://code.jquery.com/mobile/1.0b2/jquery.mobile-1.0b2.min.js"></script>
    </head>
<body>
    <!-- Cód.Postal -->
    <div data-role="page" id="CodPostal" data-title="C&oacute;d. Postal">
        <!--Header-->
        <div data-role="header" data-position="inline" data-theme="a">
        	<c:url value="/" var="iniciourl"/>
            <a href="${iniciourl }" data-icon="arrow-l" data-theme="a">Volver</a>
            <h1>C&oacute;d. Postal</h1>
        </div>
        <!--/Header-->

        <div data-role="content">
        <span><form:errors path="*" /></span>
        <c:url value="/calificacion" var="submitUrl" />
        <form:form action="${submitUrl }" method="post" modelAttribute="cp">
            <p>Dime el C&oacute;d.Postal m&aacute;s cercano a tu posici&oacute;n y te dire con que te vas a encontrar.</p>
            <h1>
                <p>280</p>
                <input type="range" name="num1" id="slider-2" value="0" min="0" max="9" data-theme="a" data-track-theme="d" />
                <input type="range" name="num2" id="slider-3" value="0" min="0" max="9" data-theme="a" data-track-theme="d" />
            </h1>                
           <div data-type="horizontal">
            <button type="submit" data-theme="a">Buscar</button>
           </div>                
        </form:form>
        </div>

        <jsp:include page="footer.jsp" />
    </div>
    <!-- /Cód.Postal -->

</body>
</html>