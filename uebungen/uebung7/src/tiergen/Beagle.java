package tiergen;

public class Beagle extends Canoidea 
					implements Haustier {

	private String name;

	public Beagle() {
		super();
		this.art = "Beagle";
		this.futter = "Hundefutter";
	}

	@Override
	public void setName(String s) {
		this.name = s;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void streicheln() {
		System.out.println("..wird gestreichelt.");
		
	}
}
