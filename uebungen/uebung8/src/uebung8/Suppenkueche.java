package uebung8;

import java.util.Random;

public class Suppenkueche extends Gaststaette {

	private String[] names = {"Suppenkaspar", "Soup Hero", "Sup Sup Hurra", "Michels", "Heiß und gut", "Suppa Sumarum", "Die gute Nudel"};
	private String name;
	
	public Suppenkueche() {
		Random z = new Random();
		this.name = this.getClass().getSimpleName() + " " + names[z.nextInt(names.length)];
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
