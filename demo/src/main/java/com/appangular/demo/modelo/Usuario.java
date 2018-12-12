package com.appangular.demo.modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Wilson-DK
 *
 */
@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class Usuario extends EntidadPadre {

	/**
	 * Serial generado
	 */
	private static final long serialVersionUID = 716102543435709115L;

	@Column(name = "primer_nombre", nullable = false, length = 45)
	private String primerNombre;

	@Column(name = "segundo_nombre", nullable = true, length = 45)
	private String segundoNombre;

	@Column(name = "primer_apellido", nullable = false, length = 45)
	private String primerApellido;

	@Column(name = "segundo_apellido", nullable = true, length = 45)
	private String segundoApellido;

	@Column(name = "telefono", nullable = true, length = 45)
	private String telefono;

	@Column(name = "direccion", nullable = false, length = 150)
	private String direccion;

	/**
	 * @return the primerNombre
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}

	/**
	 * @param primerNombre
	 *            the primerNombre to set
	 */
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	/**
	 * @return the segundoNombre
	 */
	public String getSegundoNombre() {
		return segundoNombre;
	}

	/**
	 * @param segundoNombre
	 *            the segundoNombre to set
	 */
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido
	 *            the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido
	 *            the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 *            the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
