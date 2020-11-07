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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Entidad que define las propiedades de las encomiendas
 * 
 * @author Sergio Arias
 * @date 7/11/2020
 *
 */
@ApiModel(description = "Informacion de al encomienda")
@Entity
@Table(name = "encomienda")
public class Encomienda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "origen", nullable = false, unique = false)
	@ApiModelProperty("Origen de la encomienda")
	private String origen;

	@Column(name = "destino", nullable = false, unique = false)
	@ApiModelProperty("Destino de la encomienda")
	private String destino;

	@Column(name = "fecha_inicial", nullable = false, unique = false)
	@ApiModelProperty("Fecha inicial de la encomienda")
	private Date fechaInicial;

	@Column(name = "fecha_final", nullable = false, unique = false)
	@ApiModelProperty("Fecha final de la encomienda")
	private Date fechaFinal;

	@Column(name = "hora_salida", nullable = false, unique = false)
	@ApiModelProperty("Hora de salida de la encomienda")
	private String horaSalida;

	@Column(name = "hora_llegada", nullable = false, unique = false)
	@ApiModelProperty("Hora de llegada de la encomienda")
	private String horaLlegada;

	@Column(name = "peso", nullable = false, unique = false)
	@ApiModelProperty("Peso de la encomienda")
	private String peso;

	@Column(name = "valor", nullable = false, unique = false)
	@ApiModelProperty("Valor de la encomienda")
	private String valor;

	@Column(name = "descripcion", nullable = false, unique = false)
	@ApiModelProperty("Descripción de la encomienda")
	private String descripcion;

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

	/**
	 * Metodo get para peso
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna peso
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * Metodo set para peso
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea peso
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	/**
	 * Metodo get para valor
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Metodo set para valor
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea valor
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * Metodo get para descripcion
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Metodo set para descripcion
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Encomienda [id=" + id + ", origen=" + origen + ", destino=" + destino + ", fechaInicial=" + fechaInicial
				+ ", fechaFinal=" + fechaFinal + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada
				+ ", peso=" + peso + ", valor=" + valor + ", descripcion=" + descripcion + "]";
	}

	
	
}
