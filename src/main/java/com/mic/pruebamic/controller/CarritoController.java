package com.mic.pruebamic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mic.pruebamic.model.Carrito;
import com.mic.pruebamic.model.Usuario;
import com.mic.pruebamic.repository.CarritoJpaRepository;



@Controller
@RequestMapping("carrito")
public class CarritoController {
 
	@Autowired
	private CarritoJpaRepository carritoJpaRepository;
 
	@GetMapping("todos")
	public List<Carrito> getProductos(){
		List<Carrito>productos = carritoJpaRepository.findAll();
		return productos;
	
	}

	@GetMapping({"id"})
	public Carrito getUsuarioById(@PathVariable ("id") Integer id) {
	Optional<Carrito>unOptionalCarrito = carritoJpaRepository.findById(id);
	return unOptionalCarrito.get();


	}

	@PostMapping("add")
	public Carrito insertCarrito(Carrito unProductoASeleccionar) {
		Carrito unProductoSeleccionado = carritoJpaRepository.save(unProductoASeleccionar);
				return unProductoSeleccionado;
	

	}
	
	
	@DeleteMapping("{id}")
	public void deleteCarrito(@PathVariable ("id")Integer id ) {
		carritoJpaRepository.deleteById(id);
	}
	
	
}