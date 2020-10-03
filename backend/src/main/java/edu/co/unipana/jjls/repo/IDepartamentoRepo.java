/**
 * 
 */
package edu.co.unipana.jjls.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.co.unipana.jjls.model.Departamento;


/**
 * Interfaz de repositorio con operaciones de departamentos
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
public interface IDepartamentoRepo extends JpaRepository<Departamento, Integer>{

	
}
