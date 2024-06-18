package aopbeleg2;

public class Felsen extends Fahrzeug {
	private boolean istNass;
	
	public Felsen(int id, Position position) {
		super(id, position);
		this.istNass = false;
		// TODO Auto-generated constructor stub
	}

	public void nassWerden() {
		this.istNass = true;
	}

	public boolean istNass() {
		return istNass;
	}

	@Override
	public String getTyp() {
		return "Felsen";
	}
}
