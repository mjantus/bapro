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


import com.mic.pruebamic.model.Usuario;
import com.mic.pruebamic.repository.UsuarioJpaRepository;


@Controller
@RequestMapping("usuarios")
	public class UsuarioController {

	@Autowired
	private UsuarioJpaRepository usuarioJpaRepository;
	
	
	@GetMapping("")
	public List<Usuario>getUsuarios(){
		List<Usuario>usuarios = usuarioJpaRepository.findAll();
		return usuarios;
	}
	
	@GetMapping({"id"})
	public Usuario getUsuarioById(@PathVariable ("id") Integer id) {
	Optional<Usuario>unOptionalUsuario = usuarioJpaRepository.findById(id);
	return unOptionalUsuario.get();
	}
	
	@PostMapping("")
	public Usuario insertUsuario(Usuario unUsuarioARegistrar) {
		Usuario unUsuarioRegistrado = usuarioJpaRepository.save(unUsuarioARegistrar);
				return unUsuarioRegistrado;
	
	}
	
	@DeleteMapping("{id}")
	public void deleteUsuario(@PathVariable ("id")Integer id ) {
		usuarioJpaRepository.deleteById(id);
	}
	
}
	
	
	
	
	
	
	
	
	
	

