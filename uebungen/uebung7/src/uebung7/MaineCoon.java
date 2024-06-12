package uebung7;

public class MaineCoon extends Feloidea
						implements Haustier {

	private String name;

	public MaineCoon() {
		super();
		this.art = "Maine Coon";
		this.futter = "Katzenfutter";
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
