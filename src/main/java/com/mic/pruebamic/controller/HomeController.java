package com.mic.pruebamic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mic.pruebamic.model.Producto;
import com.mic.pruebamic.repository.ProductoJpaRepository;


@Controller
public class HomeController {

	@Autowired
	ProductoJpaRepository productoJpaRepository;
	
	@GetMapping("index")
	public String inicio(Model model) {
		
		List<Producto> listaProductos = productoJpaRepository.findAll();
		
		model.addAttribute("listaProductos", listaProductos);
		
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
	
}
