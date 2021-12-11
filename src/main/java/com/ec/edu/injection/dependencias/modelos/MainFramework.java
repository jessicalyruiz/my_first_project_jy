package com.ec.edu.injection.dependencias.modelos;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese tipo");
		int tipo=in.nextInt();
		ICuenta cuenta=null;
		if(tipo==1) {
			cuenta=new CuentaCorriente();
		}else if(tipo==2) {
			cuenta= new CuentaAhorro();
		}else if(tipo==3) {
			cuenta=new CuentaFuturo();
		}
		
		GestorCuetas gestor =new GestorCuetas(cuenta);
		gestor.registrarCuentahabiente();
	}
	

}
