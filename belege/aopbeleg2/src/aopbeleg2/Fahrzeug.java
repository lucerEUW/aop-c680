package aopbeleg2;

public abstract class Fahrzeug extends Gegenstand {
	private boolean istNass;

	public Fahrzeug(int id, Position position) {
		super(id, position);
		this.istNass = false;
	}

	public void nassWerden() {
		this.istNass = true;
	}

	public boolean istNass() {
		return istNass;
	}
}
