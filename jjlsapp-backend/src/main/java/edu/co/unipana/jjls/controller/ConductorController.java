/**
 * 
 */
package edu.co.unipana.jjls.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.co.unipana.jjls.model.Conductor;
import edu.co.unipana.jjls.service.IConductorService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controlador REST para conductores
 * 
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@RestController
@RequestMapping("/conductores") // Se aconseja la base dejarla en plural
public class ConductorController {

	@Autowired
	private IConductorService conductorService;

	/**
	 * Servicio POST que registra un conductor
	 * 
	 * @author Sergio Arias
	 * @date 03/10/2020
	 * @param dep Objeto con los datos del conductor a registrar
	 * @return
	 */
	@CrossOrigin(origins = "*")
	@PostMapping(produces = "application/json")
	@ApiOperation(value = "Servicio que registra conductores en el sistema", notes = "Los datos retornados por el servicio se encuentran en la base de datos de la aplicacion ")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Sucede si falla al enviar la respuesta"),
			@ApiResponse(code = 201, message = "En caso de crear el conductor exitosamente"),
			@ApiResponse(code = 401, message = "En caso de no esta autorizado para consultar informacion"),
			@ApiResponse(code = 404, message = "En caso de no encontrar información") })
	public ResponseEntity<Object> registrar(@Valid @RequestBody Conductor conductor) {
		Conductor conductorRegistrado = conductorService.guardar(conductor);
		// Se genera el URI de consulta al paciente registrado y se retorna en el
		// encabezado de la peticion
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(conductorRegistrado.getId()).toUri();
		return ResponseEntity.created(location).build();
	}



	/**
	 * Servicio GET que lista todos los conductores
	 * 
	 * @author Sergio Arias
	 * @date 03/10/2020
	 * @return Lista de conductores */
	@CrossOrigin(origins = "*")
	@GetMapping(produces = "application/json")
	@ApiOperation(value = "Servicio que regresa la lista de conductores", notes = "Los datos retornados por el servicio se encuentran en la base de datos del sistema ")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Sucede si falla al enviar la respuesta"),
			@ApiResponse(code = 200, message = "En caso de encontrar el listado de conductores"),
			@ApiResponse(code = 401, message = "En caso de no esta autorizado para consultar informacion"),
			@ApiResponse(code = 404, message = "En caso de no encontrar información") })
	public List<Conductor> listar() {
		return conductorService.listar();
	}

}
