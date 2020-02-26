package com.mic.pruebamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mic.pruebamic.model.Usuario;


@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Integer>{

	

}
