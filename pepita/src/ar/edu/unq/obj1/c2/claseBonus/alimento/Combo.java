package ar.edu.unq.obj1.c2.claseBonus.alimento;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Alimento {
	
	private List<Alimento> alimentos;
	
	public Combo() {
		alimentos = new ArrayList<>();
	}
	
	@Override
	public int energiaQueAporta() {

//		int energiaHastaAhora = 0;
//		for(Alimento alimento : alimentos) {
//			energiaHastaAhora += alimento.energiaQueAporta();
//		}
//		return energiaHastaAhora;
		
		return alimentos.stream()
				.mapToInt(a -> a.energiaQueAporta())
				.sum();
	}
	
	public List<Alimento> alimentosQueAportanMasDe(int cantidad) {
		return alimentos.stream()
				.filter(e -> e.energiaQueAporta() > cantidad)
				.toList();
	}
	
	public boolean hayAlgunoQueAportanMasDe(int cantidad) {
		return alimentos.stream()
				.anyMatch(e -> e.energiaQueAporta() > cantidad);
	}
	
	public boolean todosAportanMasDe(int cantidad) {
		return alimentos.stream()
				.allMatch(e -> e.energiaQueAporta() > cantidad);
	}

}



