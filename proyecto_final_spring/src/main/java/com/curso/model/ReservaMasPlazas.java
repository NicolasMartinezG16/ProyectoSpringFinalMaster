package com.curso.model;

/**
 * Clase de apoyo para la consulta de alta de reservas
 * @author Nicolas Martinez Gonzalez
 * @see ReservasController
 */
public class ReservaMasPlazas {
	private int idreserva;
	private String nombrecliente;
	private String dni;
	private int idhotel;
	private int idvuelo;
	private int numplazas;
	
	public ReservaMasPlazas() {
		super();
	}

	public ReservaMasPlazas(int idreserva, String nombrecliente, String dni, int idhotel, int idvuelo, int numplazas) {
		super();
		this.idreserva = idreserva;
		this.nombrecliente = nombrecliente;
		this.dni = dni;
		this.idhotel = idhotel;
		this.idvuelo = idvuelo;
		this.numplazas = numplazas;
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
	public int getNumplazas() {
		return numplazas;
	}
	public void setNumplazas(int numplazas) {
		this.numplazas = numplazas;
	}
}
