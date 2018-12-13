/**
 * 
 */
package com.appangular.demo.service;

import java.util.List;

import com.appangular.demo.modelo.Usuario;

/**
 * @author Wilson-DK
 *
 */
public interface UsuarioServicio {

	/**
	 * Guardar usuario
	 * 
	 * @param usuario
	 * @return
	 */
	Usuario save(Usuario usuario);

	/**
	 * Buscar usuarios
	 * 
	 * @return
	 */
	List<Usuario> findAll();

	/**
	 * Eliminar usuario by id
	 * 
	 * @param idusers
	 */
	void eliminarUsuario(Long idusers);

}
