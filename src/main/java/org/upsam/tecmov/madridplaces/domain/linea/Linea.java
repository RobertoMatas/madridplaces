package org.upsam.tecmov.madridplaces.domain.linea;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Linea {

	/**
	 * Número de línea
	 */
	@Id
	private Integer numero;
	/**
	 * Color de la línea en hexadecimal
	 */
	private String color;
	/**
	 * Lista de paradas de la línea
	 */
	@OneToMany(mappedBy = "linea")
	private List<Parada> paradas;

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the paradas
	 */
	public List<Parada> getParadas() {
		return paradas;
	}

	/**
	 * @param paradas
	 *            the paradas to set
	 */
	public void setParadas(List<Parada> paradas) {
		this.paradas = paradas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Linea [numero=%s, paradas=%s]", numero, paradas);
	}

}
