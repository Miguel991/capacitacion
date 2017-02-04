package com.objetos;

public class AplicacionRobot {
	// cuando usamos la palabra static le estamos diciendo a la clase que es un
	// metodo de clase
	// y es compartido por todos los objetos

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RobotDante robot = new RobotDante();
		robot.temperatura = 510;
		robot.estatus = "Explorando";
		robot.velocidad = 2;

		robot.mostrarAtributos();
		robot.comprobarTemperatura();
		robot.mostrarAtributos();

	}

}
