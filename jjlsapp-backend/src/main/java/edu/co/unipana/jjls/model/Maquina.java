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
 * Entidad que define propiedades de las maquinas
 * 
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@ApiModel(description = "Informacion maquinas")
@Entity
@Table(name = "maquina")
public class Maquina {

	/** Id del departamento */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "dinero_recibido", nullable = false, unique = false)
	@ApiModelProperty("Dinero recibido en la maquina")
	private String dineroRecibido;

	@Column(name = "dinero_entregado", nullable = false, unique = false)
	@ApiModelProperty("Dinero entregado en la maquina")
	private String dineroEntregado;

	@Column(name = "cantidad_jugadas", nullable = false, unique = false)
	@ApiModelProperty("Cantidad jugadas en la maquina")
	private int cantidadJugadas;

	@Column(name = "tiempo_juego", nullable = false, unique = false)
	@ApiModelProperty("Tiempo de juego en la maquina")
	private String tiempoJuego;

	@Column(name = "numero_jugadores", nullable = false, unique = false)
	@ApiModelProperty("Numero de jugadores en la maquina")
	private int numeroJugadores;

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
	 * Metodo get para dineroRecibido
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna dineroRecibido
	 */
	public String getDineroRecibido() {
		return dineroRecibido;
	}

	/**
	 * Metodo set para dineroRecibido
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea dineroRecibido
	 */
	public void setDineroRecibido(String dineroRecibido) {
		this.dineroRecibido = dineroRecibido;
	}

	/**
	 * Metodo get para dineroEntregado
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna dineroEntregado
	 */
	public String getDineroEntregado() {
		return dineroEntregado;
	}

	/**
	 * Metodo set para dineroEntregado
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea dineroEntregado
	 */
	public void setDineroEntregado(String dineroEntregado) {
		this.dineroEntregado = dineroEntregado;
	}

	/**
	 * Metodo get para cantidadJugadas
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna cantidadJugadas
	 */
	public int getCantidadJugadas() {
		return cantidadJugadas;
	}

	/**
	 * Metodo set para cantidadJugadas
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea cantidadJugadas
	 */
	public void setCantidadJugadas(int cantidadJugadas) {
		this.cantidadJugadas = cantidadJugadas;
	}

	/**
	 * Metodo get para tiempoJuego
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna tiempoJuego
	 */
	public String getTiempoJuego() {
		return tiempoJuego;
	}

	/**
	 * Metodo set para tiempoJuego
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea tiempoJuego
	 */
	public void setTiempoJuego(String tiempoJuego) {
		this.tiempoJuego = tiempoJuego;
	}

	/**
	 * Metodo get para numeroJugadores
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @return Retorna numeroJugadores
	 */
	public int getNumeroJugadores() {
		return numeroJugadores;
	}

	/**
	 * Metodo set para numeroJugadores
	 * 
	 * @author Sergio Arias
	 * @date 7/11/2020
	 * @param setea numeroJugadores
	 */
	public void setNumeroJugadores(int numeroJugadores) {
		this.numeroJugadores = numeroJugadores;
	}

	@Override
	public String toString() {
		return "Maquina [id=" + id + ", dineroRecibido=" + dineroRecibido + ", dineroEntregado=" + dineroEntregado
				+ ", cantidadJugadas=" + cantidadJugadas + ", tiempoJuego=" + tiempoJuego + ", numeroJugadores="
				+ numeroJugadores + "]";
	}

}