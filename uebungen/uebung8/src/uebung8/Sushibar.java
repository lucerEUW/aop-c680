package uebung8;

import java.util.Random;

public class Sushibar extends Gaststaette {

	private String[] names = {"Fugo", "Tokyo Hotel", "Sakura", "Bing Chilling", "Fukushima Inn", "Fish & Rice", "Rice Rice Baby", "Rice and Shine", "Dining and Shining", "Maki und Meer", "FantAsia", "Ente gut alles gut"};
	private String name;
	
	public Sushibar() {
		Random z = new Random();
		this.name = this.getClass().getSimpleName() + " " + names[z.nextInt(names.length)];
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
