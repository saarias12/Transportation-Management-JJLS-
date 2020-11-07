/**
 * 
 */
package edu.co.unipana.jjls.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.co.unipana.jjls.model.Encomienda;


/**
 * Interfaz de repositorio con operaciones de encomiendas
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
public interface IEncomiendaRepo extends JpaRepository<Encomienda, Integer>{

	
}
