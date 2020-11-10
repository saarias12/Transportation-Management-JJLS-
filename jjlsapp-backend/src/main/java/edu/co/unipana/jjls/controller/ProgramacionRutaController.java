/**
 * 
 */
package edu.co.unipana.jjls.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.co.unipana.jjls.model.ProgramacionRuta;
import edu.co.unipana.jjls.service.IProgramacionRutaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controlador REST para programacion de rutas
 * 
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@RestController
@RequestMapping("/rutas") // Se aconseja la base dejarla en plural
public class ProgramacionRutaController {

	@Autowired
	private IProgramacionRutaService rutaService;

	/**
	 * Servicio POST que registra una programacion de ruta
	 * 
	 * @author Sergio Arias
	 * @date 03/10/2020
	 * @param ruta Objeto con los datos de la ruta
	 * @return
	 */
	@CrossOrigin(origins = "*")
	@PostMapping(produces = "application/json")
	@ApiOperation(value = "Servicio que registra programacion de rutas en el sistema", notes = "Los datos retornados por el servicio se encuentran en la base de datos de la aplicacion ")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Sucede si falla al enviar la respuesta"),
			@ApiResponse(code = 201, message = "En caso de crear la ruta exitosamente"),
			@ApiResponse(code = 401, message = "En caso de no esta autorizado para consultar informacion"),
			@ApiResponse(code = 404, message = "En caso de no encontrar información") })
	public ResponseEntity<Object> registrar(@Valid @RequestBody ProgramacionRuta ruta) {
		ProgramacionRuta rutaRegistrada = rutaService.guardar(ruta);
		// Se genera el URI de consulta al paciente registrado y se retorna en el
		// encabezado de la peticion
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(rutaRegistrada.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@CrossOrigin(origins = "*")
	@GetMapping(produces = "application/json")
	@ApiOperation(value = "Servicio que lista las rutas programadas", notes = "Los datos retornados por el servicio se encuentran en la base de datos del sistema ")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Sucede si falla al enviar la respuesta"),
			@ApiResponse(code = 200, message = "En caso de encontrar informacion "),
			@ApiResponse(code = 400, message = "En caso de que ocurra un error"), })
	public ResponseEntity<?> consultar(@RequestParam(required = false) String origen,
			@RequestParam(required = false) String destino,
			@RequestParam(required = false) @DateTimeFormat(pattern = "dd-MM-yyyy") Date fechaInicial) {

		List<ProgramacionRuta> l = rutaService.listarPorCondicion(origen, destino, fechaInicial);
		System.out.println(l.toString());
		return new ResponseEntity<>(l, HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@GetMapping(produces = "application/json", path = "/reportes")
	@ApiOperation(value = "Servicio que lista las rutas programadas", notes = "Los datos retornados por el servicio se encuentran en la base de datos del sistema ")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Sucede si falla al enviar la respuesta"),
			@ApiResponse(code = 200, message = "En caso de encontrar informacion "),
			@ApiResponse(code = 400, message = "En caso de que ocurra un error"), })
	public ResponseEntity<?> reporte(
			@RequestParam(required = true) @DateTimeFormat(pattern = "dd-MM-yyyy") Date fechaInicial,
			@RequestParam(required = true) @DateTimeFormat(pattern = "dd-MM-yyyy") Date fechaFinal) {

		System.out.println(fechaInicial + " - " + fechaFinal);
		List<ProgramacionRuta> l = rutaService.listarPorCondicionFechas(fechaInicial, fechaFinal);

		InputStreamResource file = new InputStreamResource(generarExcel(l));

		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + "Reporte Rutas.xlsx")
				.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(file);

	}

	public static ByteArrayInputStream generarExcel(List<ProgramacionRuta> lista) {

		try {
			ByteArrayOutputStream fileOut = new ByteArrayOutputStream();
			Workbook  workbook = new XSSFWorkbook();
			Sheet  sheet = workbook.createSheet("Reporte");

			Row  rowhead = sheet.createRow((short) 0);
			rowhead.createCell(0).setCellValue("ID");
			rowhead.createCell(1).setCellValue("ORIGEN");
			rowhead.createCell(2).setCellValue("DESTINO");
			rowhead.createCell(3).setCellValue("CONDUCTOR");
			rowhead.createCell(4).setCellValue("FECHA_INICIAL");
			rowhead.createCell(5).setCellValue("FECHA_FINAL");
			rowhead.createCell(6).setCellValue("HORA_SALIDA");
			rowhead.createCell(7).setCellValue("HORA_LLEGADA");

			int numRow = 1;

			for (ProgramacionRuta ruta : lista) {

				Row  row = sheet.createRow((short) numRow);
				row.createCell(0).setCellValue(ruta.getId());
				row.createCell(1).setCellValue(ruta.getOrigen());
				row.createCell(2).setCellValue(ruta.getDestino());
				row.createCell(3).setCellValue(ruta.getConductor());
				row.createCell(4).setCellValue(ruta.getFechaInicial());
				row.createCell(5).setCellValue(ruta.getFechaFinal());
				row.createCell(6).setCellValue(ruta.getHoraSalida());
				row.createCell(7).setCellValue(ruta.getHoraLlegada());

				numRow++;

			}

			
			workbook.write(fileOut);
			System.out.println("El excel del reporte ha sido generado");
			return new ByteArrayInputStream(fileOut.toByteArray());

		} catch (Exception ex) {
			System.out.println(ex);
		}
		return null;
	}

}
