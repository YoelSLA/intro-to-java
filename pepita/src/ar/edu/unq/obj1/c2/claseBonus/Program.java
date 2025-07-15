package ar.edu.unq.obj1.c2.claseBonus;

import ar.edu.unq.obj1.c2.claseBonus.ave.Golondrina;

public class Program {
	
	public static void main(String[] args) {
		System.out.println("Hello Word.");
		
		Roque roque = Roque.getInstance();
				
		Golondrina pepita = new Golondrina();
		
		System.out.println("La energia de pepita es:" + pepita.getEnergia());
	}

}
