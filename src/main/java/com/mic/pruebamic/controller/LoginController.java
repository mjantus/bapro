package com.mic.pruebamic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mic.pruebamic.model.Usuario;
import com.mic.pruebamic.repository.UsuarioJpaRepository;

import aj.org.objectweb.asm.Attribute;

@Controller
public class LoginController {

	@Autowired
	private UsuarioJpaRepository usuarioJpaRepository;

	@PostMapping("index")
	public String loginUsuario(Usuario unUsuarioALoguear,Model model,RedirectAttributes redirectAttributes) {

		//Estos datos vienen del <form>
		String emailALoguear = unUsuarioALoguear.getEmail();
		String passwordALoguear = unUsuarioALoguear.getPassword();

		//Busco en DB un Usuario con el email pasado por <form>
		Usuario unUsuarioLogueado = usuarioJpaRepository.findByEmail(emailALoguear);
		
		//Compruebo que se haya encontrado al Usuario en DB
		if(unUsuarioLogueado == null) {
			model.addAttribute("mensaje", "No se encontrÃ³ usuario con ese mail");
			return "login";
		} 			
			
		//Pido la password del usuario en DB
		String passwordLogueado = unUsuarioLogueado.getPassword();
		
		//Comparo la clave ingresada por <form> con la obtenida de DB
		if(passwordALoguear.equals(passwordLogueado)) {
			redirectAttributes.addAttribute("idUsuario", unUsuarioLogueado.getId());
			return "redirect:index";
		} else {
			model.addAttribute("mensaje", "Usuario o contraseÃ±a incorrectos");
			return "login";
		}
	
	
	
	}

}
