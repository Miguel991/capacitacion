package com.ejercicios;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaTest extends JFrame {
	
	public VentanaTest(){
		super("Titulo");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contenedor = getContentPane();
		contenedor.setLayout(new FlowLayout());
		GridLayout gl = new GridLayout(4,3);
		gl.setHgap(5);
		gl.setVgap(5);
		JButton boton = new JButton("Boton");
		JLabel etiqueta = new JLabel("Nombre: ");
		JTextField texto = new JTextField(20);
		contenedor.add(boton);
		contenedor.add(etiqueta);
		contenedor.add(texto);

	}

	public static void main(String[] args) {

		VentanaTest ventana = new VentanaTest();
		ventana.setVisible(true);

	}

}
