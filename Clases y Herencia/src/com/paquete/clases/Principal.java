package com.paquete.clases;

public class Principal extends ClaseA {

	public static void main(String[] args) {

		ClaseC instanciaC = new ClaseC();
		ClaseB instanciaB = new ClaseB();

		System.out.println(instanciaC.A1);
		System.out.println(instanciaB.A1);

	}

}
