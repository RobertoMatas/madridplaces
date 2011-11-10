package org.upsam.tecmov.madridplaces.domain.calificacion;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.upsam.tecmov.madridplaces.domain.codpostal.CodPostal;

@Entity
public class Calificacion {
	/**
	 * Identificador
	 */
	@Id
	private Integer id;
	/**
	 * Nivel de peligrosidad de la zona
	 */
	@OneToOne(optional = false)
	private NivelPeligrosidad peligrosidad;
	/**
	 * Zona a la que se refiere
	 */
	@OneToOne(optional = false)
	private CodPostal codPostal;
	/**
	 * Comentario de texto sobre la zona
	 */
	private String comentario;

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
	 * @return the peligrosidad
	 */
	public NivelPeligrosidad getPeligrosidad() {
		return peligrosidad;
	}

	/**
	 * @param peligrosidad
	 *            the peligrosidad to set
	 */
	public void setPeligrosidad(NivelPeligrosidad peligrosidad) {
		this.peligrosidad = peligrosidad;
	}

	/**
	 * @return the codPostal
	 */
	public CodPostal getCodPostal() {
		return codPostal;
	}

	/**
	 * @param codPostal
	 *            the codPostal to set
	 */
	public void setCodPostal(CodPostal codPostal) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Calificacion [peligrosidad=%s, codPostal=%s, comentario=%s]", peligrosidad, codPostal, comentario);
	}

}
