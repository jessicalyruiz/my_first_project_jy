package com.ec.edu.injection.dependencias.modelos;

public class CuentaCorriente implements ICuenta {

	private float montoMin;
	
	public void calcularDescuento(String numero) {
		System.out.println("calculando....corriente ");
	}


	public void calcularBeneficio() {
		System.out.println("calculando.... beneficio corriente ");
	}
	
	public float getMontoMin() {
		return montoMin;
	}

	public void setMontoMin(float montoMin) {
		this.montoMin = montoMin;
	}



	
	
	
}
