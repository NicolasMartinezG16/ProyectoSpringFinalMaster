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

import com.curso.model.Vuelo;
import com.curso.service.VuelosService;

/**
 * Declaro el VuelosController como un RestController para poder manejar las peticiones al recurso
 * @author Nicolas Martinez Gonzalez
 * @see VuelosService
 */
@RestController
public class VuelosController {
	/**
	 * Creo una inyeccion del VuelosService en el controlador de vuelos
	 */
	@Autowired
	VuelosService vuelosService;
	
	/**
	 * Consulta para obtener los vuelos que dispongan de un numero de plazasdisponibles 
	 * superior al numplazas  recibido por la url
	 * @param plazasDeseadas
	 * @return
	 */
	@GetMapping(value = "vuelos/{numplazas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> listaVuelos(@PathVariable("numplazas") int plazasDeseadas){
		return vuelosService.listaVuelosConPlazas(plazasDeseadas);
	}
	
	/**
	 * Consulta para actualizar el atributo plazasdisponibles restandole las plazasreservadas introducidas por la url 
	 * de un vuelo con el idvuelo introducido tambien por la url
	 * @param idvuelo
	 * @param plazasreservadas
	 */
	@PutMapping(value="vuelos/{idvuelo}/{plazasreservadas}")
	public void actualizarVuelo(@PathVariable("idvuelo") int idvuelo, @PathVariable("plazasreservadas") int plazasreservadas) {
		vuelosService.actualizarVuelo(idvuelo, plazasreservadas);
	}
	
	/**
	 * Consulta para obtener la informacion de un vuelo mediante su idvuelo introducido por la url
	 * @param idvuelo
	 * @return
	 */
	@GetMapping(value="vuelos/info/{idvuelo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Vuelo infoVuelo(@PathVariable("idvuelo") int idvuelo) {
		return vuelosService.infoVuelo(idvuelo);
	}
	
	/**
	 * Consulta para dar de alta un vuelo en la tabla vuelos
	 * @param vuelo
	 * @return
	 */
	@PostMapping(value="vuelos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> altaVuelo(@RequestBody Vuelo vuelo){
		return vuelosService.altaVuelo(vuelo);
	}
	
	/**
	 * Consulta para eliminar un vuelo de la tabla vuelos introduciendo su idvuelo en la url
	 * @param idvuelo
	 */
	@DeleteMapping(value="vuelos/{idvuelo}")
	public void eliminarVuelo(@PathVariable("idvuelo") int idvuelo) {
		vuelosService.eliminarVuelo(idvuelo);
	}
	
	/**
	 * Consulta para obtener informacion de todos los vuelos en la tabla vuelos
	 * @return
	 */
	@GetMapping(value="vuelos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> listaVuelos() {
		return vuelosService.listaVuelos();
	}
}
