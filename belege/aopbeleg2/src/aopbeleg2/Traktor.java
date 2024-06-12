package aopbeleg2;

public class Traktor extends Fahrzeug {

	public Traktor(int id, Position position) {
		super(id, position);
	}

	@Override
	public String getTyp() {
		return "Traktor";
	}
}
