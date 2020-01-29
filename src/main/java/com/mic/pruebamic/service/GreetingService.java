package com.mic.pruebamic.service;

import org.springframework.stereotype.Service;

/**
 * con el @service registramos la clase GreetingService como unservicio de spring así podemos utilizarlos desde otra clase.
 * @author Digital
 *
 */


@Service
public class GreetingService {

	public String getGreeting() {
		return "Hello amigos";
	}
}
