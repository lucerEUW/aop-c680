package aopbeleg2;

public abstract class Gebaeude extends Gegenstand {
	
	public Gebaeude (int id, Position position) {
		super(id, position);
	}
	
	public abstract boolean hatBlitzableiter();
}
