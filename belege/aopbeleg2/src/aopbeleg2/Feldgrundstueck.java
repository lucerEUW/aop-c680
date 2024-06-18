package aopbeleg2;

public class Feldgrundstueck extends Grundstueck {

	public Feldgrundstueck(int id, Position position) {
		super(id, position);
	}

	public String getTyp() {
		return "Feldgrundstück";
	}
}
