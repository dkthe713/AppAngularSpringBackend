package com.appangular.demo.util;

import java.util.List;

/**
 * @author Wilson-DK
 *
 */
public class ResultadoQuery {

	private int totalResultados;
	private List<Object> lista;

	/**
	 * @return the totalResultados
	 */
	public int getTotalResultados() {
		return totalResultados;
	}

	/**
	 * @param totalResultados
	 *            the totalResultados to set
	 */
	public void setTotalResultados(int totalResultados) {
		this.totalResultados = totalResultados;
	}

	/**
	 * @return the lista
	 */
	public List<Object> getLista() {
		return lista;
	}

	/**
	 * @param lista
	 *            the lista to set
	 */
	public void setLista(List<Object> lista) {
		this.lista = lista;
	}

}
