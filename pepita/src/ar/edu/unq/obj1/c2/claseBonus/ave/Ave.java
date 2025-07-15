package ar.edu.unq.obj1.c2.claseBonus.ave;

import ar.edu.unq.obj1.c2.claseBonus.alimento.Alimento;

public abstract class Ave {
	
	private int energia;
	
	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	// TEMPLED METHOD
	protected final void validarVolar(int distancia) {
		if(!puedeVolar(distancia)) {
			throw new RuntimeException("El ave no puede volar.");
		}
	}

	protected abstract boolean puedeVolar(int distancia);
	
	public void volar(int distancia) {
		this.validarVolar(distancia);
	}
	
	public void comer(Alimento alimento) {
		energia = energia + alimento.energiaQueAporta();
	}
	
	

}
