package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelesDao;
import com.curso.model.Hotel;

/**
 * Implementacion de los metodos del service HotelesService con consultas de jparepository sobre la tabla hoteles
 * @author Nicolas Martinez Gonzalez
 * @see HotelesService, HotelesDao
 * Mas informacion del funcionamiento de las consultas en el controller
 */
@Service
public class HotelesServiceImpl implements HotelesService {
	/**
	 * Inyeccion de la interfaz HotelesDao para consultas de jparepository sobre la tabla hoteles
	 */
	@Autowired
	HotelesDao dao;
	
	@Override
	public List<Hotel> listaHoteles() {
		return dao.findAll();
	}

	@Override
	public Hotel infoHotel(String nombre) {
		return dao.findByNombre(nombre);
	}

	@Override
	public List<Hotel> altaHotel(Hotel hotel) {
		dao.save(hotel);
		return dao.findAll();
	}

	@Override
	public void actualizarHotel(Hotel hotel) {
		dao.save(hotel);		
	}

	@Override
	public void eliminarHotel(int idhotel) {
		dao.deleteById(idhotel);		
	}
}
