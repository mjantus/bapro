package com.mic.pruebamic.controllers;

/**
 * Controller sirve para retornar HTML 
 * UTILIZANDO LA DEPENDENCIA DE THYMELEAF
 * 
 * Con respecto a las dependencias: la Spring WEB en el 99.9% se utiliza cuando quieres hacer un proyecto con un servidor web. (navegable desde internet)
y la dependencia Thymeleaf se utiliza para integrar JAVA Spring con HTML.
 * 
 * @author MicheleJantus
 *
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	@GetMapping("*")// el * es un Wildcard (comodín) que sirve para cuando alguien entra al navegador y pide nada o algo que no esta, tira el index.html
	public String cualquierOtra() {
		return "./index";
	}
	
	@GetMapping ("index") 
	public String getIndex() {
		return "./index";
		}
	
	@GetMapping("login")
	public String irAlLogin() {
		return "./login";
	}
	
	@GetMapping("registro")
	public String irAlRegistro() {
		return "./registro";
	}
	
	@GetMapping("preguntasfrecuentes")
	public String irAPreguntas() {
		return "./preguntasfrecuentes";
	}
}
