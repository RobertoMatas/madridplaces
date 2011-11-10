package org.upsam.tecmov.madridplaces.controller.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CodPostalForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2191727170280668038L;
	/**
	 * Código Postal
	 */
	@NotNull
	@Pattern(regexp = "280([0-9][0-9])$", message = "CP no válido en Madrid")
	private String codPostal;

	/**
	 * @return the codPostal
	 */
	public String getCodPostal() {
		return codPostal;
	}

	/**
	 * @param codPostal
	 *            the codPostal to set
	 */
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

}
