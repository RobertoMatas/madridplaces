package org.upsam.tecmov.madridplaces.facade.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.upsam.tecmov.madridplaces.domain.linea.Linea;
import org.upsam.tecmov.madridplaces.domain.linea.LineaRepository;
import org.upsam.tecmov.madridplaces.domain.linea.Parada;
import org.upsam.tecmov.madridplaces.facade.LineaServiceFacade;
import org.upsam.tecmov.madridplaces.view.LineaView;
import org.upsam.tecmov.madridplaces.view.LineaViewItem;
import org.upsam.tecmov.madridplaces.view.ParadaView;

@Service
@Transactional(readOnly = true)
public class LineaServiceFacadeImpl implements LineaServiceFacade {

	private LineaRepository lineaRepository;

	/**
	 * @param lineaRepository
	 */
	@Autowired
	public LineaServiceFacadeImpl(LineaRepository lineaRepository) {
		super();
		this.lineaRepository = lineaRepository;
	}

	public LineaView findAll() {
		return toView(lineaRepository.findAll());
	}
	
	private LineaView toView(Iterable<Linea> lineas) {
		ArrayList<LineaViewItem> items = null;
		if (lineas != null) {
			items = new ArrayList<LineaViewItem>();
			LineaViewItem lineaView = null;
			ParadaView paradaView = null;
			for (Linea linea : lineas) {
				lineaView = new LineaViewItem(linea.getNumero(), linea.getColor());
				for (Parada parada : linea.getParadas()) {
					paradaView = new ParadaView(parada.getNombre(), parada.getCodPostal().getCodPostal());
					lineaView.addParadaView(paradaView);
				}
				items.add(lineaView);
			}
		}
		return new LineaView(items);
	}

}
