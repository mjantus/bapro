package com.mic.pruebamic.model;
import java.sql.Date;
import java.util.List;

public class Venta {
	
	private String metodoPago;
    private Date fecha;
    private Double precioFinal;
    private List<Producto>Productos;
    private Usuario usuario;
    
    public Venta(String metodoPago, Date fecha, Double precioFinal) {
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.precioFinal = precioFinal;
    }


    public String getMetodoPago() {
		return metodoPago;
	
    }

    public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	
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
   
    public Usuario getUsuario() {
    	return usuario;
	
    }

    public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}




}
