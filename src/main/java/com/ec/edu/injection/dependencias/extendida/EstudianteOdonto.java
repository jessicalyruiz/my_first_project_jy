package com.ec.edu.injection.dependencias.extendida;

public class EstudianteOdonto extends Estudiante{

	private String ciudadRural;
	
	@Override
	public void pagarServiPagos(String nombre) {
		// TODO Auto-generated method stub
		super.pagarServiPagos(nombre);
		System.out.println("pagar Tarjeta");
	}
}
