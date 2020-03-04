package com.mic.pruebamic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mic.pruebamic.model.Producto;

@Controller
public class ProductoController {
	@GetMapping(value = "/agregar")
	public String agregarProducto(Model model) {
	    model.addAttribute("producto", new Producto());
	    return "productos/agregar_producto";
	}
	
	
}
