package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VuelosDao;
import com.curso.model.Vuelo;

/**
 * Implementacion de los metodos del service VuelosService con consultas de jparepository sobre la tabla vuelos
 * @author Nicolas Martinez Gonzalez
 * @see VuelosService, VuelosDao
 * Mas informacion del funcionamiento de las consultas en el controller
 */
@Service
public class VuelosServiceImpl implements VuelosService {
	
	/**
	 * Inyeccion de la interfaz VuelosDao para consultas de jparepository sobre la tabla vuelos
	 */
	@Autowired
	VuelosDao dao;
	
	@Override
	public List<Vuelo> listaVuelosConPlazas(int plazasDeseadas) {
		return dao.findByPlazasdisponiblesGreaterThan(plazasDeseadas);
	}

	@Override
	public void actualizarVuelo(int idvuelo, int plazasreservadas) {
		Vuelo vuelo = dao.findById(idvuelo).orElse(null);
		vuelo.setPlazasdisponibles(vuelo.getPlazasdisponibles()-plazasreservadas);
		dao.save(vuelo);
	}

	@Override
	public List<Vuelo> altaVuelo(Vuelo vuelo) {
		dao.save(vuelo);
		return dao.findAll();
	}

	@Override
	public void eliminarVuelo(int idvuelo) {
		dao.deleteById(idvuelo);
	}

	@Override
	public Vuelo infoVuelo(int idvuelo) {
		return dao.findById(idvuelo).orElse(null);
	}

	@Override
	public List<Vuelo> listaVuelos() {
		return dao.findAll();
	}
}
