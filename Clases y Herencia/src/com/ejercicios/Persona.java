package com.ejercicios;

public class Persona {

	private String nombre = "";
	private int edad = 0;
	private int DNI = 0;
	private char sexo = 'H';
	private int peso = 80;
	private int altura = 180;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPeso(){
		return this.peso;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getAltura(){
		return this.altura;
	}

	public Persona() {
		this.DNI = generaDni();

	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI = generaDni();
	}

	public Persona(String nombre, int edad, char sexo, int DNI, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI = DNI;
		this.peso = peso;
		this.altura = altura;
		this.DNI = generaDni();

	}
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = (int) peso;
		this.altura = (int) altura;
		this.DNI = generaDni();

	}

	public int calcularImc(int peso, int altura) {

		double imc = peso / Math.pow(altura, 2);
		if (imc < 20) {
			return -1;
		}
		if (imc > 25) {
			return 1;
		}
		if (imc >= 20 && imc <= 25) {
			return 0;
		}

		return 0;
	}

	public boolean esMayorDeEdad() {
		if (edad >= 18) {
			return true;
		}

		return false;
//return edad >= 18;
	}

	private void comprobarSexo(char sexo) {

		if (sexo != 'H' || sexo != 'F') {
			this.sexo = 'H';
		}else{this.sexo = sexo;}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	private int generaDni() {
		int numeroDni = (int) (Math.random() * 50000000 + 1);
		return numeroDni;
	}

}
