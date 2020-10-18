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
 * Entidad que define propiedades de los departamentos
 * 
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@ApiModel(description = "Informacion departamentos")
@Entity
@Table(name = "departamento")
public class Departamento {

	/** Id del departamento */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** Nombre del departamento */
	@Column(name = "nombre", nullable = false, unique = false)
	@ApiModelProperty("Nombre del departamento")
	@NotNull(message = "El campo nombre no puede ser nulo y/o vacio")
	@Size(max = 100, message = "Los nombre deben tener maximo 100 caracteres")
	private String nombre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}