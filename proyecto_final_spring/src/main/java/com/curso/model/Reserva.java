package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Declaro las instancias de la clase reserva como entidades de la tabla reservas
 * @author Nicolas Martinez Gonzalez
 */
@Entity
@Table(name="reservas")
public class Reserva {
	/**
	 * Indico que el atributo idreseva sera la clave primaria para las instancias de la clase reserva
	 */
	@Id
	private int idreserva;
	private String nombrecliente;
	private String dni;
	private int idhotel;
	private int idvuelo;
	
	public Reserva() {
		super();
	}

	public Reserva(int idreserva, String nombrecliente, String dni, int idhotel, int idvuelo) {
		super();
		this.nombrecliente = nombrecliente;
		this.dni = dni;
		this.idhotel = idhotel;
		this.idvuelo = idvuelo;
	}

	public int getIdreserva() {
		return idreserva;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdhotel() {
		return idhotel;
	}

	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}

	public int getIdvuelo() {
		return idvuelo;
	}

	public void setIdvuelo(int idvuelo) {
		this.idvuelo = idvuelo;
	}
}
