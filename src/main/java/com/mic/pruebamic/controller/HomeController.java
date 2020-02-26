package com.mic.pruebamic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	@GetMapping("index")
	public String inicio() {
		return "index";
	}
	
	@GetMapping("login")
	public String logIn() {
		return "login";
	}
	@GetMapping("preguntasfrecuentes")
	public String preguntasFrecuentes() {
		return "preguntasfrecuentes";
	}
	
	@GetMapping("registro")
	public String registro() {
		return "registro";
	
}
	@GetMapping("carrito")
	public String carrito() {
		return "carrito";
		
	}
}
