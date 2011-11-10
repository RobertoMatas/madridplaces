package org.upsam.tecmov.madridplaces.view;

import java.io.Serializable;

import org.upsam.tecmov.madridplaces.domain.calificacion.Nivel;

public class NivelPeligrosidadView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1032908197840324167L;
	/**
	 * Identificador
	 */
	private Integer id;
	/**
	 * Nivel de peligrosidad de la zona
	 */
	private Nivel nivel;
	/**
	 * Límite inferior del porcentaje de peligrosidad
	 */
	private Integer min;
	/**
	 * Límite superior del porcentaje de peligrosidad
	 */
	private Integer max;

	/**
	 * @param id
	 * @param nivel
	 * @param min
	 * @param max
	 */
	public NivelPeligrosidadView(Integer id, Nivel nivel, Integer min, Integer max) {
		super();
		this.id = id;
		this.nivel = nivel;
		this.min = min;
		this.max = max;
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
	public Nivel getNivel() {
		return nivel;
	}

	/**
	 * @return the min
	 */
	public Integer getMin() {
		return min;
	}

	/**
	 * @return the max
	 */
	public Integer getMax() {
		return max;
	}

}
