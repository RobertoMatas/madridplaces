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
        <script type="text/javascript" charset="ISO-8859-1" src="<c:url value="/resources/js/madridplaces.js" />"></script>
        <script type="text/javascript" src="http://code.jquery.com/mobile/1.0b2/jquery.mobile-1.0b2.min.js"></script>
        <script type="text/javascript" charset="ISO-8859-1" src="<c:url value="/resources/js/phonegap-1.1.0.js" />"></script>
    </head>
<body>
  <!-- INICIO -->
  <div data-role="page" id="home" data-title="Inicio">
      <!--Header-->
      <div data-role="header">
          <a rel="external" data-icon="info" href="#info">Info</a>
          <h1>Inicio</h1>
          <a rel="external" href="#grupoX">Grupo 10</a>
      </div>
      <!--/Header-->
      <div data-role="content">
             Estimado turista, Madrid tiene muchos lugares agradables, otros no tanto y hay mucha tonter�a suelta,
          <p  align="center">��NO SE SI ME ENTIENDES!!.</p>
          <p>Permiteme ayudarte en tu viaje, para evitar caer en zonas no deseables.</p>
              <ul data-role="listview" data-inset="true">
                <li data-theme="a">�D&oacute;nde te encuentras?</li>
				
				<li data-theme="c"
					class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-li-has-icon ui-btn-up-c"><div
						class="ui-btn-inner ui-li">
						<div class="ui-btn-text">
							<a href="#CodPostal" class="ui-link-inherit">
							 <img src="<c:url value="/resources/images/correos.jpg" />" alt="Codigo Postal" class="ui-li-icon ui-li-thumb" height="16" width="16px" >
							 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;C�digo Postal</a>
						</div>
						<span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span>
					</div>
				</li>

				<li data-theme="c"
					class="ui-btn ui-btn-icon-right ui-li-has-arrow ui-li ui-li-has-icon ui-btn-up-c"><div
						class="ui-btn-inner ui-li">
						<div class="ui-btn-text">
							<a href="#Metro" class="ui-link-inherit" id="gotolineas"><img
								src="<c:url value="/resources/images/metro.png" />" alt="Metro" class="ui-li-icon ui-li-thumb" height="16" width="16px" >
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Metro</a>
						</div>
						<span class="ui-icon ui-icon-arrow-r ui-icon-shadow"></span>
					</div>
				</li>
			</ul>
      </div>
     <!-- Footer -->
	 <div data-role="footer" data-theme="a">
	    <h4>&copy; Grupo 10</h4>
	 </div>
	 <!-- /Footer -->
  </div>

  <!-- Info -->
  <div data-role="page" id="info" data-title="Informaci&oacute;n">
      <!--Header-->
      <div data-role="header" data-position="inline" data-theme="a">
          <a href="#home" data-icon="arrow-l" data-theme="a">Volver</a>
          <h1>Informaci&oacute;n</h1>
      </div>
      <!--/Header-->

      <div data-role="content" data-theme="a">
          <p>Danos el c�digo postal de la zona d�nde te encuentras y te diremos qu� tal es la zona</p>
      </div>

      <!-- Footer -->
	<div data-role="footer" data-theme="a">
	    <h4>&copy; Grupo 10</h4>
	</div>
	<!-- /Footer -->
  </div>
  <!-- /Info -->

  <!-- Grupo X -->
  <div data-role="page" id="grupoX" data-title="Grupo 10">
      <!--Header-->
      <div data-role="header" data-position="inline" data-theme="a">
          <a href="#home" data-icon="arrow-l" data-theme="a">Volver</a>
          <h1>Grupo 10</h1>
      </div>
      <!--/Header-->

      <div data-role="content" data-theme="a">
          <p>Roberto Matas Pascual <strong>64414</strong></p>
          <p>Javier Urosa Domingo <strong>64216</strong></p>
          <p>Alicia M� Guerra Lafuente <strong>64175</strong></p>
          <p>V�ctor Moreno Sanz <strong>64242</strong></p>
          <p>Alejandro Gil-D�vila <strong>64309</strong></p>
      </div>

      <!-- Footer -->
		<div data-role="footer" data-theme="a">
		    <h4>&copy; Grupo 10</h4>
		</div>
		<!-- /Footer -->
  </div>
  <!-- /Grupo X -->
  
  <!-- C�d.Postal -->
  <div data-role="page" id="CodPostal" data-title="C&oacute;d. Postal">
        <!--Header-->
        <div data-role="header" data-position="inline" data-theme="a">
            <a href="#home" data-icon="arrow-l" data-theme="a">Volver</a>
            <h1>C&oacute;d. Postal</h1>
        </div>
        <!--/Header-->

        <div data-role="content">
        <form action="#resultados" method="post" id="cp">
            <p>Dime el C&oacute;d.Postal m&aacute;s cercano a tu posici&oacute;n y te dire con que te vas a encontrar.</p>
            <h1>
                <p>280</p>
                <input type="range" name="num1" id="slider-2" value="0" min="0" max="9" data-theme="a" data-track-theme="d" />
                <input type="range" name="num2" id="slider-3" value="0" min="0" max="9" data-theme="a" data-track-theme="d" />
            </h1>                
           <div data-type="horizontal">
            <button type="submit" data-theme="a" id="getCalificacion">Buscar</button>
           </div>                
        </form>
        </div>

        <!-- Footer -->
		<div data-role="footer" data-theme="a">
		    <h4>&copy; Grupo 10</h4>
		</div>
		<!-- /Footer -->
   </div>
   <!-- /C�d.Postal -->

   <!-- Metro -->
   <div data-role="page" id="Metro" data-title="Metro" >
		 
       <div data-role="header" data-position="inline" data-theme="a">
            <a href="#home" data-icon="arrow-l" data-theme="a">Volver</a>
           <h1>Metro</h1>
       </div>
       
       <div data-role="content">
           <p>Dime la parada de metro m&aacute;s cercana a tu posici&oacute;n y te dire con que te vas a encontrar.</p>
           <div id="lineasmetro" data-role="collapsible-set">
      
           </div>
       </div>
		<div data-role="footer" data-theme="a">
		    <h4>&copy; Grupo 10</h4>
		</div>
		
   </div>
   <!-- /Metro -->
   
   <!-- Resultados -->
   <div data-role="page" id="resultados" data-title="resultados">
       <!--Header-->
       <div data-role="header" data-position="inline" data-theme="a">
            <a href="#home" data-icon="arrow-l" data-theme="a">Inicio</a>
           <h1>Resultados</h1>
       </div>
       <!--/Header-->

       <div data-role="content" data-theme="a">
			<h1>Peligrosidad</h1><h1><span id="pctjePeligrosidad"></span></h1>
			<p><img id="imgPeligrosidad" src="" alt="Peligrosidad" /></p>
			<p id="comentario"></p>
       </div>

       <!-- Footer -->
		<div data-role="footer" data-theme="a">
		    <h4>&copy; Grupo 10</h4>
		</div>
		<!-- /Footer -->
   </div>
   <!-- /Resultados -->
</body>
</html>