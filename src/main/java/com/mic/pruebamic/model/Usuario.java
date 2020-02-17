package com.mic.pruebamic.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class Usuario  {
	@Column(nullable=false)
	private String nombre;
    private String apellido;
    
    @Column(nullable=false, unique=true)
    private String password;
    private String email;
    private String numeroDocumento;
    
    private Carrito unCarrito;
    
    public Usuario() {
    	
    }


    public Usuario( String nombre, String apellido, String password, String email, String numeroDocumento) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.email = email;
        this.numeroDocumento = numeroDocumento;
        this.unCarrito = new Carrito(this);
      
    }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public Carrito getUnCarrito() {
		return unCarrito;
	}


	public void setUnCarrito(Carrito unCarrito) {
		this.unCarrito = unCarrito;
	}


	public String getEmail() {
		return email;
	}
}
