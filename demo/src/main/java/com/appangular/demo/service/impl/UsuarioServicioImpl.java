/**
 * 
 */
package com.appangular.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appangular.demo.dao.RepositorioUsuario;
import com.appangular.demo.modelo.Usuario;
import com.appangular.demo.service.UsuarioServicio;

/**
 * @author Wilson-DK
 *
 */
@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	@Autowired
	protected RepositorioUsuario repositorioUsuario;

	/**
	 * Guardar usuario
	 * 
	 * @param usuario
	 * @return
	 */
	@Override
	public Usuario save(Usuario usuario) {
		return repositorioUsuario.save(usuario);
	}

	/**
	 * Buscar usuarios
	 * 
	 * @return
	 */
	@Override
	public List<Usuario> findAll() {
		return repositorioUsuario.findAll();
	}
}
