package org.upsam.tecmov.madridplaces.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.upsam.tecmov.madridplaces.controller.form.CodPostalForm;
import org.upsam.tecmov.madridplaces.facade.CalificacionServiceFacade;
import org.upsam.tecmov.madridplaces.view.CalificacionView;

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
	@ResponseBody
	public CalificacionView getCalificacion(@ModelAttribute @Valid CodPostalForm cp, BindingResult result, Model model) {
		return facade.findByCodPostal(cp.getCodPostal());
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getCalificaciones(Model model) {
		model.addAttribute("calificaciones", facade.findAll());
		return "admin";
	}
}
