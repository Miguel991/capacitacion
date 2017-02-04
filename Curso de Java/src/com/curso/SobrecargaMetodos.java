package com.curso;

public class SobrecargaMetodos {

	public SobrecargaMetodos(int numero, int numero1) {

		int var = numero;
		int var2 = numero1;

	}
	
	SobrecargaMetodos nuevo(){// METODO DE CLASE 
		
		return null;
		
	}

	public SobrecargaMetodos(int numero, double numero1) { //CONSTRUCTOR

		int var = numero;
		int var2 = (int) numero1; // uso de casting para poder asignar un doble
									// a un integer

	}

	public SobrecargaMetodos(String hola) { //CONSTRUCTOR

		String a = hola;

	}

	public SobrecargaMetodos(String a, String b) { //CONSTRUCTOR
	}

	public SobrecargaMetodos(boolean a, boolean b) {
	}

	public SobrecargaMetodos(char a, char b) {
	}

	public SobrecargaMetodos(float a, float b) {
	}

	public SobrecargaMetodos(double a) {
	}

	public SobrecargaMetodos(double a, double b) {
	}

}
