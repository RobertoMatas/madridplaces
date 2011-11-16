package org.upsam.tecmov.madridplaces.view;

import java.io.Serializable;
import java.util.ArrayList;

public class LineaView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9172486150569241895L;
	/**
	 * Listado de lineas
	 */
	private ArrayList<LineaViewItem> items;

	/**
	 * @param items
	 */
	public LineaView(ArrayList<LineaViewItem> items) {
		super();
		this.items = items;
	}

	/**
	 * @return the items
	 */
	public ArrayList<LineaViewItem> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(ArrayList<LineaViewItem> items) {
		this.items = items;
	}

}
