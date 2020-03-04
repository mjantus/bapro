package com.mic.pruebamic.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.mic.pruebamic.model.Producto;

@Entity
public class Carrito {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	 @OneToOne(mappedBy = "carrito")
	private Usuario usuario;
	
	@ManyToMany()
	@JoinTable(name = "carrito_productos")
	private List<Producto> productos;
	
	public Carrito() {
		
	}
	
	public Carrito(Usuario usuario) {
		this.usuario = usuario;
		this.productos = new ArrayList<>();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Integer getTotalProductos(){
      return productos.size();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



}
