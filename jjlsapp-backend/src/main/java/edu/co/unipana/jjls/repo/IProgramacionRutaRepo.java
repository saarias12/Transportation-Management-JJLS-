/**
 * 
 */
package edu.co.unipana.jjls.repo;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.co.unipana.jjls.model.ProgramacionRuta;


/**
 * Interfaz de repositorio con operaciones de programacion de rutas
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
public interface IProgramacionRutaRepo extends JpaRepository<ProgramacionRuta, Integer>{

	@Query(value = "SELECT e from ProgramacionRuta e where (:origen is null or e.origen = :origen) AND (:destino is null or e.destino = :destino) AND (cast(:fechaInicial as timestamp) is null or e.fechaInicial >= :fechaInicial)")
	List<ProgramacionRuta> FindByOrigenDestino(@Param("origen") String origen, @Param("destino") String destino,@Param("fechaInicial") Date fechaInicial);
	
	@Query(value = "SELECT e from ProgramacionRuta e where  e.fechaInicial >= :fechaInicial AND e.fechaFinal <= :fechaFinal")
	List<ProgramacionRuta> FindByFechas(@Param("fechaInicial") Date fechaInicial, @Param("fechaFinal") Date fechaFinal);
}
