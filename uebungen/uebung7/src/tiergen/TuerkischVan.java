package tiergen;

public class TuerkischVan extends Feloidea 
						implements Haustier {

	private String name;

	public TuerkischVan() {
		super();
		this.art = "Türkisch Van";
		this.futter = "Fisch";
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
