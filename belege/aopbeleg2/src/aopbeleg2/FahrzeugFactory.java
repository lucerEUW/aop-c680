package aopbeleg2;

public class FahrzeugFactory extends GegenstandFactory {
	
	private static int nextId = 8000;

	@Override
	public Gegenstand createGegenstand(String typ, Position position) {
		switch (typ) {
			case "Traktor":
				return new Traktor(nextId++, position);
			case "Mähdrescher":
				return new Maehdrescher(nextId++, position);
			case "Transporter":
				return new Transporter(nextId++, position);
			default:
				throw new IllegalArgumentException("Unbekannter Fahrzeugtyp:" + typ);	
		}
	}
}
