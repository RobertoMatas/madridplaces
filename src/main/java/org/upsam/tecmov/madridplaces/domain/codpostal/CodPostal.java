package org.upsam.tecmov.madridplaces.domain.codpostal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.upsam.tecmov.madridplaces.domain.calificacion.Calificacion;

@Entity
public class CodPostal {
	/**
	 * Código Postal
	 */
	@Id
	private String codPostal;
	/**
	 * Nombre del lugar (en prinipio siempre será Madrid) Pensado para futuras
	 * ampliaciones.
	 */
	private String nombre;
	/**
	 * Foto significativa del lugar
	 */
	private String photoUrl;
	/**
	 * Calificación de la zona
	 */
	@OneToOne(mappedBy = "codPostal")
	private Calificacion calificacion;

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

	/**
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * @param photoUrl
	 *            the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	/**
	 * @return the calificacion
	 */
	public Calificacion getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion
	 *            the calificacion to set
	 */
	public void setCalificacion(Calificacion calificacion) {
		this.calificacion = calificacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("CodPostal [codPostal=%s]", codPostal);
	}

}
