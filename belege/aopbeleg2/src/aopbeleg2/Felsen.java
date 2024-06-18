package aopbeleg2;

public class Felsen extends Gebaeude {

	public Felsen(int id, Position position) {
		super(id, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hatBlitzableiter() {
		return false;
	}

	@Override
	public String getTyp() {
		return "Felsen";
	}
}
