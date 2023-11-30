package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Reserva;
import com.curso.model.ReservaMasPlazas;
import com.curso.service.ReservasService;

/**
 * Declaro el ReservasController como un RestController para poder manejar las peticiones al recurso
 * @author Nicolas Martinez Gonzalez
 * @see ReservasService
 */
@RestController
public class ReservasController {

	/**
	 * Creo una inyeccion del ReservasService en el controlador de reservas
	 */
	@Autowired
	ReservasService reservasService;
	
	/**
	 * Consulta que dará de alta una instancia de Reserva en la tabla Reservas además de 
	 * reducir el numero de plazas disponibles en el vuelo especificado en la reserva a traves de su idvuelo
	 * 
	 * El body de la consulta sera convertido en una instancia de la clase de apoyo ReservaMasPlazas para mas tarde
	 * extraer todos los atributos menos el numplazas en una instancia de la clase Reserva y el numplazas sera 
	 * restado a las plazasdisponibles del correspondiente vuelo en la tabla vuelos
	 * @param reservaPlazas
	 */
	@PostMapping(value="reservas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaReserva(@RequestBody ReservaMasPlazas reservaPlazas) {
		Reserva reservaTemp = new Reserva(
				reservaPlazas.getIdreserva(),
				reservaPlazas.getNombrecliente(),
				reservaPlazas.getDni(),
				reservaPlazas.getIdhotel(),
				reservaPlazas.getIdvuelo());
		reservasService.altaReserva(reservaTemp, reservaPlazas.getNumplazas());
	}
	
	/**
	 * Consulta para obtener todas las reservas asignadas al hotel de la tabla hoteles con el nombre introducido
	 * en la url
	 * @param nombrehotel
	 * @return
	 */
	@GetMapping(value="reservas/{nombrehotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> reservasDeHotel(@PathVariable("nombrehotel") String nombrehotel){
		return reservasService.reservasDeHotel(nombrehotel);
	}
	
	/**
	 * Consulta para obtener todas las reservas de la tabla reservas
	 * @param nombrehotel
	 * @return
	 */
	@GetMapping(value="reservas", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> listaReservas(){
		return reservasService.listaReservas();
	}
	
	/**
	 * Consulta para eliminar una reserva de la tabla reserva mediante la introduccion de su id en la url
	 * @param idreserva
	 * @return
	 */
	@DeleteMapping(value="reservas/{idreserva}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> eliminarReserva(@PathVariable("idreserva") int idreserva){
		return reservasService.eliminarReserva(idreserva);
	}
	
	/**
	 * Consulta para obtener la informacion de una reserva mediante la introduccion de su id en la url
	 * @param idreserva
	 * @return
	 */
	@GetMapping(value="reservas/info/{idreserva}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Reserva infoReserva(@PathVariable("idreserva") int idreserva) {
		return reservasService.infoReserva(idreserva);
	}
}
