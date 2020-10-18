/**
 * 
 */
package edu.co.unipana.jjls.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.co.unipana.jjls.model.Usuario;


/**
 * Interfaz de repositorio con operaciones de usuarios
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findOneByUsername(String username);
}
