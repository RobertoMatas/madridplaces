package org.upsam.tecmov.madridplaces.facade;

import java.util.List;

import org.upsam.tecmov.madridplaces.controller.form.CalificacionForm;
import org.upsam.tecmov.madridplaces.view.CalificacionView;
import org.upsam.tecmov.madridplaces.view.NivelPeligrosidadView;

public interface CalificacionServiceFacade {

	CalificacionView findByCodPostal(String codPostal);
	
	List<CalificacionView> findAll();
	
	boolean save(CalificacionForm calificacion);

	CalificacionView find(Integer id);

	List<NivelPeligrosidadView> findAllNiveles();
}
