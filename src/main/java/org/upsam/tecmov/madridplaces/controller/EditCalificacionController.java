package org.upsam.tecmov.madridplaces.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.upsam.tecmov.madridplaces.controller.form.CalificacionForm;
import org.upsam.tecmov.madridplaces.facade.CalificacionServiceFacade;
import org.upsam.tecmov.madridplaces.view.CalificacionView;
import org.upsam.tecmov.madridplaces.view.NivelPeligrosidadView;

@Controller
@RequestMapping("/calificacion/edit")
@SessionAttributes({"calificacion", "peligrosidades"})
public class EditCalificacionController {

	private CalificacionServiceFacade facade;
	
	/**
	 * @param calificacionRepository
	 * @param peligrosidadRepository
	 */
	@Autowired
	public EditCalificacionController(CalificacionServiceFacade facade) {
		super();
		this.facade = facade;
	}
	
	@ModelAttribute("calificacion")
	public CalificacionForm getCalificacionForEdit(@RequestParam(required = true) Integer id) {
		CalificacionView c = facade.find(id);
		return new CalificacionForm(c.getId(), c.getIdNivel(), c.getCodPostal(), c.getComentario());
	}
	
	@ModelAttribute("peligrosidades")
	public List<NivelPeligrosidadView> model(HttpServletRequest request) {
		return facade.findAllNiveles();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String calificacionEditForm() {
		return "editCalificacion";
	}

	/**
	 * Procesa el submit del formulario de edici�n de calificaci�n para un c�digo postal
	 * @param newUser
	 * @param result
	 * @param status
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String userRegistrySubmit(@ModelAttribute @Valid CalificacionForm calificacion, BindingResult result, SessionStatus status) {
		if (!result.hasErrors()) {
			// TODO validacion de negocio
			facade.save(calificacion);
			status.setComplete();
			return "redirect:/admin";
		}
		return "editCalificacion";
	}
	
	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String userRegistryEditCancel(SessionStatus status) {
		status.setComplete();
		return "redirect:/admin";
	}
}
