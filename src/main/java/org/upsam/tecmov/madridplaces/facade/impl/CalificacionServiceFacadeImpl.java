package org.upsam.tecmov.madridplaces.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.upsam.tecmov.madridplaces.controller.form.CalificacionForm;
import org.upsam.tecmov.madridplaces.domain.calificacion.Calificacion;
import org.upsam.tecmov.madridplaces.domain.calificacion.CalificacionRepository;
import org.upsam.tecmov.madridplaces.domain.calificacion.NivelPeligrosidad;
import org.upsam.tecmov.madridplaces.domain.calificacion.NivelPeligrosidadRepository;
import org.upsam.tecmov.madridplaces.domain.codpostal.CodPostal;
import org.upsam.tecmov.madridplaces.domain.codpostal.CodPostalRepository;
import org.upsam.tecmov.madridplaces.facade.CalificacionServiceFacade;
import org.upsam.tecmov.madridplaces.view.CalificacionView;
import org.upsam.tecmov.madridplaces.view.NivelPeligrosidadView;

@Service
@Transactional(readOnly = true)
public class CalificacionServiceFacadeImpl implements CalificacionServiceFacade {
	/**
	 * Repositorio de calificaciones
	 */
	private CalificacionRepository calificacionRepository;
	/**
	 * Repositorio de c�digos postales
	 */
	private CodPostalRepository codPostalRepository;
	/**
	 * Repositorio de nivelves de peligrosidad
	 */
	private NivelPeligrosidadRepository peligrosidadRepository;
	
	/**
	 * @param calificacionRepository
	 * @param codPostalRepository
	 */
	@Autowired
	public CalificacionServiceFacadeImpl(CalificacionRepository calificacionRepository, CodPostalRepository codPostalRepository, NivelPeligrosidadRepository peligrosidadRepository) {
		super();
		this.calificacionRepository = calificacionRepository;
		this.codPostalRepository = codPostalRepository;
		this.peligrosidadRepository = peligrosidadRepository;
	}

	public CalificacionView findByCodPostal(String codPostal) {
		CodPostal cp = codPostalRepository.findOne(codPostal);
		if (cp == null) {
			return new CalificacionView("El CP indicado no se encuentra en nuestro sistema");
		}
		return toView(calificacionRepository.findByCodPostal(cp));
	}

	public List<CalificacionView> findAll() {
		Iterable<Calificacion> calificaciones = calificacionRepository.findAll();
		List<CalificacionView> view = null;
		if (calificaciones != null) {
			view = new ArrayList<CalificacionView>();
			for (Calificacion calificacion : calificaciones) {
				view.add(toView(calificacion));
			}
		}
		return view;
	}
	
	public CalificacionView find(Integer id) {
		return toView(calificacionRepository.findOne(id));
	}

	public List<NivelPeligrosidadView> findAllNiveles() {
		Iterable<NivelPeligrosidad> peligrosidades = peligrosidadRepository.findAll();
		List<NivelPeligrosidadView> view = null;
		if (peligrosidades != null) {
			view = new ArrayList<NivelPeligrosidadView>();
			for (NivelPeligrosidad nivel : peligrosidades) {
				view.add(toView(nivel));
			}
		}
		return view;
	}

	@Transactional
	public boolean save(CalificacionForm calificacion) {
		Calificacion c = calificacionRepository.findOne(calificacion.getId());
		c.setPeligrosidad(peligrosidadRepository.findOne(calificacion.getNivel()));
		c.setComentario(calificacion.getComentario());
		calificacionRepository.save(c);
		return true;
	}
	
	private NivelPeligrosidadView toView(NivelPeligrosidad nivel) {
		if (nivel == null) return null;
		return new NivelPeligrosidadView(
				nivel.getId(), 
				nivel.getNivel(), 
				nivel.getPctjePeligrosidadMin(), 
				nivel.getPctjePeligrosidadMax()
			);
	}

	private CalificacionView toView(Calificacion calificacion) {
		if (calificacion == null) {
			return new CalificacionView("En estos momentos no existe calificaci�n para el CP introducido");
		}
		NivelPeligrosidad peligrosidad = calificacion.getPeligrosidad();
		return new CalificacionView(
				calificacion.getId(), 
				peligrosidad.getNivel(), 
				peligrosidad.getId(),
				peligrosidad.getPctjePeligrosidadMin(), 
				peligrosidad.getPctjePeligrosidadMax(), 
				calificacion.getCodPostal().getCodPostal(), 
				calificacion.getComentario()
			);
	}

}
