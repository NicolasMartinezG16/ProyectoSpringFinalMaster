package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservasDao;
import com.curso.model.Hotel;
import com.curso.model.Reserva;

/**
 * Implementacion de los metodos del service ReservasService con consultas de jparepository sobre la tabla reservas
 * @author Nicolas Martinez Gonzalez
 * @see ReservasService, ReservasDao
 * Mas informacion del funcionamiento de las consultas en el controller
 */
@Service
public class ReservasServiceImpl implements ReservasService {

	/**
	 * Inyeccion de la interfaz ReservasDao para consultas de jparepository sobre la tabla reservas
	 */
	@Autowired
	ReservasDao dao;
	
	@Autowired
	RestTemplate template;
	
	String urlHoteles = "http://localhost:8080/hoteles/";
	String urlVuelos = "http://localhost:8080/vuelos/";
	
	@Override
	public void altaReserva(Reserva reserva, int plazasReservadas) {
		dao.save(reserva);
		template.put(urlVuelos + reserva.getIdvuelo() + "/" + plazasReservadas, null);
	}

	@Override
	public List<Reserva> reservasDeHotel(String nombreHotel) {
		Hotel hotelTemp = template.getForObject(urlHoteles + "/info/" + nombreHotel, Hotel.class);
		int idHotel = hotelTemp.getIdhotel();
		return dao.findByidhotel(idHotel);
	}
	
	@Override
	public List<Reserva> listaReservas(){
		return dao.findAll();
	}

	@Override
	public List<Reserva> eliminarReserva(int idreserva) {
		dao.deleteById(idreserva);;
		return dao.findAll();
	}

	@Override
	public Reserva infoReserva(int idreserva) {
		return dao.findById(idreserva).orElse(null);
	}
}
