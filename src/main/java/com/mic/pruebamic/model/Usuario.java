package com.mic.pruebamic.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nombre;
	private String apellido;
	private String provincia;
	private Double telefono;



	public Usuario(String provincia, Double telefono) {
		super();
		this.provincia = provincia;
		this.telefono = telefono;
	}

	
	
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Double getTelefono() {
		return telefono;
	}

	public void setTelefono(Double telefono) {
		this.telefono = telefono;
	}

	

	private Date fechaNacimiento;
	private String direccion;

	@Column(nullable = false)
	private String password;
	@Column(nullable = false, unique = true)
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carrito_id", referencedColumnName = "id")
	private Carrito carrito;
	// private boolean admin;
	@Column(nullable = false, unique = true)
	private String user;

	public Usuario() {
	}

	public Usuario(Integer id, String nombre, String apellido, Date fechaNacimiento, String direccion, String password,
			String email, Carrito carrito, String user) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.password = password;
		this.email = email;
		this.carrito = carrito;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}

/*
 * public String getDireccion() { return direccion; }
 * 
 * 
 * public void setDireccion(String direccion) { this.direccion = direccion; }
 * 
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * 
 * // private String numeroDocumento; // private Carrito unCarrito; private
 * boolean admin; >>>>>>> 622e8cbf12d1165a51df454c14ecb06ddabb7750
 * 
 * public Usuario() {
 * 
 * }
 * 
 * 
 * public Usuario( String nombre, String apellido, String password, String
 * email, String numeroDocumento, Boolean admin) {
 * 
 * this.nombre = nombre; this.apellido = apellido; this.password = password;
 * this.email = email; <<<<<<< HEAD this.numeroDocumento = numeroDocumento;
 * this.unCarrito = new Carrito(this); // this.admin = admin; ======= //
 * this.numeroDocumento = numeroDocumento; // this.unCarrito = new
 * Carrito(this); this.admin = admin; >>>>>>>
 * 622e8cbf12d1165a51df454c14ecb06ddabb7750
 * 
 * }
 * 
 * 
 * public String getNombre() { return nombre; }
 * 
 * 
 * public void setNombre(String nombre) { this.nombre = nombre; }
 * 
 * 
 * public String getApellido() { return apellido; }
 * 
 * 
 * public void setApellido(String apellido) { this.apellido = apellido; }
 * 
 * 
 * public String getPassword() { return password; }
 * 
 * 
 * public void setPassword(String password) { this.password = password; }
 * 
 * 
 * //public String getNumeroDocumento() { // return numeroDocumento; //}
 * 
 * 
 * //public void setNumeroDocumento(String numeroDocumento) { //
 * this.numeroDocumento = numeroDocumento; //}
 * 
 * 
 * public Carrito getUnCarrito() { return unCarrito; }
 * 
 * 
 * public void setUnCarrito(Carrito unCarrito) { this.unCarrito = unCarrito; }
 * 
 * 
 * public String getEmail() { return email; }
 * 
 * 
 * public Integer getId() { return id; }
 * 
 * 
 * public void setId(Integer id) { this.id = id; } /*
 * 
 * public boolean isAdmin() { return admin; }
 * 
 * 
 * public void setAdmin(boolean admin) { this.admin = admin; }
 */
