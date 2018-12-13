/**
 * 
 */
package com.appangular.demo.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appangular.demo.modelo.Usuario;
import com.appangular.demo.service.UsuarioServicio;
import com.appangular.demo.util.RespuestaRest;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Wilson-DK
 *
 */
@RestController
public class UsuarioController {

	@Autowired
	protected UsuarioServicio usuarioServicio;

	protected ObjectMapper mapper;

	/**
	 * Metodo que guardo o modifica
	 * 
	 * @return
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RespuestaRest saveOrUpdate(@RequestBody String userJson) {
		mapper = new ObjectMapper();
		Usuario u = null;
		try {
			u = mapper.readValue(userJson, Usuario.class);
		} catch (Exception e) {
			System.out.println("Error al guardar o actualizar usuario" + e.getMessage());
		}
		if (!validarCamposUsuario(u)) {
			return new RespuestaRest(HttpStatus.NOT_ACCEPTABLE.value(), "Debe ingresar los campos obligatorios");
		}

		usuarioServicio.save(u);

		return new RespuestaRest(HttpStatus.OK.value(), "Transaccion exitosa");
	}

	@RequestMapping(value = "/getUsuarios", method = RequestMethod.GET)
	public List<Usuario> getUsuarios() {

		return usuarioServicio.findAll();
	}

	@RequestMapping(value = "/eliminarUsuario", method = RequestMethod.POST)
	public void eliminarUsuario(@RequestBody String userJson) {
		mapper = new ObjectMapper();
		Usuario u = null;
		try {
			u = mapper.readValue(userJson, Usuario.class);
			if (u.getIdusers() == null) {
				throw new Exception("El id del usuario es nulo");
			}
			usuarioServicio.eliminarUsuario(u.getIdusers());
		} catch (Exception e) {
			System.out.println("Error al eliminar usuario" + e.getMessage());
		}
	}

	private boolean validarCamposUsuario(Usuario user) {
		boolean esValido = true;
		if (StringUtils.trimToNull(user.getPrimerNombre()) == null) {
			esValido = false;
		}
		if (StringUtils.trimToNull(user.getPrimerApellido()) == null) {
			esValido = false;
		}
		if (StringUtils.trimToNull(user.getDireccion()) == null) {
			esValido = false;
		}
		return esValido;
	}
}
