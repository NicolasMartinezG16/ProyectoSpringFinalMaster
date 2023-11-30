package com.curso.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Declaro las instancias de la clase vuelo como entidades de la tabla vuelos
 * @author Nicolas Martinez Gonzalez
 */
@Entity
@Table(name="vuelos")
public class Vuelo {
	/**
	 * Indico que el atributo idvuelo sera la clave primaria para las instancias de la clase vuelo
	 */
	@Id
	private int idvuelo;
	private String comp;
	private LocalDate fechavuelo;
	private double precio;
	private int plazasdisponibles;
	
	public Vuelo() {
		super();
	}
	
	public Vuelo(int idvuelo, String comp, LocalDate fechavuelo, double precio, int plazasdisponibles) {
		super();
		this.comp = comp;
		this.fechavuelo = fechavuelo;
		this.precio = precio;
		this.plazasdisponibles = plazasdisponibles;
	}

	public int getIdvuelo() {
		return idvuelo;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public LocalDate getFechavuelo() {
		return fechavuelo;
	}

	public void setFechavuelo(LocalDate fechavuelo) {
		this.fechavuelo = fechavuelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPlazasdisponibles() {
		return plazasdisponibles;
	}

	public void setPlazasdisponibles(int plazasdisponibles) {
		this.plazasdisponibles = plazasdisponibles;
	}
}
