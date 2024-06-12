package aopbeleg2;

public class Transporter extends Fahrzeug {

	public Transporter(int id, Position position) {
		super(id, position);
	}

	@Override
	public String getTyp() {
		return "Transporter";
	}

}
