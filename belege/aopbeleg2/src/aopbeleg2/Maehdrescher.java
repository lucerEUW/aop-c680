package aopbeleg2;

public class Maehdrescher extends Fahrzeug {

	public Maehdrescher(int id, Position position) {
		super(id, position);
	}

	@Override
	public String getTyp() {
		return "Mähdrescher";
	}

}
