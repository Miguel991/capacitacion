package com.curso;

public class ComprobarScope {
	static int x = 12; // variable de clase

	int test = 10;// variable de instacia

	void imprimirTest() {

		int test = 20; /* variable de metodo solo visible dentro del metodo*/
		System.out.println("Test: " + this.test);
		System.out.println("variable local: " + test);
	}

	public static void main(String[] args) {

		ComprobarScope instancia = new ComprobarScope();
		instancia.imprimirTest();
	}

}
