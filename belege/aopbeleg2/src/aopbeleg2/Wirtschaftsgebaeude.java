package aopbeleg2;

public class Wirtschaftsgebaeude extends Gebaeude {

	public Wirtschaftsgebaeude(int id, Position position) {
		super(id, position);
	}

	@Override
	public boolean hatBlitzableiter() {
		return true;
	}

	@Override
	public String getTyp() {
		return "Wirtschaftsgebäude";
	}

}
