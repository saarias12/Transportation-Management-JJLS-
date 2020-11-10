/**
 * 
 */
package edu.co.unipana.jjls.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import edu.co.unipana.jjls.model.Usuario;

/**
 * Interfaz que define operaciones para el servicio de usurios
 * 
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
public interface IUsuarioService2 extends ICRUD<Usuario> {

	public Usuario obtenerUser(String username) throws UsernameNotFoundException;
}
