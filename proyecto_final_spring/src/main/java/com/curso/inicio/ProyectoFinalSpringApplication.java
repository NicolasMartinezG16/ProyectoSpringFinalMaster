package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

/**
 * Application inicial del proyecto
 * Escaneo de las entidades en la paquete com.curso.model
 * Permito las interfaces con repositorios de jpa del paquete com.curso.dao
 * Escaneo paquetes base que usara mi aplicacion de spring: com.curso.controller, com.curso.service
 * @author Nicolas Martinez Gonzalez
 */
@EntityScan(basePackages="com.curso.model")
@EnableJpaRepositories(basePackages="com.curso.dao")
@SpringBootApplication(scanBasePackages={"com.curso.controller","com.curso.service"})
public class ProyectoFinalSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalSpringApplication.class, args);
	}

	/**
	 * Instancio el resttemplate para poder realizar peticiones a otro recurso desde otra implementacion de un service
	 * @return
	 */
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
