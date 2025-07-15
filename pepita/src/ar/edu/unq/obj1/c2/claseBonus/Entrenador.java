package ar.edu.unq.obj1.c2.claseBonus;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unq.obj1.c2.claseBonus.alimento.Alimento;
import ar.edu.unq.obj1.c2.claseBonus.ave.Ave;

public class Entrenador {
	
	// const aves = []
	// const aves = #{}
	
	private Set<Ave> aves; 
	
	public Entrenador() {
		aves = new HashSet<Ave>();
	}
	
	public void agregarAve(Ave ave) {
		aves.add(ave);
	}
	
	public Set<Ave> getAves() {
		return aves;
	}

	public void alimentar(Alimento alimento) {
		
//		for(Ave ave: aves) {
//			ave.comer(alimento);
//		}
		
		aves.stream().forEach(ave ->  ave.comer(alimento));
		
	}
	
	public void volar(int distancia) {
		
//		for(Ave ave: aves) {
//			ave.comer(alimento);
//		}
		
		aves.stream().forEach(ave ->  ave.volar(distancia));
		
	}
	
	
	// Collection -> Interfaz
	// -- List -> Interfaz 
	// ---- ArrayList
	// ---- LinkedList
	// ---- Vector
	// ---- Stack
	// -- Set -> Interfaz
	// ---- HashSet
	// ---- TreeSet 
	
}



