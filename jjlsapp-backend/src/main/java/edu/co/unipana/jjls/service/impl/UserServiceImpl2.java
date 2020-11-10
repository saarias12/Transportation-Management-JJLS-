/**
 * 
 */
package edu.co.unipana.jjls.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.co.unipana.jjls.model.Usuario;
import edu.co.unipana.jjls.repo.IUsuarioRepo;
import edu.co.unipana.jjls.service.IUsuarioService2;

/**
 * Servicio que contiene la implementacion para usuarios
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */

@Service()
public class UserServiceImpl2 implements IUsuarioService2 {

	@Autowired
	private IUsuarioRepo usuarioRepo;

	@Override
	public Usuario obtenerUser(String username) throws UsernameNotFoundException {
		Usuario user = usuarioRepo.findOneByUsername(username); // from usuario where username := username

		if (user == null) {
			throw new UsernameNotFoundException(String.format("Usuario no existe", username));
		}
		

		
		return user;
	}
	
	@Override
	public Usuario guardar(Usuario usuario) {
		return usuarioRepo.save(usuario);
	}

	@Override
	public Usuario modificar(Usuario t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

