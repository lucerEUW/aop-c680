package aopbeleg2;

public class Wohngebaeude extends Gebaeude {

	public Wohngebaeude(int id, Position position) {
		super(id, position);
	}

	@Override
	public boolean hatBlitzableiter() {
		return true;
	}

	@Override
	public String getTyp() {
		return "Wohngebäude";
	}

}
