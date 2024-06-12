package uebung8;

import java.util.Random;

public abstract class Gaststaette implements Eatable {

	public abstract String getName(); 
	
	protected static Eatable erzeugeGaststaette() {
		
		Random zufall = new Random();
		
		switch (zufall.nextInt(4)) { //4 verschiedene Unterklassen
		case 0:
			return new Suppenkueche();
		case 1:
			return new Wurstbude();
		case 2:
			return new Sushibar();
		case 3:
			return new Pizzeria();
		default:
			return null;
		}
	}

}
