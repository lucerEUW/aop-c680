package tiergen;

public class Bernhardiner extends Canoidea 
						  implements Haustier {

	private String name;

	public Bernhardiner() {
		super();
		this.art = "Bernhardiner";
		this.futter = "Hundefutter, Cognac";
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
