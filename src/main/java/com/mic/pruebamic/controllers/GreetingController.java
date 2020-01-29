package com.mic.pruebamic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mic.pruebamic.service.GreetingService;

/**
 * usamos restcontroller porque solo queremos mostrar un string por pantalla y no queremos armar el mensaje en un HTML.
 * @author Digital
 *
 */

@RestController
public class GreetingController {
	
	@Autowired
	private GreetingService greetingService;

	// con el autowired le indicamos a pring que nos inicilaice a nuestro atributo GreetingService, es decir le va a hacer unnew GreetingService();
	// Esto sucede porque previamente registramos la clase con @service
	

	
	/** 
	 * el getmapping es para que cuando se acceda al localshost:8080/greeting nos devuelva lo del return 
	 * @return
	 */
	
	// el controlador tendría que solo llamar al servicio que se encargue de esto, y no como haremos ahora que devolverá algo.
	
	@GetMapping("hola")
	public String greeting() {
		return "Hello amigos";
	}

}
