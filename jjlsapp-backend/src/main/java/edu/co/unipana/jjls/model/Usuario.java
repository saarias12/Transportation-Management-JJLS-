/**
 * 
 */
package edu.co.unipana.jjls.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Entidad que define propiedades de los usuarios
 * 
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
@ApiModel(description = "Informacion del usuario")
@Entity
@Table(name = "usuario")
public class Usuario {

	/** Id del usuario */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** Nombre del usuario */
	@Column(name = "nombre", nullable = false, unique = false)
	@ApiModelProperty("Nombres del usuario")
	@NotNull(message = "El campo nombres no puede ser nulo y/o vacio")
	@Size(max = 100, message = "Los nombres deben tener maximo 100 caracteres")
	private String nombres;

	/** Usuario del usuario */
	@Column(name = "username", nullable = false, unique = true)
	@ApiModelProperty("Username del usuario")
	@NotNull(message = "El campo username no puede ser nulo y/o vacio")
	private String username;

	/** Correo del usuario */
	@Column(name = "correo", nullable = false, unique = true)
	@ApiModelProperty("Correo del usuario")
	@NotNull(message = "El campo correo no puede ser nulo y/o vacio")
	private String correo;

	/** Clave del usuario */
	@Column(name = "clave", nullable = false)
	@ApiModelProperty("Contraseña del usuario")
	@NotNull(message = "El campo password no puede ser nulo y/o vacio")
	private String password;

	/** Estado del usuario */
	@Column(name = "estado", nullable = false)
	@ApiModelProperty("Estado del usuario [ACTIVO(true) , INACTIVO(false)]")
	@NotNull(message = "El campo estado no puede ser nulo y/o vacio")
	private boolean enabled;

	/** Relacion uno a muchos, cantidad de roles que puede tener el usuario */
	/*
	 * @ManyToMany(fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name =
	 * "id_usuario", referencedColumnName = "idUsuario"), inverseJoinColumns
	 * = @JoinColumn(name = "id_rol", referencedColumnName = "idRol")) private
	 * List<Rol> roles;
	 */

	/**
	 * Metodo get para username
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @return Retorna username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Metodo set para username
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @param setea username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Metodo get para id
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @return Retorna id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Metodo set para id
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @param setea id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Metodo get para nombres
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @return Retorna nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * Metodo set para nombres
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @param setea nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * Metodo get para correo
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @return Retorna correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Metodo set para correo
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @param setea correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Metodo get para password
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @return Retorna password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Metodo set para password
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @param setea password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Metodo get para enabled
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @return Retorna enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Metodo set para enabled
	 * 
	 * @author Sergio Arias
	 * @date 19/09/2020
	 * @param setea enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
