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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Entidad que define propiedades de los conductores
 * 
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@ApiModel(description = "Informacion conductores")
@Entity
@Table(name = "conductor")
public class Conductor {

	/** Id del departamento */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nombre", nullable = false, unique = false)
	@ApiModelProperty("Nombre del conductor")
	private String nombre;

	@Column(name = "numeroDocumento", nullable = false, unique = false)
	@ApiModelProperty("Numero de documento del conductor")
	private String numeroDocumento;

	@Column(name = "tipoLicencia", nullable = false, unique = false)
	@ApiModelProperty("tipoLicencia del conductor")
	private String tipoLicencia;

	@Column(name = "numeroLicencia", nullable = false, unique = false)
	@ApiModelProperty("NumeroLicencia del conductor")
	private String numeroLicencia;

	/**
	 * Metodo get para numeroDocumento
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * Metodo set para numeroDocumento
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea numeroDocumento
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Metodo get para tipoLicencia
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna tipoLicencia
	 */
	public String getTipoLicencia() {
		return tipoLicencia;
	}

	/**
	 * Metodo set para tipoLicencia
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea tipoLicencia
	 */
	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	/**
	 * Metodo get para numeroLicencia
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna numeroLicencia
	 */
	public String getNumeroLicencia() {
		return numeroLicencia;
	}

	/**
	 * Metodo set para numeroLicencia
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea numeroLicencia
	 */
	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

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
		return "Conductor [id=" + id + ", nombre=" + nombre + ", numeroDocumento=" + numeroDocumento + ", tipoLicencia="
				+ tipoLicencia + ", numeroLicencia=" + numeroLicencia + "]";
	}

}