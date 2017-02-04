package com.curso;

public class Circulo {

	int x, y, radio;

	Circulo(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		resultado();

	}

	Circulo(int puntoX, int puntoY) {
		this(puntoX, puntoY, 5); // permite la comunicacion con el otro
		resultado(); // constructor
	}

	void resultado() {
		int resultado = x * y * radio;
		System.out.println(resultado + this.getClass().getName());
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Circulo nuevo = new Circulo(1, 2, 4);
		Circulo nuevo1 = new Circulo(2, 2);
		

	}

}
