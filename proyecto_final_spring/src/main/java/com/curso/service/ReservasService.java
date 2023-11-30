package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;

/**
 * Service de reservas para mas tarde la implementacion de las consultas de la tabla reservas
 * @author Nicolas Martinez Gonzalez
 * @see ReservasServiceImpl
 */
public interface ReservasService {
	void altaReserva(Reserva reserva, int plazasReservadas);
	List<Reserva> reservasDeHotel(String nombreHotel);
	List<Reserva> listaReservas();
	List<Reserva> eliminarReserva(int idreserva);
	Reserva infoReserva(int idreserva);
}
