package com.curso;

public class ListarRango {

	int[] crearRango(int inferior, int superior) {
		int[] rango = new int[(superior - inferior) + 1];
		for (int i = 0; i < rango.length; i++) {
			rango[i] = inferior++;
		}
		return rango;
	}

	public static void main(String[] args) {

		int[] rango;
		ListarRango listar = new ListarRango();
		rango = listar.crearRango(10, 20);

		for (int i = 0; i < rango.length; i++) {
			System.out.print(rango[i]+" ");
		}

	}

}
