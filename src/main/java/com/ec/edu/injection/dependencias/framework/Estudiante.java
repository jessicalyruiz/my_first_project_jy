package com.ec.edu.injection.dependencias.framework;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String edad;
	
	
	public Estudiante() {
		
	}
	
	
	
	
	public Estudiante(String nombre, String apellido, String edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	///getters y setters
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
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	
	
}
