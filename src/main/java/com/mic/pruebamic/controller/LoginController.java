package com.mic.pruebamic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.mic.pruebamic.model.Usuario;
import com.mic.pruebamic.repository.UsuarioJpaRepository;

@Controller
public class LoginController {

	@Autowired
	private UsuarioJpaRepository usuarioJpaRepository;

	@PostMapping("index")
	public String loginUsuario(Usuario unUsuarioALoguear,Model model) {

		//Estos datos vienen del <form>
		String emailALoguear = unUsuarioALoguear.getEmail();
		String passwordALoguear = unUsuarioALoguear.getPassword();

		//Busco en DB un Usuario con el email pasado por <form>
		Usuario unUsuarioLogueado = usuarioJpaRepository.findByEmail(emailALoguear);
		
		//Compruebo que se haya encontrado al Usuario en DB
		if(unUsuarioLogueado == null) {
			model.addAttribute("mensaje", "No se encontró usuario con ese mail");
			return "login";
		} 			
			
		//Pido la password del usuario en DB
		String passwordLogueado = unUsuarioLogueado.getPassword();
		
		//Comparo la clave ingresada por <form> con la obtenida de DB
		if(passwordALoguear.equals(passwordLogueado)) {
			return "redirect:index";
		} else {
			return "redirect:registro";
		}
	}

}
