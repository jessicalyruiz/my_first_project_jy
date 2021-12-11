package com.ec.edu.injection.dependencias.modelos;

public class GestorCuetas {
	//inyeccion de dependecicas
	//mediante interdaces
	//
	private ICuenta cuenta; //declaro la interfaz como atributo y 
	//en el constructor la paso como parametro y en ese parametro va a venir la "implementacion" de cuenta, ya sea ahorro o corriente
	
	
	public GestorCuetas(ICuenta cuenta) {
		super();
		this.cuenta = cuenta;
	}


	public void registrarCuentahabiente() {
		this.cuenta.calcularBeneficio();
		this.cuenta.calcularDescuento("883");
	}
}
