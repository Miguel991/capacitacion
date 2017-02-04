package com.curso;

public class Parent {

	public String concatenarFrases(String f1, String f2) {
		return f1 + f2;
	}

	public int calcularMultiplicacao(int fator1, int fator2) {
		return fator1 * fator2;
	}
}

class Child extends Parent {
	@Override
	public String concatenarFrases(String f1, String f2) {
		String cadena = f1 + " " + f2;
		return cadena;
	}

	@Override
	public int calcularMultiplicacao(int fator1, int fator2) {

		int resultado = fator1 * fator2;
		return resultado;
	}
}
