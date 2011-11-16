<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
   <!-- Metro -->
   <div data-role="page" id="Metro" data-title="Metro">

       <div data-role="header" data-position="inline" data-theme="a">
           <c:url value="/" var="iniciourl"/>
            <a href="#home" data-icon="arrow-l" data-theme="a">Volver</a>
           <h1>Metro</h1>
       </div>
       <!-- /header -->

       <div data-role="content">
           <p>Dime la parada de metro m&aacute;s cercana a tu posici&oacute;n y te dire con que te vas a encontrar.</p>
           <div data-role="collapsible-set">
           <c:forEach items="${lineas }" var="linea">
               <div data-role="collapsible" data-collapsed="true" data-theme="a">
                   <h2><label style="background-color: <c:out value="${linea.color }" />;">&nbsp;L&iacute;nea <c:out value="${linea.numero }" />&nbsp;</label></h2>
                   <ul data-role="listview" data-inset="true" id="listlineas">
                   	<c:forEach items="${linea.paradas }" var="parada">
                   		<c:url value="/calificacion" var="opinionUrl">
                   			<c:param name="num1" value="${fn:substring(parada.codPostal, 3, 4)}" />
                   			<c:param name="num2" value="${fn:substring(parada.codPostal, 4, 5)}" />
                   		</c:url>
                       	<li><a href="#resultados" data-url="${opinionUrl }" style="color:<c:out value="${linea.color }" />;"><c:out value="${parada.nombre }" /></a></li>
                       </c:forEach>
                   </ul>                          
               </div>       
                </c:forEach>          
           </div>
       </div>
	<jsp:include page="footer.jsp" />
   </div>
   <!-- /Metro -->