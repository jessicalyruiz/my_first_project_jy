package com.ec.edu.dependencias;

import java.util.Scanner;

public class MainUCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Ingrese el nombre");
		String nombre=in.nextLine();
		
		System.out.println("Ingrese el apellido");
		String apellido=in.nextLine();
		
		System.out.println("Ingrese el calle principal");
		String calle=in.nextLine();
		
		System.out.println("Ingrese el numero");
		String numero=in.nextLine();
		
		Matricula matricula = new Matricula();
		matricula.setAnio(2018);
		matricula.setSemestre("sexto");
		String mensaje = matricula.matricular(nombre, apellido, calle, numero);
		System.out.println(matricula.getEstudiante());
		System.out.println(mensaje);
		
		//para probar
		System.out.println("matricula");
		System.out.println(matricula.toString());
	}

}
