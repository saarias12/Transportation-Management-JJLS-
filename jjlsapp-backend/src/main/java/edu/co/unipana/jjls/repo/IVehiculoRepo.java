/**
 * 
 */
package edu.co.unipana.jjls.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.co.unipana.jjls.model.Vehiculo;


/**
 * Interfaz de repositorio con operaciones de vehiculos
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
public interface IVehiculoRepo extends JpaRepository<Vehiculo, Integer>{

	
}