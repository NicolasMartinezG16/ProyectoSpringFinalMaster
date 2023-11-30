package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelesService;

/**
 * Declaro el HotelesController como un RestController para poder manejar las peticiones al recurso
 * @author Nicolas Martinez Gonzalez
 * @see HotelesService
 */
@RestController
public class HotelesController {
	
	/**
	 * Creo una inyeccion del HotelesService en el controlador de hoteles
	 */
	@Autowired
	HotelesService hotelesService;
	
	/**
	 * Consulta get que me devolvera la lista de hoteles
	 * @return
	 */
	@GetMapping(value="hoteles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> listaHoteles(){
		return hotelesService.listaHoteles();
	}
	
	/**
	 * Consulta que me devolvera la informacion de un hotel segun el nombre que recibira en la url en la posicion {nombrehotel}
	 * @param nombrehotel
	 * @return
	 */
	@GetMapping(value="hoteles/info/{nombrehotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hotel infoHotel(@PathVariable("nombrehotel") String nombrehotel) {
		return hotelesService.infoHotel(nombrehotel);
	}
	
	/**
	 * Consulta para dar de alta un hotel en la tabla hoteles
	 * @param hotel
	 * @return
	 */
	@PostMapping(value="hoteles", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> altaHotel(@RequestBody Hotel hotel){
		return hotelesService.altaHotel(hotel);
	}
	
	/**
	 * Consulta para actualizar los atributos de un hotel en la tabla hoteles mendiante un json en el body
	 * @param hotel
	 */
	@PutMapping(value="hoteles", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarHotel(@RequestBody Hotel hotel) {
		hotelesService.actualizarHotel(hotel);
	}
	
	/**
	 * Consulta para obtener informacion de un hotel introduciendo su idhotel en la url
	 * @param idhotel
	 */
	@DeleteMapping(value="hoteles/{idhotel}")
	public void eliminarHotel(@PathVariable("idhotel") int idhotel) {
		hotelesService.eliminarHotel(idhotel);
	}
}
