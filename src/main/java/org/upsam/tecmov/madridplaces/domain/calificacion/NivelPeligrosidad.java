package org.upsam.tecmov.madridplaces.domain.calificacion;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class NivelPeligrosidad {

	/**
	 * Identificador
	 */
	@Id
	private Integer id;
	/**
	 * Nivel de peligrosidad de la zona
	 */
	@Enumerated(EnumType.STRING)
	private Nivel nivel;
	/**
	 * Límite inferior del porcentaje de peligrosidad
	 */
	private Integer pctjePeligrosidadMin;
	/**
	 * Límite superior del porcentaje de peligrosidad
	 */
	private Integer pctjePeligrosidadMax;

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
	 * @return the pctjePeligrosidadMin
	 */
	public Integer getPctjePeligrosidadMin() {
		return pctjePeligrosidadMin;
	}

	/**
	 * @param pctjePeligrosidadMin
	 *            the pctjePeligrosidadMin to set
	 */
	public void setPctjePeligrosidadMin(Integer pctjePeligrosidadMin) {
		this.pctjePeligrosidadMin = pctjePeligrosidadMin;
	}

	/**
	 * @return the pctjePeligrosidadMax
	 */
	public Integer getPctjePeligrosidadMax() {
		return pctjePeligrosidadMax;
	}

	/**
	 * @param pctjePeligrosidadMax
	 *            the pctjePeligrosidadMax to set
	 */
	public void setPctjePeligrosidadMax(Integer pctjePeligrosidadMax) {
		this.pctjePeligrosidadMax = pctjePeligrosidadMax;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("NivelPeligrosidad [nivel=%s, pctjePeligrosidadMin=%s, pctjePeligrosidadMax=%s]", nivel, pctjePeligrosidadMin, pctjePeligrosidadMax);
	}
	
}
