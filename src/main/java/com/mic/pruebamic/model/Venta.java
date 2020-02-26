package com.mic.pruebamic.model;
import java.sql.Date;
import java.util.List;

public class Venta {
	
	private String codigoFactura;
    private Date fecha;
    private Double precioFinal;
    private List<Producto>Productos;
    private Usuario unUsuario;
	
    
    
    public Venta(String codigoFactura, Date fecha, Double precioFinal, List<Producto> productos, Usuario unUsuario) {
		
		this.codigoFactura = codigoFactura;
		this.fecha = fecha;
		this.precioFinal = precioFinal;
		Productos = productos;
		this.unUsuario = unUsuario;
	}
	public String getCodigoFactura() {
		return codigoFactura;
	}
	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinal(Double precioFinal) {
		this.precioFinal = precioFinal;
	}
	public List<Producto> getProductos() {
		return Productos;
	}
	public void setProductos(List<Producto> productos) {
		Productos = productos;
	}
	public Usuario getUnUsuario() {
		return unUsuario;
	}
	public void setUnUsuario(Usuario unUsuario) {
		this.unUsuario = unUsuario;
	}
    
    
    
    }


  