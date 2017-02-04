package com.curso;

import java.awt.Point;

public class Principal {

	public static void main(String[] args) {

		Point punto2D = new Point(12, 12);
		Punto3D punto3D = new Punto3D(12, 23, 34);

		System.out.println("Coordenadas del punto 2D: " + punto2D);
		System.out.println("Coordenadas del punto 3D: " + punto3D);
		punto3D.move(12, 12, 12);
		System.out.println("Coordenadas del punto 3D: " + punto3D.x + " " + punto3D.y + " " + punto3D.z);
		System.out.println(punto3D.toString());

	}

}
