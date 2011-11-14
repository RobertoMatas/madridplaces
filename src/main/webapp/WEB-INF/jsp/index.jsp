<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
  <!-- INICIO -->
  <div data-role="page" id="inicio" data-title="Inicio">
      <!--Header-->
      <div data-role="header">
          <a rel="external" data-icon="info" href="#info">Info</a>
          <h1>Inicio</h1>
          <a rel="external" href="#grupoX">Grupo 10</a>
      </div>
      <!--/Header-->
      <div data-role="content">
             Estimado turista, Madrid tiene muchos lugares agradables, otros no tanto y hay mucha tontería suelta,
          <p  align="center">¡¡NO SE SI ME ENTIENDES!!.</p>
          <p>Permiteme ayudarte en tu viaje, para evitar caer en zonas no deseables.</p>
              <ul data-role="listview" data-inset="true">
                <li data-theme="a">¿D&oacute;nde te encuentras?</li>
				
				<li data-theme="c"
					class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-li-has-icon ui-btn-up-c"><div
						class="ui-btn-inner ui-li">
						<div class="ui-btn-text">
						<c:url value="/codPostal" var="codPostalUrl" />
							<a href="${codPostalUrl }" class="ui-link-inherit">
							 <img src="<c:url value="/resources/images/correos.jpg" />" alt="Codigo Postal" class="ui-li-icon ui-li-thumb" height="16" width="16px" >
							 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Código Postal</a>
						</div>
						<span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span>
					</div>
				</li>

				<li data-theme="c"
					class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-li-has-icon ui-btn-up-c"><div
						class="ui-btn-inner ui-li">
						<div class="ui-btn-text">
                  	  	<c:url value="/lineas" var="lineasUrl" />
							<a href="${lineasUrl }" class="ui-link-inherit" data-ajax="false"><img
								src="<c:url value="/resources/images/metro.png" />" alt="Metro" class="ui-li-icon ui-li-thumb" height="16" width="16px" >
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Metro</a>
						</div>
						<span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span>
					</div>
				</li>
			</ul>
      </div>
     <jsp:include page="footer.jsp" />
  </div>

  <!-- Info -->
  <div data-role="page" id="info" data-title="Informaci&oacute;n">
      <!--Header-->
      <div data-role="header" data-position="inline" data-theme="a">
          <a href="#inicio" data-icon="arrow-l" data-theme="a">Volver</a>
          <h1>Informaci&oacute;n</h1>
      </div>
      <!--/Header-->

      <div data-role="content" data-theme="a">
          <p>Danos el código postal de la zona dónde te encuentras y te diremos qué tal es la zona</p>
          <sec:authorize access="hasRole('ROLE_ADMIN')">
	          <c:url value="/admin" var="adminUrl" />
	          <a href="${adminUrl }" data-icon="arrow-r" data-theme="a" data-ajax="false">Administrar</a>
          </sec:authorize>
      </div>

      <jsp:include page="footer.jsp" />
  </div>
  <!-- /Info -->

  <!-- Grupo X -->
  <div data-role="page" id="grupoX" data-title="Grupo 10">
      <!--Header-->
      <div data-role="header" data-position="inline" data-theme="a">
          <a href="#inicio" data-icon="arrow-l" data-theme="a">Volver</a>
          <h1>Grupo 10</h1>
      </div>
      <!--/Header-->

      <div data-role="content" data-theme="a">
          <p>Roberto Matas Pascual <strong>64414</strong></p>
          <p>Javier Urosa Domingo</p>
          <p>Alicia Mª Guerra Lafuente</p>
          <p>Víctor Moreno Sanz <strong>64242</strong></p>
          <p>Alejandro Gil-Dávila</p>
      </div>

      <jsp:include page="footer.jsp" />
  </div>
  <!-- /Grupo X -->
</body>
</html>