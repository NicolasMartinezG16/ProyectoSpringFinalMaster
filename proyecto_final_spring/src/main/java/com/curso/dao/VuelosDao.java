package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Vuelo;

/**
 * Interfaz dao que me permitira manejar consultas crud con los objetos Vuelo a sus correspondientes tablas
 * @author Nicolas Martinez Gonzalez
 */
public interface VuelosDao extends JpaRepository<Vuelo, Integer> {
	List<Vuelo> findByPlazasdisponiblesGreaterThan(int plazasReservadas);
	
}	
