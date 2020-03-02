package com.mic.pruebamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mic.pruebamic.model.Usuario;


@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Integer>{

	//SQL: SELECT * FROM usuario WHERE email = mail
	//JPQL: SELECT u FROM Usuario u WHERE u.email = ?1
	public Usuario findByEmail(String mail);
	
}
