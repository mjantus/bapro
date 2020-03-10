package com.mic.pruebamic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mic.pruebamic.model.Producto;

import com.mic.pruebamic.repository.ProductoJpaRepository;
import com.mic.pruebamic.repository.UsuarioJpaRepository;


@Controller
public class HomeController {

	@Autowired
	ProductoJpaRepository productoJpaRepository;
	
	@Autowired
	UsuarioJpaRepository usuarioJpaRepository;
	
	@GetMapping("index")
	public String inicio(Model model,Integer idUsuario) {
		List<Producto> listaProductos = productoJpaRepository.findAll();
		model.addAttribute("listaProductos", listaProductos);
		model.addAttribute("idUsuario", idUsuario);
		
		return "index";
	}

	
	@GetMapping("login")
	public String logIn() {
		return "login";
	}
	
	
	@GetMapping("registro")
	public String registro() {
		return "registro";
	
	}
	
	}
	

