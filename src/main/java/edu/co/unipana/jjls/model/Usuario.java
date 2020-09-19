/**
 * 
 */
package edu.co.unipana.jjls.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entidad que define propiedades de los usuarios
 * 
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
@Entity
@Table(name = "usuario")
public class Usuario {

	/** Id del usuario */
	@Id
	private int idUsuario;

	/** Nombre del usuario */ 
	@Column(name = "nombre", nullable = false, unique = true)
	private String username;

	/** Clave del usuario */
	@Column(name = "clave", nullable = false)
	private String password;

	/** Estado del usuario */
	@Column(name = "estado", nullable = false)
	private boolean enabled;

	/** Relacion uno a muchos, cantidad de roles que puede tener el usuario */
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario"), inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "idRol"))
	private List<Rol> roles;

	
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

}
