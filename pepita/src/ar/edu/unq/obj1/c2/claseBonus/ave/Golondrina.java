package ar.edu.unq.obj1.c2.claseBonus.ave;

public class Golondrina extends Ave {
	
	private int energia = 100;
	
	@Override
	public void volar(int distancia) {
		super.volar(distancia);
		energia = energia - (distancia + 10);
	}
		
	@Override
	protected boolean puedeVolar(int distancia) {
		return energia >= this.energiaParaVolar(distancia);
		
	}

	private int energiaParaVolar(int distancia) {
		return distancia + 10;
	}


	
	
//	-- public
//	-- private
//	-- protected
//	-- default

}
