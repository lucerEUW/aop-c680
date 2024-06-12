package aopbeleg2;

public class Waldgrundstueck extends Grundstueck {

	public Waldgrundstueck(int id, Position position) {
		super(id, position);
	}
	
	public String getTyp() {
		return "Waldgrundstück";
	}
}
