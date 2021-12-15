package com.ec.edu.injection.dependencias.framework;

public class Cuenta {

	private String numero;
	private int saldo;
	
	//cuando no hay constructor no hacefalta poner el por defecto, pero cuando ya agrego uno q tenga parametros , 
	//debo agregar un contructor por defecto 
	public Cuenta() {
		
	}
	
	
	public Cuenta(String numero, int saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	
}
