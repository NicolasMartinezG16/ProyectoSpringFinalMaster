package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Hotel;

/**
 * Interfaz dao que me permitira manejar consultas crud con los objetos Hotel a sus correspondientes tablas
 * @author Nicolas Martinez Gonzalez
 */
public interface HotelesDao extends JpaRepository<Hotel, Integer> {
	Hotel findByNombre(String name);
}
