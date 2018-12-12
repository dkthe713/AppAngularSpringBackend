package com.appangular.demo.util;

/**
 * @author Wilson-DK
 *
 */
public class RespuestaRest {

	private Integer codigoRespuesta;
	private String mensaje;

	/**
	 * @param codigoRespuesta
	 */
	public RespuestaRest(Integer codigoRespuesta) {
		super();
		this.codigoRespuesta = codigoRespuesta;
	}

	/**
	 * @param codigoRespuesta
	 * @param mensaje
	 */
	public RespuestaRest(Integer codigoRespuesta, String mensaje) {
		super();
		this.codigoRespuesta = codigoRespuesta;
		this.mensaje = mensaje;
	}

	/**
	 * @return the codigoRespuesta
	 */
	public Integer getCodigoRespuesta() {
		return codigoRespuesta;
	}

	/**
	 * @param codigoRespuesta
	 *            the codigoRespuesta to set
	 */
	public void setCodigoRespuesta(Integer codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje
	 *            the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
