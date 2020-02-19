package com.mic.pruebamic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable=false)
	private String nombre;
    private String apellido;
    
    @Column(nullable=false, unique=true)
    private String password;
    private String email;
    private String numeroDocumento;
    private Carrito unCarrito;
    private boolean admin;
    
    public Usuario() {
    	
    }


    public Usuario( String nombre, String apellido, String password, String email, String numeroDocumento, Boolean admin) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.email = email;
        this.numeroDocumento = numeroDocumento;
        this.unCarrito = new Carrito(this);
        this.admin = admin;
      
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


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public boolean isAdmin() {
		return admin;
	}


	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
