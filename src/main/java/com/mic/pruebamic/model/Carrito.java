package com.mic.pruebamic.model;
import java.util.ArrayList;
import java.util.List;

import com.mic.pruebamic.model.Producto;

public class Carrito {
	
	private Integer id;
	private Usuario usuario;
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
	
	public Double getTotalPrecio(){
      Double contador = 0.0;
      for (Producto producto : productos) {
          contador += producto.getPrecio();
      }

      return contador;
  }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
