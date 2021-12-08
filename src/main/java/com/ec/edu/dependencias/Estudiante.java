package com.ec.edu.dependencias;

public class Estudiante {

	protected String nombre;
	protected String apellido;
	protected Direccion direccion;
	
	private int tipo;
	
	public void pagarSerciPagos(String nombre,  int tipo) {
		System.out.println(nombre+" El estudiante realizo el pago");
		System.out.println(nombre+ " El estudiante presenta el pago");
		switch (tipo) {
		case 1:
			System.out.println("pago con tarjeta");
			break;
		case 2:
			System.out.println("pago efectivo");
			break;

		default:
			break;
		}
	}
	
	
	
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
	
	
}
