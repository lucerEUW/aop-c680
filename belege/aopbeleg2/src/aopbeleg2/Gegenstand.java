package aopbeleg2;

public abstract class Gegenstand {

	private int id;
	private Position position;

	public Gegenstand(int id, Position position) {
		this.id = id;
		this.position = position;
	}

	public abstract String getTyp();
}
