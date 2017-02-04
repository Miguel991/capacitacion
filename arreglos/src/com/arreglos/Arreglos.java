package com.arreglos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Arreglos {
	
	public static void main (String[] args){
		
		int arreglo[] = new int[10];
		
		String salida = "indice\tValor\n";
		
		for (int contador = 0; contador < arreglo.length; contador++){
			salida += contador + "\t" + arreglo[contador] + "\n";
		}
		
		JTextArea areaSalida = new JTextArea();
		areaSalida.setText(salida);
		
		JOptionPane.showMessageDialog(null, areaSalida, "Inicialización de un arreglo de valores int"
				,JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	}

}
