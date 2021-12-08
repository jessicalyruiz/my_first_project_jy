package com.ec.edu.injection.dependencias.extendida;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		Estudiante estudiante;
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
		System.out.println("Ingrese el tipo de estudiante");
		int tipo=in.nextInt();
		
		switch (tipo) {
		case 1:
			estudiante= new Estudiante();
			break;
		case 2:
			estudiante= new EstudianteOdonto();
			System.out.println("Estudiante Odonto");
			break;
		case 3:
			System.out.println("Estudiante Arqui");
			estudiante= new EstudianteArqui();
			break;
		case 4:
			estudiante= new EstudianteArqui();
			break;
		case 5:
			estudiante= new EstudianteOdonto();
			break;

		default:
			estudiante= new Estudiante();
			break;
		}
		
		Matricula matricula = new Matricula(estudiante, new Direccion());
		matricula.setAnio(2018);
		matricula.setSemestre("sexto");
		String mensaje = matricula.matricular(nombre, apellido, calle, numero);
		System.out.println(mensaje);
		
	
		
	}

}
