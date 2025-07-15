package ar.edu.unq.obj1.c2.claseBonus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.obj1.c2.claseBonus.alimento.Alpiste;
import ar.edu.unq.obj1.c2.claseBonus.ave.Golondrina;

public class GolondrinaTest  {
	
	private Golondrina pepita;
	
	
	@BeforeEach
	void setUp() {
		pepita = new Golondrina();
	}
	
	@Test
	void testGetEnergia() {
		
		assertEquals(100, pepita.getEnergia());
	}
	
	@Test
	void testVolar() {
		
		// Exercise
		pepita.volar(3);
		// Assert
		assertEquals(87, pepita.getEnergia());
		
	}
	
	@Test
	void testNoPuedeVolar() {
		
		// assertThrowsExeception({pepita.volar(5)})
		
		assertThrows(RuntimeException.class, () -> pepita.volar(1000));
		
	}
	
	@Test
	void testComerAlpiste() {
		
		Alpiste alpiste = new Alpiste();
		// Exercise
		pepita.comer(alpiste);
		// Assert
		assertEquals(120, pepita.getEnergia());
		
	}
	
	

	
	
	
	

}
