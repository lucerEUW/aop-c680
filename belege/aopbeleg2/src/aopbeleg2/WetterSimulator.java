package aopbeleg2;

public class WetterSimulator {
	private Spielraster raster;

	public WetterSimulator(Spielraster raster) {
		this.raster = raster;
	}

	public void regnenLassen() {
		System.out.println("Es regnet...");
		for (int y = 1; y <= 5; y++) {
			for (char x = 'A'; x <= 'E'; x++) {
				Gegenstand gegenstand = raster.getGegenstand(x, y);
				if (gegenstand instanceof Fahrzeug) {
					Fahrzeug nassZuWerden = (Fahrzeug) gegenstand;
					nassZuWerden.nassWerden();
					System.out.println(nassZuWerden.getTyp() + " an Position " + x + y + " ist nass geworden.");
				}
			}
		}
	}

	public void gewitternLassen() {
		boolean getroffen = false;
		while (!getroffen) {
			for (int y = 1; y <= 5; y++) {
				for (char x = 'A'; x <= 'E'; x++) {
					Gegenstand gegenstand = raster.getGegenstand(x, y);
					if (((gegenstand instanceof Gebaeude && ((Gebaeude) gegenstand).hatBlitzableiter() == false) || gegenstand instanceof Felsen) && Math.random() < 0.05) {
						System.out
								.println(gegenstand.getTyp() + " an Position " + x + y + " wurde vom Blitz getroffen.");
						getroffen = true;
						break;
					}
				}
				if (getroffen) {
					break;
				}
			}
		}
	}
}
