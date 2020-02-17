package com.mic.pruebamic.model;
public class Cliente extends Usuario {

	public Cliente(String nombre, String apellido, String password, String email, String numeroDocumento) {
		super(nombre, apellido, password, email, numeroDocumento);
		// TODO Auto-generated constructor stub
	}

	public Cliente() {
		super(null,null,null,null,null);
	}

	public void altaCliente() {
	System.out.println("Te registraste con exito");
	}
}