package com.curso;

import java.awt.Point;

public class NombrePunto extends Point {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2206323943297209057L;
	String nombre;

	NombrePunto(int x, int y, String nombre) {
		super(x, y);// llamamos al construtor de la clase Point, debe ser llamado en la primera linea del constructor
		this.nombre = nombre;

	}
	public static void main(String[] args){
		
		NombrePunto np = new NombrePunto(1,1,"mario");
		System.out.println(np.x);
		System.out.println(np.y);
		System.out.println(np.nombre);

		
	}

}
