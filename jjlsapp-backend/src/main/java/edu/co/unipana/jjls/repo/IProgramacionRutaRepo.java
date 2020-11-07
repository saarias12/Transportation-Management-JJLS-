/**
 * 
 */
package edu.co.unipana.jjls.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.co.unipana.jjls.model.ProgramacionRuta;


/**
 * Interfaz de repositorio con operaciones de programacion de rutas
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
public interface IProgramacionRutaRepo extends JpaRepository<ProgramacionRuta, Integer>{

	
}
