package org.upsam.tecmov.madridplaces.controller.form;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class CodPostalForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2191727170280668038L;
	/**
	 * Cuarto dígito del cod postal
	 */
	@Min(0)
	@Max(9)
	private Integer num1;
	/**
	 * Último del cod postal
	 */
	@Min(0)
	@Max(9)
	private Integer num2;

	/**
	 * 
	 */
	public CodPostalForm() {
		super();
	}

	/**
	 * @return the codPostal
	 */
	public String getCodPostal() {
		return "280" + this.num1 + this.num2;
	}

	/**
	 * @return the num1
	 */
	public Integer getNum1() {
		return num1;
	}

	/**
	 * @param num1
	 *            the num1 to set
	 */
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public Integer getNum2() {
		return num2;
	}

	/**
	 * @param num2
	 *            the num2 to set
	 */
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

}
