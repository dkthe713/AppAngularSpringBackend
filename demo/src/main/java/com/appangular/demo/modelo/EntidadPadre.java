package com.appangular.demo.modelo;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Wilson-DK
 *
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public class EntidadPadre implements Serializable {

	/**
	 * Serial generado
	 */
	private static final long serialVersionUID = 7542794982044093920L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idusers", unique = true, nullable = false)
	private Long idusers;

	/**
	 * The idusers to get.
	 * 
	 * @return the idusers
	 */
	public Long getIdusers() {
		return idusers;
	}

	/**
	 * The idusers to set.
	 * 
	 * @param idusers
	 */
	public void setIdusers(Long idusers) {
		this.idusers = idusers;
	}
}
