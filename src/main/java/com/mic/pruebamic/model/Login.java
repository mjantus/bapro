package com.mic.pruebamic.model;

public class Login {
	
	private String usuario;
	private String pasword;
	
	
	
	
	public Login() {
		
	}
	public Login(String usuario, String pasword) {
		
		this.usuario = usuario;
		this.pasword = pasword;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	

}
