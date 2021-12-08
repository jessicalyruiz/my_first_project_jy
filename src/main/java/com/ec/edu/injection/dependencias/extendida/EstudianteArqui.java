package com.ec.edu.injection.dependencias.extendida;

public class EstudianteArqui extends Estudiante {

	private String cosa;
	
	
	@Override
	public void pagarServiPagos(String nombre) {
		// TODO Auto-generated method stub
		super.pagarServiPagos(nombre);
		System.out.println("pagar PAyPal");
	}
}
