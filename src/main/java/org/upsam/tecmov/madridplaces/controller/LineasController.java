package org.upsam.tecmov.madridplaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.upsam.tecmov.madridplaces.facade.LineaServiceFacade;
import org.upsam.tecmov.madridplaces.view.LineaView;

@Controller
public class LineasController {

	private LineaServiceFacade facade;

	/**
	 * @param facade
	 */
	@Autowired
	public LineasController(LineaServiceFacade facade) {
		super();
		this.facade = facade;
	}

	@RequestMapping(value = "/lineas", method = RequestMethod.GET)
	@ResponseBody
	public LineaView showLineas(Model model) {
		return facade.findAll();
	}
}
