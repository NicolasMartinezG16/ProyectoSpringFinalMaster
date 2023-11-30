package com.curso.service;

import java.util.List;

import com.curso.model.Vuelo;

/**
 * Service de vuelos para mas tarde la implementacion de las consultas de la tabla vuelos
 * @author Nicolas Martinez Gonzalez
 * @see VuelosServiceImpl
 */
public interface VuelosService {
	List<Vuelo> listaVuelosConPlazas(int plazasDeseadas);
	void actualizarVuelo(int idvuelo, int plazasreservadas);
	Vuelo infoVuelo(int idVuelo);
	List<Vuelo> altaVuelo(Vuelo vuelo);
	void eliminarVuelo(int idVuelo);
	List<Vuelo> listaVuelos();
}
