package org.upsam.tecmov.madridplaces.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.upsam.tecmov.madridplaces.controller.form.CodPostalForm;
import org.upsam.tecmov.madridplaces.facade.CalificacionServiceFacade;

@Controller
public class CalificacionController {

	private CalificacionServiceFacade facade;

	/**
	 * @param facade
	 */
	@Autowired
	public CalificacionController(CalificacionServiceFacade facade) {
		super();
		this.facade = facade;
	}

	@RequestMapping(value = "/calificacion", method = {RequestMethod.GET, RequestMethod.POST})
	public String getCalificacion(@ModelAttribute @Valid CodPostalForm cp, BindingResult result, Model model) {
		if (! result.hasErrors()) {
			model.addAttribute("calificacion", facade.findByCodPostal(cp.getCodPostal()));
		} 
		return "calificacion";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getCalificaciones(Model model) {
		model.addAttribute("calificaciones", facade.findAll());
		return "admin";
	}
}
