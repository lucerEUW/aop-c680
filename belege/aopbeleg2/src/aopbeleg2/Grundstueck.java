package aopbeleg2;

public class Grundstueck extends Gegenstand {

	public Grundstueck(int id, Position position) {
		super(id, position);
	}

	public String getTyp() {
		return "Grundstück";
	}
}
