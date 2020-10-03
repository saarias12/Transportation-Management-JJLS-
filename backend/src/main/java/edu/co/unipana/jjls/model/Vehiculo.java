package edu.co.unipana.jjls.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Entidad que define las propiedades de los usuarios
 * @author Sergio Arias
 * @date 03/10/2020
 *
 */
@ApiModel(description = "Informacion del vehiculo")
@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	/** Id del vehiculo */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Tipo de vehiculo */
	@Column(name = "tipo", nullable = false, unique = false)
	@ApiModelProperty("Tipo de vehiculo")
	@NotNull(message = "El campo tipo de vehiculo no puede ser nulo y/o vacio")
	@Size(max = 100, message = "Los tipos de vehiculos deben tener maximo 100 caracteres")
	private String tipo;
	
	/** Marca de vehiculo */
	@Column(name = "marca", nullable = false, unique = false)
	@ApiModelProperty("Marca del vehiculo")
	@NotNull(message = "El campo marca de vehiculo no puede ser nulo y/o vacio")
	@Size(max = 100, message = "Las marcas de vehiculos deben tener maximo 100 caracteres")
	private String marca;
	
	/** Kilometros de vehiculo */
	@Column(name = "kilometros", nullable = false, unique = false)
	@ApiModelProperty("Kilometros del vehiculo")
	@NotNull(message = "El campo kilometros de vehiculo no puede ser nulo y/o vacio")
	@Size(max = 100, message = "Los Kilometros de vehiculos deben tener maximo 100 caracteres")
	private String kilometros;
	
	/** Modelo del vehiculo */
	@Column(name = "modelo", nullable = false, unique = false)
	@ApiModelProperty("Modelo del vehiculo")
	@NotNull(message = "El campo modelo de vehiculo no puede ser nulo y/o vacio")
	private Integer modelo;
	
	/** Placa del vehiculo */
	@Column(name = "placa", nullable = false, unique = false)
	@ApiModelProperty("Placa del vehiculo")
	@NotNull(message = "El campo placa de vehiculo no puede ser nulo y/o vacio")
	@Size(max = 6,min = 6, message = "La placa del vehiculo debe tener 6 caracteres")
	private String placa;
	
	/** Cilindraje del vehiculo */
	@Column(name = "cilindraje", nullable = false, unique = false)
	@ApiModelProperty("Cilindraje del vehiculo")
	@NotNull(message = "El campo cilindraje de vehiculo no puede ser nulo y/o vacio")
	private Double cilindraje;
	
	/** Tipo de gasolina */
	@Column(name = "tipoGasolina", nullable = false, unique = false)
	@ApiModelProperty("Tipo de gasolina del vehiculo")
	@NotNull(message = "El campo tipo de gasolina de vehiculo no puede ser nulo y/o vacio")
	@Size(max = 50, message = "El tipo gasolina del vehiculo debe tener maximo 50 caracteres")
	private String tipoGasolina;
	
	/** Mantenimiento vehiculo */
	@Column(name = "mantenimiento", nullable = false, unique = false)
	@ApiModelProperty("Mantenimiento del vehiculo")
	@NotNull(message = "El campo mantenimiento de vehiculo no puede ser nulo y/o vacio")
	@Size(max = 50, message = "El mantenimiento del vehiculo debe tener maximo 50 caracteres")
	private String mantenimiento;
	
	/** Lista de imagenes vehiculo */
	@Lob
	@Column(name = "imagen")
	private byte[] imagen;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getKilometros() {
		return kilometros;
	}

	public void setKilometros(String kilometros) {
		this.kilometros = kilometros;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Double getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(Double cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getTipoGasolina() {
		return tipoGasolina;
	}

	public void setTipoGasolina(String tipoGasolina) {
		this.tipoGasolina = tipoGasolina;
	}

	public String getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(String mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", tipo=" + tipo + ", marca=" + marca + ", kilometros=" + kilometros + ", modelo="
				+ modelo + ", placa=" + placa + ", cilindraje=" + cilindraje + ", tipoGasolina=" + tipoGasolina
				+ ", mantenimiento=" + mantenimiento + ", imagen=" + imagen + "]";
	}
	
	
	
	
	
	
}
