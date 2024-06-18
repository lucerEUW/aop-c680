package aopbeleg2;

public class Stall extends Gebaeude {

	public Stall(int id, Position position) {
		super(id, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hatBlitzableiter() {
		return false;
	}

	@Override
	public String getTyp() {
		return "Stall";
	}
}
