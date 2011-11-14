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
        <script type="text/javascript" charset="utf-8" src="<c:url value="/resources/js/phonegap-1.1.0.js" />"></script>
    </head>
<body>
	
   <!-- Resultados -->
   <div data-role="page" id="resultados" data-title="resultados">
       <!--Header-->
       <div data-role="header" data-position="inline" data-theme="a">
           <c:url value="/" var="iniciourl"/>
            <a href="${iniciourl }" data-icon="arrow-l" data-theme="a">Inicio</a>
           <h1>Resultados</h1>
       </div>
       <!--/Header-->

       <div data-role="content" data-theme="a">
         <h1>Peligrosidad <c:out value="${calificacion.min } - ${calificacion.max }" /> %</h1>
           <c:choose>
           		<c:when test="${calificacion.nivel eq 'MUY_SEGURO' }">
           		<p><img src="<c:url value="/resources/images/carita_verde.png" />" alt="Peligrosidad" /></p>
           		</c:when>
           		<c:when test="${calificacion.nivel eq 'SEGURO' }">
           		<p><img src="<c:url value="/resources/images/carita_verde_amarilla.png" />" alt="Peligrosidad" /></p>
           		</c:when>
           		<c:when test="${calificacion.nivel eq 'MEDIO' }">
           		<p><img src="<c:url value="/resources/images/carita_amarilla.png" />" alt="Peligrosidad" /></p>
           		</c:when>
           		<c:when test="${calificacion.nivel eq 'PELIGROSO' }">
           		<p><img src="<c:url value="/resources/images/carita_naranja.png" />" alt="Peligrosidad" /></p>
           		</c:when>
           		<c:when test="${calificacion.nivel eq 'MUY_PELIGROSO' }">
           			<p><img src="<c:url value="/resources/images/carita_roja.png" />" alt="Peligrosidad" /></p>
           		</c:when>
           		<c:otherwise> <p></p></c:otherwise>
           </c:choose>

           <p><c:out value="${calificacion.comentario }" /></p>
       </div>

       <jsp:include page="footer.jsp" />
   </div>
   <!-- /Resultados -->
</body>
</html>