package com.ec.edu.injection.dependencias.modelos;

public class CuentaAhorro implements ICuenta{
	private String numAhorro;
	private int monto;
	
	
		@Override
	public void calcularDescuento(String numero) {
		System.out.println("Se calcula el descueto de: "+ numero);
	}
	@Override
	public void calcularBeneficio() {
		System.out.println("Se calcula el beneficio...");
	}
	
	
	public String getNumAhorro() {
		return numAhorro;
	}
	public void setNumAhorro(String numAhorro) {
		this.numAhorro = numAhorro;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}

	
	
	
}
