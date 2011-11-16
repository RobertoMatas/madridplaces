package org.upsam.tecmov.madridplaces.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LineaViewItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -928995279870272909L;
	/**
	 * N�mero de parada
	 */
	private Integer numero;
	/**
	 * Color en hexadecimal
	 */
	private String color;
	/**
	 * Lista de paradas
	 */
	private List<ParadaView> paradas;

	/**
	 * 
	 */
	public LineaViewItem() {
		super();
	}

	/**
	 * @param numero
	 * @param color
	 */
	public LineaViewItem(Integer numero, String color) {
		super();
		this.numero = numero;
		this.color = color;
		this.paradas = new ArrayList<ParadaView>();
	}

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
	public List<ParadaView> getParadas() {
		return paradas;
	}

	/**
	 * @param paradas
	 *            the paradas to set
	 */
	public void setParadas(List<ParadaView> paradas) {
		this.paradas = paradas;
	}

	public void addParadaView(ParadaView paradaView) {
		if (this.paradas == null) {
			this.paradas = new ArrayList<ParadaView>();
		}
		this.paradas.add(paradaView);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("LineaView [numero=%s, paradas=%s]", numero, paradas);
	}

}
