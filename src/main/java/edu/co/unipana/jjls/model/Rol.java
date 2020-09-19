/**
 * 
 */
package edu.co.unipana.jjls.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad que define los roles de los usuarios
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
@Entity
@Table(name = "rol")
public class Rol {

	/** Id del rol */
	@Id
	private Integer idRol;
	
	/** Nombre del rol */
	@Column(name = "nombre")
	private String nombre;

	/** Descripcion del rol */
	@Column(name = "descripcion")
	private String descripcion;

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}