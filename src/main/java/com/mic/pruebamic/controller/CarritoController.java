package com.mic.pruebamic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mic.pruebamic.model.Carrito;
import com.mic.pruebamic.model.Producto;
import com.mic.pruebamic.model.Usuario;
import com.mic.pruebamic.repository.CarritoJpaRepository;
import com.mic.pruebamic.repository.ProductoJpaRepository;
import com.mic.pruebamic.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("carrito")
public class CarritoController {

	private static final Carrito New = null;

	@Autowired
	private CarritoJpaRepository carritoJpaRepository;

	@Autowired
	private ProductoJpaRepository productoJpaRepository;
	
	@Autowired
	private UsuarioJpaRepository usuarioJpaRepository;

	@GetMapping("")
	public String carrito() {
		
		return "carrito";

	}

	@GetMapping("todos")
	public List<Carrito> getProductos() {
		List<Carrito> productos = carritoJpaRepository.findAll();
		return productos;

	}

	@GetMapping("{id}")
	public Carrito getUsuarioById(@PathVariable("id") Integer id) {
		Optional<Carrito> unOptionalCarrito = carritoJpaRepository.findById(id);
		return unOptionalCarrito.get();

	}

	@PostMapping("{id}")
	public String insertProducto(@PathVariable("id") Integer id,Model model,Integer idUsuario) {
		Optional<Producto> unOptionalProducto = productoJpaRepository.findById(id);
		model.addAttribute("productoAgregado", unOptionalProducto.get());
//		Optional<Carrito> unOptionalCarrito = carritoJpaRepository.findById(id);
		Usuario unUsuario = usuarioJpaRepository.findById(idUsuario).get();
		return "carrito";

	}

	@PostMapping("add")
	public Carrito insertCarrito(Carrito unProductoASeleccionar) {
		Carrito unProductoSeleccionado = carritoJpaRepository.save(unProductoASeleccionar);
		
		return unProductoSeleccionado;

	}

	
	
	@DeleteMapping("{id}")
	public void deleteCarrito(@PathVariable("id") Integer id) {
		carritoJpaRepository.deleteById(id);
	}

	
}