package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Declaro las instancias de la clase hotel como entidades de la tabla hoteles
 * @author Nicolas Martinez Gonzalez
 */
@Entity
@Table(name="hoteles")
public class Hotel {
	/**
	 * Indico que el atributo idhotel sera la clave primaria para las instancias de la clase hotel
	 */
	@Id
	private int idhotel;
	private String nombre;
	private int categoria;
	private double precio;
	private int disponible;
	
	public Hotel() {
		super();
	}
	
	public Hotel(int idhotel, String nombre, int categoria, double precio, int disponible) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}

	public int getIdhotel() {
		return idhotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDisponible() {
		return disponible;
	}

	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}
}
