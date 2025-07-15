package ar.edu.unq.obj1.c2.claseBonus.ave;

import ar.edu.unq.obj1.c2.claseBonus.alimento.Alimento;

public class Gorrion extends Ave {
	
	private int energia = 30;
	
	public void comer(Alimento alimento) {
		energia += energia + alimento.energiaQueAporta() / 2;
	}
	
	@Override
	public void volar(int distancia) {
		super.volar(distancia);
		energia -= energia + 20 + 2 * distancia;
	}

	@Override
	protected boolean puedeVolar(int distancia) {
		return energia >= 200;
	}

}
