package com.ec.edu.injection.dependencias.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//llamo a la clase para poder usar el springboot
		ApplicationContext app=new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");//pasar como parametro la ruta del archivo beans
		//hay algunas formaS de llamar al bean
		Cuenta miCuenta=(Cuenta) app.getBean("cuenta");//parametro: name del bean
		//app.getBean(Cuenta.class);//parametro: nombre de la clase
		
		System.out.println(miCuenta.getNumero());
		System.out.println(miCuenta.getSaldo());
		
		
		Cuenta miCuenta1=(Cuenta) app.getBean("cuenta1");//parametro: name del bean
		
		System.out.println(miCuenta1.getNumero());
		System.out.println(miCuenta1.getSaldo());
		
		//IOC por contructor
		
//		Cuenta cuenta=new Cuenta("124", 4000) //codigo muy acoplado
		
		System.out.println("por contru**********");
		//IOC por contructor
		Estudiante estud=(Estudiante) app.getBean("est");
		System.out.println(estud.getNombre()+" "+estud.getApellido()+" edad:  " + estud.getEdad());
		
		
	}

}
