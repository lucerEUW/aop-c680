package uebung8;

import java.util.Random;

public class Wurstbude extends Gaststaette {

	private String[] names = {"Ingolfs Bierchen", "Der lange Hans", "Wurst Case", "Melanies Mettwurst", "Holgers Inn", "Um die Wurst", "Heikos Grillecke", "Heidis Bierbar", "Truckstop"};
	private String name;
	
	public Wurstbude() {
		Random z = new Random();
		this.name = this.getClass().getSimpleName() + " " + names[z.nextInt(names.length)];
	}

	@Override
	public String getName() {
		return this.name;
	}

}
