/**
 * 
 */
package edu.co.unipana.jjls.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Entidad que define las porpiedades programacion de rutas
 * 
 * @author Sergio Arias
 * @date 7/11/2020
 *
 */
@ApiModel(description = "Informacion de programacion de rutas")
@Entity
@Table(name = "programacion_ruta")
public class ProgramacionRuta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "origen", nullable = false, unique = false)
	@ApiModelProperty("Origen de la ruta")
	private String origen;

	@Column(name = "destino", nullable = false, unique = false)
	@ApiModelProperty("Destino de la ruta")
	private String destino;

	@Column(name = "conductor", nullable = false, unique = false)
	@ApiModelProperty("Conductor de la ruta")
	private String conductor;

	@Column(name = "fecha_inicial", nullable = false, unique = false)
	@ApiModelProperty("Fecha inicial de la ruta")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy") 
	private Date fechaInicial;

	@Column(name = "fecha_final", nullable = false, unique = false)
	@ApiModelProperty("Fecha final de la ruta")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy") 
	private Date fechaFinal;

	@Column(name = "hora_salida", nullable = false, unique = false)
	@ApiModelProperty("Hora de salida de la ruta")
	private String horaSalida;

	@Column(name = "hora_llegada", nullable = false, unique = false)
	@ApiModelProperty("Hora de llegada de la ruta")
	private String horaLlegada;

	/**
	 * Metodo get para id
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Metodo set para id
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Metodo get para origen
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Metodo set para origen
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * Metodo get para destino
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Metodo set para destino
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * Metodo get para conductor
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna conductor
	 */
	public String getConductor() {
		return conductor;
	}

	/**
	 * Metodo set para conductor
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea conductor
	 */
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	/**
	 * Metodo get para fechaInicial
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna fechaInicial
	 */
	public Date getFechaInicial() {
		return fechaInicial;
	}

	/**
	 * Metodo set para fechaInicial
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea fechaInicial
	 */
	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	/**
	 * Metodo get para fechaFinal
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna fechaFinal
	 */
	public Date getFechaFinal() {
		return fechaFinal;
	}

	/**
	 * Metodo set para fechaFinal
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea fechaFinal
	 */
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	/**
	 * Metodo get para horaSalida
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna horaSalida
	 */
	public String getHoraSalida() {
		return horaSalida;
	}

	/**
	 * Metodo set para horaSalida
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea horaSalida
	 */
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	/**
	 * Metodo get para horaLlegada
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna horaLlegada
	 */
	public String getHoraLlegada() {
		return horaLlegada;
	}

	/**
	 * Metodo set para horaLlegada
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea horaLlegada
	 */
	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	@Override
	public String toString() {
		return "ProgramacionRuta [id=" + id + ", origen=" + origen + ", destino=" + destino + ", conductor=" + conductor
				+ ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", horaSalida=" + horaSalida
				+ ", horaLlegada=" + horaLlegada + "]";
	}

}
