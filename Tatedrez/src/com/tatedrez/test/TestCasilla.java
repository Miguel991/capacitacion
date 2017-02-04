package com.tatedrez.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.tatedrez.Casilla;
import com.tatedrez.Torre;

public class TestCasilla {

	private Torre torre;
	private Casilla casilla;

	@Before
	public void setup() {
		torre = new Torre();
		casilla = new Casilla();
		casilla.setNombre("sur");
	}

	@Test
	public void testInsertarFichaEnCasilla() {
		casilla.setFicha(torre);
		System.out.println();
		Assert.assertEquals(casilla.getFicha().getNombre(), "Torre");

	}
	@Test
	public void testCasillaVacia() {
		casilla.setFicha(torre);
		
		Assert.assertEquals(casilla.estaVacia(), false);

	}

}
