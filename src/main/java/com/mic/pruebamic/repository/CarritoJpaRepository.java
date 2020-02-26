package com.mic.pruebamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mic.pruebamic.model.Carrito;

@Repository
public interface CarritoJpaRepository extends JpaRepository<Carrito, Integer>{

}
