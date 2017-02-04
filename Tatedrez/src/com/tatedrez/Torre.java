package com.tatedrez;

import java.awt.List;

public class Torre implements Ficha {

	private String nombre = "Torre";
	

	private PosicionesEnum posicion ;	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean mover() {

		return false;
	}

	@Override
	public void setPosicion(PosicionesEnum posicion) {
	this.posicion = posicion;

	}

}
