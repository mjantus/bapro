package com.mic.pruebamic.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.mic.pruebamic.model.Usuario;

@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario Integer>

static Optional<Usuario> findById(java.lang.Integer id) {
	// TODO Auto-generated method stub
	return null;
}
}