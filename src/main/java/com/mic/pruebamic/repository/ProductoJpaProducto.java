package com.mic.pruebamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mic.pruebamic.model.Producto;

@Repository
public interface ProductoJpaProducto extends JpaRepository<Producto, Integer> {
	
	
	public Producto findByName(String nombre);

	}


