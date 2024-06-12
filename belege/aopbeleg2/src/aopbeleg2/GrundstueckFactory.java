package aopbeleg2;

public class GrundstueckFactory extends GegenstandFactory {
	
	private static int nextId = 1000;

	@Override
	public Gegenstand createGegenstand(String typ, Position position) {
		switch (typ) {
			case "Waldgrundstück":
				return new Waldgrundstueck(nextId++, position);
			case "Wiesengrundstück":
				return new Wiesengrundstueck(nextId++, position);
			case "Feldgrundstück":
				return new Feldgrundstueck(nextId++, position);
			default:
				throw new IllegalArgumentException("Unbekannter Grundstück:" + typ);	
		}
	}
}
