package com.appangular.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appangular.demo.modelo.Usuario;

/**
 * @author Wilson-DK
 *
 */
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

	/**
	 * Guardar usuario
	 * 
	 * @param usuario
	 * @return
	 */
	@SuppressWarnings("unchecked")
	Usuario save(Usuario usuario);
}
