package com.curso;

import java.awt.Point;;

public class Caja {

	int x1 = 0;
	int x2 = 0;
	int y1 = 0;
	int y2 = 0;

	Caja construirCaja(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;

		return this;
	}

	Caja construirCaja(Point x, Point y) {
		x1 = x.x;
		y1 = x.y;
		x2 = y.x;
		y2 = y.y;

		return this;

	}

	void imprimir() {
		System.out.println(x1 + " " + y1);
		System.out.println(x2 + " " + y2);
	}

	public static void main(String[] args) {
		Caja caja = new Caja();
		caja.construirCaja(new Point(10, 20), new Point(40, 50));
		caja.imprimir();
		caja.construirCaja(2, 4, 6, 8);
		caja.imprimir();

	}

}
