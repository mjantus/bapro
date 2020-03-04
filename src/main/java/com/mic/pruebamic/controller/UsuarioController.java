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
import com.mic.pruebamic.repository.UsuarioJpaRepository;

@Controller
@RequestMapping("usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioJpaRepository usuarioJpaRepository;
	@Autowired
	private CarritoJpaRepository carritoJpaRepository;

	@GetMapping("all")
	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = usuarioJpaRepository.findAll();
		return usuarios;
	}

	@GetMapping({ "id" })
	public Usuario getUsuarioById(@PathVariable("id") Integer id) {
		Optional<Usuario> unOptionalUsuario = usuarioJpaRepository.findById(id);
		return unOptionalUsuario.get();
	}

	@PostMapping("add")
	public String insertUsuario(Usuario unUsuarioARegistrar) {
		Carrito unCarrito = new Carrito();
		unUsuarioARegistrar.setCarrito(unCarrito);
		usuarioJpaRepository.save(unUsuarioARegistrar);
		carritoJpaRepository.save(unCarrito);

		return "redirect:/index";

	}

	@DeleteMapping("{id}")
	public void deleteUsuario(@PathVariable("id") Integer id) {
		usuarioJpaRepository.deleteById(id);
	}

}
