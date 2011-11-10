package org.upsam.tecmov.madridplaces.domain.linea;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.upsam.tecmov.madridplaces.domain.codpostal.CodPostal;

@Entity
public class Parada {
	/**
	 * Identificador numérico
	 */
	@Id
	private Integer id;
	/**
	 * Nombre de la parada
	 */
	private String nombre;
	/**
	 * Línea a la que pertenece
	 */
	@ManyToOne(optional = false)
	private Linea linea;
	/**
	 * Código postal en el que se encuentra la parada
	 */
	@OneToOne
	private CodPostal codPostal;

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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the linea
	 */
	public Linea getLinea() {
		return linea;
	}

	/**
	 * @param linea
	 *            the linea to set
	 */
	public void setLinea(Linea linea) {
		this.linea = linea;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Parada [nombre=%s, codPostal=%s]", nombre, codPostal);
	}

}
