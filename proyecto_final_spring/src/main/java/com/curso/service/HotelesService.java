package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;

/**
 * Service de hoteles para mas tarde la implementacion de las consultas de la tabla hoteles
 * @author Nicolas Martinez Gonzalez
 * @see HotelesServiceImpl
 */
public interface HotelesService {
	List<Hotel> listaHoteles();
	Hotel infoHotel(String nombre);
	List<Hotel> altaHotel(Hotel hotel);
	void actualizarHotel(Hotel hotel);
	void eliminarHotel(int idhotel);
}
