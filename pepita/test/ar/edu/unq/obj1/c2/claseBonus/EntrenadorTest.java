package ar.edu.unq.obj1.c2.claseBonus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.obj1.c2.claseBonus.alimento.Alpiste;
import ar.edu.unq.obj1.c2.claseBonus.ave.Golondrina;
import ar.edu.unq.obj1.c2.claseBonus.ave.Gorrion;

public class EntrenadorTest {
	
	private Entrenador roque;
	private Golondrina pepita;
	private Gorrion pepon;
	
	@BeforeEach 
	void setUp() {
		roque = new Entrenador();
		pepita = new Golondrina();
		pepon = new Gorrion();
	}
	
	@Test
	void testEntrenadorAlimentaASusAves() {
		
		// SetUp
		roque.agregarAve(pepita);
		roque.agregarAve(pepon);
		
		// Exercise
		roque.alimentar(new Alpiste()); 
		
		// Assert
		assertEquals(20, pepita.getEnergia());
		assertEquals(0, pepon.getEnergia());
		
	}

}
