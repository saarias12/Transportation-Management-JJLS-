/**
 * 
 */
package edu.co.unipana.jjls.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.co.unipana.jjls.model.Usuario;
import edu.co.unipana.jjls.service.IUsuarioService;



/**
 * Controlador REST para usuarios
 * 
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
@RestController
@RequestMapping("/usuarios") // Se aconseja la base dejarla en plural
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	/**
	 * Servicio POST que registra un usuario
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @param usuario Objeto con los datos del usuario a registrar
	 * @return En el header el URI de consulta al paciente registrado 
	 */
	@PostMapping(produces = "application/json")
	public ResponseEntity<Object> registrar(@Valid @RequestBody Usuario usuario) {
		usuario.setPassword(bcrypt.encode(usuario.getPassword()));
		Usuario usuarioRegistrado = usuarioService.guardar(usuario);
		// Se genera el URI de consulta al paciente registrado y se retorna en el encabezado de la peticion
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuarioRegistrado.getIdUsuario()).toUri();
		return ResponseEntity.created(location).build();
	}
}
