package com.mic.pruebamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mic.pruebamic.model.Producto;

@Repository
public interface ProductoJpaRepository extends JpaRepository<Producto, Integer> {
	
	
	public Producto findByNombre(String nombre);

}


