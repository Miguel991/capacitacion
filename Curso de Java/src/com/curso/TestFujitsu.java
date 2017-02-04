package com.curso;

import java.util.ArrayList;
import java.util.List;

public class TestFujitsu {

	public static List<String> calcularAcronimos(ArrayList<String> listaLetras) {

		ArrayList<String> listaFinal = new ArrayList();

		for (int i = 0; i < listaLetras.size(); i++) {
			String letraActual = listaLetras.get(i);
			// copy of list
			ArrayList<String> listaSinLetraActual = new ArrayList<String>(listaLetras);
			listaSinLetraActual.remove(i);
			if (listaSinLetraActual.size() == 1) {
				listaFinal.add(letraActual + listaSinLetraActual.get(0));

			} else {
				ArrayList<String> letrasCombinadas = (ArrayList<String>) calcularAcronimos(listaSinLetraActual);
				for (String elemento : letrasCombinadas) {
					listaFinal.add(letraActual + elemento);
				}
			}

		}

		return listaFinal;
	}

	public static void main(String[] args) {
		ArrayList<String> listaLetras = new ArrayList<String>();
		listaLetras.add("a");
		listaLetras.add("b");
		listaLetras.add("c");
		listaLetras.add("d");
		listaLetras.add("e");
		listaLetras.add("f");
		listaLetras.add("g");
		listaLetras.add("h");

		for (String elemento : calcularAcronimos(listaLetras)) {
			System.out.println(elemento);
		}
	}
}
