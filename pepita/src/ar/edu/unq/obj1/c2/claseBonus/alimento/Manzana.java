package ar.edu.unq.obj1.c2.claseBonus.alimento;

public class Manzana implements Alimento {
	
	// Variables de Instancia
	private int madurez = 1;
	
	// Variables de Clase
	static final int BASE = 5;
	
	public Manzana() {
		
	}
	
	public Manzana(int madurez) {
		this.madurez = madurez; 
	}
	
	public int getMadurez() {
		return madurez;
	}

	public void setMadurez(int madurez) {
		this.madurez = madurez;
	}
	
	public void madurar() {
		this.setMadurez(madurez + 1);
	}
	
	@Override
	public int energiaQueAporta() {
		return Manzana.BASE * this.madurez;
	}
		
}
