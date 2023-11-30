package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Reserva;

/**
 * Interfaz dao que me permitira manejar consultas crud con los objetos Reserva a sus correspondientes tablas
 * @author Nicolas Martinez Gonzalez
 */
public interface ReservasDao extends JpaRepository<Reserva, Integer> {
	List<Reserva> findByidhotel(int idHotel);
}
