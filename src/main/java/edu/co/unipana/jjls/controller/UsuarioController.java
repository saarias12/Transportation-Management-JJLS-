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
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



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
	@ApiOperation(value = "Servicio que registra usuarios en el sistema", notes = "Los datos retornados por el servicio se encuentran en la base de datos de la aplicacion ")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Sucede si falla al enviar la respuesta"),
			@ApiResponse(code = 200, message = "En caso de encontrar el listado de departamentos y/o areas"),
			@ApiResponse(code = 401, message = "En caso de no esta autorizado para consultar informacion"),
			@ApiResponse(code = 404, message = "En caso de no encontrar información")})
	public ResponseEntity<Object> registrar(@Valid @RequestBody Usuario usuario) {
		usuario.setPassword(bcrypt.encode(usuario.getPassword()));
		Usuario usuarioRegistrado = usuarioService.guardar(usuario);
		// Se genera el URI de consulta al paciente registrado y se retorna en el encabezado de la peticion
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuarioRegistrado.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
