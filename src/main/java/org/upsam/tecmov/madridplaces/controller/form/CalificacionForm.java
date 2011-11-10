package org.upsam.tecmov.madridplaces.controller.form;

import java.io.Serializable;

public class CalificacionForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 744440149702675798L;
	/**
	 * Identificador de calificación
	 */
	private Integer id;
	/**
	 * Nivel de peligrosidad
	 */
	private Integer nivel;
	/**
	 * Código postal al que se refiere la calificación
	 */
	private String codPostal;
	/**
	 * Comentarios asociado
	 */
	private String comentario;

	/**
	 * 
	 */
	public CalificacionForm() {
		super();
	}

	/**
	 * @param id
	 * @param nivel
	 * @param codPostal
	 * @param comentario
	 */
	public CalificacionForm(Integer id, Integer nivel, String codPostal, String comentario) {
		super();
		this.id = id;
		this.nivel = nivel;
		this.codPostal = codPostal;
		this.comentario = comentario;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param codPostal
	 *            the codPostal to set
	 */
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the nivel
	 */
	public Integer getNivel() {
		return nivel;
	}

	/**
	 * @param nivel
	 *            the nivel to set
	 */
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the codPostal
	 */
	public String getCodPostal() {
		return codPostal;
	}

	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * @param comentario
	 *            the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
