package ar.edu.unq.obj1.c2.claseBonus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.obj1.c2.claseBonus.alimento.Manzana;
import ar.edu.unq.obj1.c2.claseBonus.alimento.ManzanaVerde;

public class ManzanaTest {
	
	private Manzana manzana;
	private ManzanaVerde manzanaVerde;
	
	@BeforeEach
	void setUp() {
		manzana = new Manzana();
		manzanaVerde = new ManzanaVerde(5);
		
	}
	
	@Test
	void testEnergiaQueAporta() {
		
		assertEquals(5, manzana.energiaQueAporta());
	}
	
	@Test
	void testEnergiaQueAportaMazanaVerde() {
		
		assertEquals(12, manzanaVerde.energiaQueAporta());
	}
	
	

}
