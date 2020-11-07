/**
 * 
 */
package edu.co.unipana.jjls.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.co.unipana.jjls.model.Encomienda;
import edu.co.unipana.jjls.service.IEncomiendaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controlador REST para encomiendas
 * 
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@RestController
@RequestMapping("/encomiendas") // Se aconseja la base dejarla en plural
public class EncomiendaController {

	@Autowired
	private IEncomiendaService encomiendaService;

	/**
	 * Servicio POST que registra una encomienda
	 * 
	 * @author Sergio Arias
	 * @date 03/10/2020
	 * @param encomienda Objeto con los datos de la encomienda
	 * @return
	 */
	@CrossOrigin(origins = "*")
	@PostMapping(produces = "application/json")
	@ApiOperation(value = "Servicio que registra encomiendas en el sistema", notes = "Los datos retornados por el servicio se encuentran en la base de datos de la aplicacion ")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Sucede si falla al enviar la respuesta"),
			@ApiResponse(code = 201, message = "En caso de crear la encomienda exitosamente"),
			@ApiResponse(code = 401, message = "En caso de no esta autorizado para consultar informacion"),
			@ApiResponse(code = 404, message = "En caso de no encontrar información") })
	public ResponseEntity<Object> registrar(@Valid @RequestBody Encomienda encomienda) {
		Encomienda encomiendRegistrada = encomiendaService.guardar(encomienda);
		// Se genera el URI de consulta al paciente registrado y se retorna en el
		// encabezado de la peticion
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(encomiendRegistrada.getId()).toUri();
		return ResponseEntity.created(location).build();
	}





}
