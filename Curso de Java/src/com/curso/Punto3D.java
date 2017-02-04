package com.curso;

import java.awt.Point;

//creamos la clase que hereda de Point 
public class Punto3D extends Point {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int z;

	// creamos el constructor
	public Punto3D(int x, int y, int z) {
		super(x, y);// utilizamos las variables x, y de la super clase Point
		Punto3D.z = z; // con la palabra this hacemos referencia a la variable de
					// la
					// clase misma
	}

	public void move(int x, int y, int z) {
		Punto3D.z = z;
		super.move(x, y);// sobrescribimos el metodo move de la super clase
							// Point y usamos sus variables ya definidas
							// y le agregamos la cordenada z ya que la super
							// clase Point solo es 2D
	}

	public void translate(int x, int y, int z) {
		Punto3D.z = z;
		super.translate(x, y);
	}

	public static int getZ() {
		return Punto3D.z;
	}

	public static void setZ(int z) {
		Punto3D.z = z;
	}
	
    @Override
	public String toString() {
		return "[X=" + super.x + "," + "Y=" + super.y + "," + "Z=" + Punto3D.z + "]";
	}

}
