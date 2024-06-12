package aopbeleg2;

public class Wiesengrundstueck extends Grundstueck {

	public Wiesengrundstueck(int id, Position position) {
		super(id, position);
	}
	
	public String getTyp() {
		return "Weisengrundstück";
	}
}
