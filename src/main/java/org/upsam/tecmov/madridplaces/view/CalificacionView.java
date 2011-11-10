package org.upsam.tecmov.madridplaces.view;

import java.io.Serializable;

import org.upsam.tecmov.madridplaces.domain.calificacion.Nivel;

public class CalificacionView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1384529649913841169L;
	/**
	 * Identificador de calificación
	 */
	private Integer id;
	/**
	 * Nivel de peligrosidad
	 */
	private Nivel nivel;
	/**
	 * Identificador del nivel de peligrosidad
	 */
	private Integer idNivel;
	/**
	 * Valor mínimo del rango de peligrosidad
	 */
	private Integer min;
	/**
	 * Valor máximo del rango de peligrosidad
	 */
	private Integer max;
	/**
	 * Código postal al que se refiere la calificación
	 */
	private String codPostal;
	/**
	 * Comentarios asociado
	 */
	private String comentario;
	/**
	 * Mensaje de error (si lo hubiera)
	 */
	private String errorMsg;

	/**
	 * 
	 */
	public CalificacionView() {
		super();
	}

	/**
	 * @param errorMsg
	 */
	public CalificacionView(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	/**
	 * @param id
	 * @param nivel
	 * @param idNivel
	 * @param min
	 * @param max
	 * @param codPostal
	 * @param comentario
	 */
	public CalificacionView(Integer id, Nivel nivel, Integer idNivel, Integer min, Integer max, String codPostal, String comentario) {
		super();
		this.id = id;
		this.nivel = nivel;
		this.idNivel = idNivel;
		this.min = min;
		this.max = max;
		this.codPostal = codPostal;
		this.comentario = comentario;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nivel
	 */
	public Nivel getNivel() {
		return nivel;
	}

	/**
	 * @param nivel
	 *            the nivel to set
	 */
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the idNivel
	 */
	public Integer getIdNivel() {
		return idNivel;
	}

	/**
	 * @param idNivel
	 *            the idNivel to set
	 */
	public void setIdNivel(Integer idNivel) {
		this.idNivel = idNivel;
	}

	/**
	 * @return the min
	 */
	public Integer getMin() {
		return min;
	}

	/**
	 * @param min
	 *            the min to set
	 */
	public void setMin(Integer min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * @param max
	 *            the max to set
	 */
	public void setMax(Integer max) {
		this.max = max;
	}

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

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg
	 *            the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.errorMsg == null) {
			return String.format("CalificacionView [id=%s, nivel=%s, min=%s, max=%s, codPostal=%s, comentario=%s]", id, nivel, min, max, codPostal, comentario);
		} else {
			return String.format("CalificacionView [errorMsg=%s]", errorMsg);
		}
	}
}
