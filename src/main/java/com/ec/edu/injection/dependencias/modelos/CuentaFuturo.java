package com.ec.edu.injection.dependencias.modelos;

public class CuentaFuturo implements ICuenta{

	
	
	
	
	@Override
	public void calcularDescuento(String numero) {
		System.out.println("nuevo metodo");
	}

	@Override
	public void calcularBeneficio() {
		System.out.println("nuevo metodo beneficio");
	}

}
