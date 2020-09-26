/**
 * 
 */
package edu.co.unipana.jjls.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.co.unipana.jjls.model.Usuario;
import edu.co.unipana.jjls.repo.IUsuarioRepo;
import edu.co.unipana.jjls.service.IUsuarioService;

/**
 * Servicio que contiene la implementacion para usuarios
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
@Service("userDetailsService")
public class UserServiceImpl implements UserDetailsService, IUsuarioService {

	@Autowired
	private IUsuarioRepo usuarioRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = usuarioRepo.findOneByUsername(username); // from usuario where username := username

		if (user == null) {
			throw new UsernameNotFoundException(String.format("Usuario no existe", username));
		}
		
		List<GrantedAuthority> roles = new ArrayList<>();
		
		/*user.getRoles().forEach(rol -> {
			roles.add(new SimpleGrantedAuthority(rol.getNombre()));
		}); */
		
		UserDetails userDetails = new User(user.getUsername(), user.getPassword(), roles);
		return userDetails;
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

