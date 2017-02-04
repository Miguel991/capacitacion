package com.ejercicios;

import javax.swing.JOptionPane;

public class PersonaMain {
	
	public static void main(String[] args){
		
		String nombre=JOptionPane.showInputDialog("Introduce el nombre");
		
		String texto = JOptionPane.showInputDialog("_Introduce la edad: ");
		int edad = Integer.parseInt(texto);
		
		texto= JOptionPane.showInputDialog("Introduce el sexo: ");
		char sexo = texto.charAt(0);
		
	    texto = JOptionPane.showInputDialog("Introdusca su peso: ");
		int peso = Integer.parseInt(texto);
		
		
		
	}

}
