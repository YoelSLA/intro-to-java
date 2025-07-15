package ar.edu.unq.obj1.c2.claseBonus;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unq.obj1.c2.claseBonus.ave.Ave;

// SINGLETON
public class Roque {
	
	// const aves = []
	// const aves = #{}
	
	private Set<Ave> aves; 
	private static Roque instance;
	
	public Roque() {
		aves = new HashSet<Ave>();
	}
	
	public void agregarAve(Ave ave) {
		aves.add(ave);
	}
	
	public Set<Ave> getAves() {
		return aves;
	}
	
	public static Roque getInstance() {
		if (instance == null) {
			instance = new Roque();
		}
		return instance;
		
	}
}
