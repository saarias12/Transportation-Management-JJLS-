/**
 * 
 */
package edu.co.unipana.jjls.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.co.unipana.jjls.model.Maquina;


/**
 * Interfaz de repositorio con operaciones de maquinas
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
public interface IMaquinaRepo extends JpaRepository<Maquina, Integer>{

	
}
