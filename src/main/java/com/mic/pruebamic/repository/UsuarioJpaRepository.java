package com.mic.pruebamic.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.mic.pruebamic.model.Usuario;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, Integer>{

	

}
