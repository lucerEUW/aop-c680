package aopbeleg2;

public class GebaeudeFactory extends GegenstandFactory {
	
	private static int nextId = 5000;

	@Override
	public Gegenstand createGegenstand(String typ, Position position) {
		switch (typ) {
			case "Wohngebäude":
				return new Wohngebaeude(nextId++, position);
			case "Stall":
				return new Stall(nextId++, position);
			case "Wirtschaftsgebäude":
				return new Wirtschaftsgebaeude(nextId++, position);
			default:
				throw new IllegalArgumentException("Unbekannter Gebaeudetyp:" + typ);	
		}
	}
}
