package com.ejercicios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class PersonaTest {
	
	Persona persona;
	
	@Before
	public void setUp(){
		persona = new Persona("Mario",18,'F');
	}

	@Test
	public void test() {
		System.out.println();
		System.out.println(persona);
		Assert.assertEquals(persona.esMayorDeEdad(), true);
		
	}

}
