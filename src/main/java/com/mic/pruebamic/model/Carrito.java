package com.mic.pruebamic.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mic.pruebamic.model.Producto;

@Entity
public class Carrito {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable=false)
	private Usuario usuario;
	
	@Column(nullable=false)
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
	public Double getTotalPrecio(){
	      Double contador = 0.0;
	      for (Producto producto : productos) {
	          contador += producto.getPrecio();
	      }

	      return contador;

}
}
