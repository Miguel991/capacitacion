package com.arreglos;

import javax.swing.JOptionPane;

public class SumarArreglos {

	public static void main(String[] args) {
		int arreglo[] = {0,1,2,3,4,5,6,7,8,9};
		int total = 0;
		
		for (int contador = 0; contador < arreglo.length; contador++ ){
			total += arreglo[contador];
		}
		
		JOptionPane.showMessageDialog(null, "Total de elementos del arreglo " + total
				,"Sumar los elementos de un arreglo",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	}

}