package com.ec.edu.dependencias;

public class Matricula {

	private String semestre;
	private int anio; //int: para poder operar con él
	private Estudiante estudiante;
	
	
	
	
	public String matricular(String nombre, String apellido, String calle, String numero) {
		this.estudiante=new Estudiante();
		this.estudiante.setApellido(apellido);
		this.estudiante.setNombre(nombre);
		
		Direccion direccion=new Direccion();
		direccion.setCallePrincipal(calle);
		direccion.setNumeracion(numero);
		this.estudiante.setDireccion(direccion);
		
		return "Estudiante guardado con exito";
		//logica para guardar los datos de la matricula y el estudiante
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Matricula [semestre=" + semestre + ", anio=" + anio + ", estudiante=" + estudiante + "]";
	}




	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}

	
	
}
