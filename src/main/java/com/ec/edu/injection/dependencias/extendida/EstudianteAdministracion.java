package com.ec.edu.injection.dependencias.extendida;

public class EstudianteAdministracion extends Estudiante{

	private String codigoSRI;
	
	@Override
	public void pagarServiPagos(String nombre) {
		// TODO Auto-generated method stub
		super.pagarServiPagos(nombre);
		System.out.println("pagar Ventanilla");
	}
}
