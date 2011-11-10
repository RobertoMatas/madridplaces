package org.upsam.tecmov.madridplaces.view;

import java.io.Serializable;

public class ParadaView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2335394816067387291L;
	/**
	 * Nombre de la parada
	 */
	private String nombre;
	/**
	 * Código Postal
	 */
	private String codPostal;

	/**
	 * 
	 */
	public ParadaView() {
		super();
	}

	/**
	 * @param nombre
	 * @param codPostal
	 */
	public ParadaView(String nombre, String codPostal) {
		super();
		this.nombre = nombre;
		this.codPostal = codPostal;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("ParadaView [nombre=%s, codPostal=%s]", nombre, codPostal);
	}
}
