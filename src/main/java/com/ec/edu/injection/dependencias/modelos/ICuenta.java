package com.ec.edu.injection.dependencias.modelos;

public interface ICuenta {

	//defino el contrato
	//lo que deben hacer las clases que implementen este contrato
	
	public void calcularDescuento(String numero); //firma del metodo
	public void calcularBeneficio();
}
