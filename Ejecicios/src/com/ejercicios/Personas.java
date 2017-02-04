package com.ejercicios;

import java.util.Scanner;

public class Personas {
	
	private int edad;
	private String nombre;
	private String apellido;
	
	private static final int MAX_EDAD = 18;
	private static final int MAX_SOLICITUDES = 100;

	//Constructor//
	public Personas(int edad,String nombre,String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	// metodo para entrada de texto
	public String leerCadena(){
		
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}

	@Override
	public String toString() {
		return "Postulante [edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	

}
