package com.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ArrayList<Personas> listaDePersonas = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		while (true) {
			System.out.println("Bienvenido a mi aplicación, seleccione una de la siguientes opciones");
			System.out.println("Opcion 1: Agregar postulante:");
			System.out.println("Opcion 2: Imprimir lista postulantes");
			System.out.println("Opcion 3: Salir");
			int texto = entrada.nextInt();
			if (texto == 1) {
				System.out.println("Registrar postulante");
				System.out.println("1)Ingrese el nombre del postulante: ");
				String nombre = entrada.next();
				System.out.println("2)Ingrese el apellido: ");
				String apellido = entrada.next();
				System.out.println("3)Ingrese la Edad: ");
				int edad = entrada.nextInt();
				Personas unaPersona = new Personas(edad, nombre, apellido);
				listaDePersonas.add(unaPersona);
				System.out.println("Se ingreso correctamente el postulante/t");

			} else if (texto == 2) {
				System.out.println(listaDePersonas);

			} else if (texto == 3) {
				System.exit(0);
			}
		}

		// Personas[] personaArray = new Personas[10];

		// personasArray[0] = mario.leerCadena();

		// Scanner entrada = new Scanner(System.in);
		// String entradaTeclado = "";
		// entradaTeclado = entrada.nextLine();
		//
		// {//los objetos se tienen que llenar atraves del escanner
		// Personas mario = new Personas(12, "mario", "contreras");
		// System.out.println("Registro de Postulantes:");
		//
		// while(true){
		//
		// System.out.println("1)Ingrese el nombre del postulante: ");
		// String nombre = "";
		//
		// System.out.println("2)Ingrese el apellido: ");
		// entradaTeclado = entrada.nextLine();
		// System.out.println("3)Ingrese la edad: ");
		// entradaTeclado = entrada.nextLine();
		//
		//
		// }

		// }

	}

}