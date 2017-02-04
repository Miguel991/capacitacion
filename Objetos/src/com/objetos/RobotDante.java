package com.objetos;

public class RobotDante {

	String estatus;
	int velocidad;
	float temperatura;

	public void comprobarTemperatura() {
		if (temperatura > 440) {
			estatus = "Volviendo a casa";
			velocidad = 5;
		}
	}

	public void mostrarAtributos() {
		System.out.println("Estatus " + estatus);
		System.out.println("Velocidad " + velocidad);
		System.out.println("Temperatura " + temperatura);
	}
}
