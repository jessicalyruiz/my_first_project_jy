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
		}else if(tipo==4) {
			cuenta=new ICuenta() {

				public void calcularDescuento(String numero) {
					// TODO Auto-generated method stub
					System.out.println("***Calculando descuento de cuenta clase anonima");
				}

				public void calcularBeneficio() {
					// TODO Auto-generated method stub
					System.out.println("***beneficio clase anonima");
				}
				
			};
		}
		
		GestorCuetas gestor =new GestorCuetas(cuenta);
		gestor.registrarCuentahabiente();
	}
	

}
