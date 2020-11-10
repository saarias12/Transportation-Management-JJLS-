/**
 * 
 */
package edu.co.unipana.jjls.service;

import java.util.Date;
import java.util.List;

import edu.co.unipana.jjls.model.ProgramacionRuta;

/**
 * Interfaz que define operaciones para el servicio de encomiendas
 * 
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */

public interface IProgramacionRutaService extends ICRUD<ProgramacionRuta> {

	public List<ProgramacionRuta> listarPorCondicion(String origen,String destino,Date fechaInicial);
	public List<ProgramacionRuta> listarPorCondicionFechas(Date fechaInicial, Date fechaFinal);
}
