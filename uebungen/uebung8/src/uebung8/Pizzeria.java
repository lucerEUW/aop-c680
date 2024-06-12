package uebung8;

import java.util.Random;

public class Pizzeria extends Gaststaette {

	private String[] names = {"Pineapple's Paradise", "Runde Sachen", "Teig mir was du kannst", "Luigi D'Agustino", "BELAGerung", "La Mia Pizza", "Pizzburg", "Teigträumer"};
	private String name;
	
	public Pizzeria() {
		Random z = new Random();
		this.name = this.getClass().getSimpleName() + " " + names[z.nextInt(names.length)];
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
