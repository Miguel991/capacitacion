package com.curso;

public class Imprimir {

	int x = 0;
	int y = 1;

	void imprimir() {
		
		System.out.println("soy una instancia de la clase " + this.getClass().getName());
		System.out.println("[x=" + this.x + " y=" + this.y + "]");
	}

}

class SubImprimir extends Imprimir {

	int z = 3;

	void imprimir() {
		
		System.out.println("soy una instancia de la clase " + this.getClass().getName());
		System.out.println("[x=" + x + " y=" + y + " z=" + z + "]");
	}

	public static void main(String[] args) {

		SubImprimir objeto = new SubImprimir();
		Imprimir objeto1 = new Imprimir();
		objeto.imprimir();
		objeto1.imprimir();
	}
}
