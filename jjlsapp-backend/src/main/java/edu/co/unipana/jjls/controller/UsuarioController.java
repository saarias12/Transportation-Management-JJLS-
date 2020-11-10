/**
 * 
 */
package edu.co.unipana.jjls.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.co.unipana.jjls.model.Usuario;
import edu.co.unipana.jjls.service.IUsuarioService;
import edu.co.unipana.jjls.service.IUsuarioService2;
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
	private IUsuarioService2 serviceImpl;

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
	@CrossOrigin(origins = "*")
	@PostMapping(produces = "application/json")
	@ApiOperation(value = "Servicio que registra usuarios en el sistema", notes = "Los datos retornados por el servicio se encuentran en la base de datos de la aplicacion ")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Sucede si falla al enviar la respuesta"),
			@ApiResponse(code = 201, message = "En caso de crear el usuario exitosamente"),
			@ApiResponse(code = 401, message = "En caso de no esta autorizado para consultar informacion"),
			@ApiResponse(code = 404, message = "En caso de no encontrar información") })
	public ResponseEntity<Object> registrar(@Valid @RequestBody Usuario usuario) {

		//usuario.setPassword(bcrypt.encode(usuario.getPassword()));
		usuario.setPassword(usuario.getPassword());
		Usuario usuarioRegistrado = usuarioService.guardar(usuario);
		// Se genera el URI de consulta al paciente registrado y se retorna en el
		// encabezado de la peticion
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(usuarioRegistrado.getId()).toUri();
		return ResponseEntity.created(location).build();
	}


	@CrossOrigin(origins = "*")
	@GetMapping(produces = "application/json")
	@ApiOperation(value = "Servicio que inicia sesion", notes = "Los datos retornados por el servicio se encuentran en la base de datos del sistema ")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Sucede si falla al enviar la respuesta"),
			@ApiResponse(code = 200, message = "En caso de encontrar logerse correctamente"),
			@ApiResponse(code = 401, message = "En caso de no logearse correctamente"), })
	public ResponseEntity<?> iniciarSesion(@RequestParam String usuario, @RequestParam String password) {

		
		Usuario u = serviceImpl.obtenerUser(usuario);
		System.out.println(u.toString());

		if (u != null && u.getPassword().equals(password)) {
			// retorna 200
			u.setPassword("");
			return new ResponseEntity<>(u, HttpStatus.OK);

		} else {

			// retorna 401
			return new ResponseEntity<String>("No esta autorizado", HttpStatus.UNAUTHORIZED);
		}
	}
}
