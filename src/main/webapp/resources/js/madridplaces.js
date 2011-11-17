var appBaseUrl = "http://madridplaces.herokuapp.com";

function updateCalificacion(data) {
	if (data.comentario != null) {
		$("#pctjePeligrosidad").text(data.min + "-" + data.max + " %");
		var imgsrc = "";
		if (data.nivel == 'MUY_SEGURO') {
			imgsrc = appBaseUrl + "/resources/images/carita_verde.png";
		} else if (data.nivel == 'SEGURO') {
			imgsrc = appBaseUrl + "/resources/images/carita_verde_amarilla.png";
		} else if (data.nivel == 'MEDIO') {
			imgsrc = appBaseUrl + "/resources/images/carita_amarilla.png";
		} else if (data.nivel == 'PELIGROSO') {
			imgsrc = appBaseUrl + "/resources/images/carita_naranja.png";
		} else if (data.nivel == 'MUY_PELIGROSO') {
			imgsrc = appBaseUrl + "/resources/images/carita_roja.png";
		}
		$("#imgPeligrosidad").attr("src", imgsrc);
		$("#comentario").text(data.comentario);
		
	} else {
		$("#pctjePeligrosidad").text(" no disponible");
		$("#comentario").text("Lo sentimos, no disponemos de datos de peligrosidad para el Cod.Postal introducido");
	}
	$.mobile.changePage($("#resultados"), {transition: 'flip', reload: true});
}

$( function() {
		
	$("#cp").submit(function() {
		$.mobile.showPageLoadingMsg();
		$.ajax(
			{
				url: appBaseUrl + "/calificacion", 
				data: $('#cp').serialize(),
				dataType: 'json',
				type: "POST",
				success: function(data) {
					updateCalificacion(data);
	    		}
    		});
	    $.mobile.hidePageLoadingMsg();
	    return false;
	});

	$("#home").live('pagebeforecreate', function(data){
		$.mobile.showPageLoadingMsg();
		$.getJSON(appBaseUrl + "/lineas", 
			function(data) {
				var $div = $('#lineasmetro');
				$div.html("");
				console.log(data);
				// para cada línea
				for ( var i = 0; i < data.items.length; i++) {
					var linea = data.items[i];
					var paradas = linea.paradas;
					var $divlinea = $('<div data-role="collapsible" data-collapsed="true" data-theme="a"></div>');
					$divlinea.append($('<h2><label style="background-color:'+ linea.color + '">&nbsp;L&iacute;nea ' + linea.numero + '&nbsp;</label></h2>'));
					var $ullinea = $('<ul data-role="listview" data-inset="true"></ul>');
					$divlinea.append($ullinea);
					
					// para cada parada
					for ( var j = 0; j < paradas.length; j++) {
						var parada = paradas[j];
						var $li = $('<li><a href="#resultados" data-ajax="false" data-url="' + '?num1=' + parada.codPostal[3] + '&num2='
									+ parada.codPostal[4]  + '">' + parada.nombre + '</a></li>');
						$ullinea.append($li);
					}						
					
					$div.append($divlinea);
				}				
		});
		$.mobile.hidePageLoadingMsg();
	});
	
	$("div#lineasmetro a").live('click', function(data){
		$.mobile.showPageLoadingMsg();
	    $.ajax(
			{
				url: appBaseUrl + "/calificacion" + $(this).attr("data-url"), 
				dataType: 'json',
				type: "GET",
				success: function(data) {
					updateCalificacion(data);
	    		}
    		});
	    $.mobile.hidePageLoadingMsg();
	    return false;
	});
	
	$(document).bind("deviceready", function() { });
	
});
