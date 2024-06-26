package aopbeleg2;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Spielraster raster = new Spielraster();
		Fachabteilung gebäudeFactory = new Bauinnung();
		Fachabteilung fahrzeugFactory = new Landmaschinenhandel();
		Fachabteilung grundstückFactory = new Landwirtschaftsverband();

		Random random = new Random();
		char[] buchstaben = { 'A', 'B', 'C', 'D', 'E' };
		int[] zahlen = { 1, 2, 3, 4, 5 };

		int anzahlGebäude = 7;
		int anzahlGrundstücke = 7;
		int anzahlFahrzeuge = 7;

		raster.platziereGegenstand(gebäudeFactory.createGegenstand("Felsen", new Position('C', 3)), 'C', 3);

		for (int i = 0; i < anzahlGebäude; i++) {
			platziereGegenstandZufaellig(raster, gebäudeFactory,
					new String[] { "Wohngebäude", "Stall", "Wirtschaftsgebäude" }, buchstaben, zahlen, random);
		}

		for (int i = 0; i < anzahlFahrzeuge; i++) {
			platziereGegenstandZufaellig(raster, fahrzeugFactory,
					new String[] { "Traktor", "Mähdrescher", "Transporter" }, buchstaben, zahlen, random);
		}

		for (int i = 0; i < anzahlGrundstücke; i++) {
			platziereGegenstandZufaellig(raster, grundstückFactory,
					new String[] { "Waldgrundstück", "Wiesengrundstück", "Feldgrundstück" }, buchstaben, zahlen,
					random);
		}

		raster.zeigeRaster();

		WetterSimulator wetterSimulator = new WetterSimulator(raster);
		wetterSimulator.regnenLassen();
		wetterSimulator.gewitternLassen();
	}

	private static void platziereGegenstandZufaellig(Spielraster raster, Fachabteilung factory, String[] typen,
			char[] buchstaben, int[] zahlen, Random random) {
		boolean platziert = false;
		while (!platziert) {
			char zufallsBuchstabe = buchstaben[random.nextInt(buchstaben.length)];
			int zufallsZahl = zahlen[random.nextInt(zahlen.length)];

			try {
				Gegenstand gegenstand = factory.createGegenstand(typen[random.nextInt(typen.length)],
						new Position(zufallsBuchstabe, zufallsZahl));
				raster.platziereGegenstand(gegenstand, zufallsBuchstabe, zufallsZahl);
				platziert = true;
			} catch (IllegalArgumentException e) {
			}
		}
	}
}