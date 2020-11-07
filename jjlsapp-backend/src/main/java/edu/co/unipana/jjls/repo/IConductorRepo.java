/**
 * 
 */
package edu.co.unipana.jjls.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.co.unipana.jjls.model.Conductor;


/**
 * Interfaz de repositorio con operaciones de conductores
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
public interface IConductorRepo extends JpaRepository<Conductor, Integer>{

	
}
