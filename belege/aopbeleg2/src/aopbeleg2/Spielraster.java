package aopbeleg2;

public class Spielraster {

	private static final int SIZE = 5;
	private Gegenstand[][] raster1 = new Gegenstand[SIZE][SIZE];
	private Gegenstand[][] raster2 = new Gegenstand[SIZE][SIZE]; // raster fuer Fahrzeuge

	public void platziereGegenstand(Gegenstand gegenstand, char x, int y) {

		int ix = x - 'A';
		int iy = y - 1;

		if (ix < 0 || ix >= SIZE || iy >= SIZE) {
			throw new IllegalArgumentException("Ungültige Position: " + x + y);
		}

		if (raster1[ix][iy] != null) {
			if (raster1[ix][iy] instanceof Gebaeude && !(raster1[ix][iy] instanceof Felsen)
					&& gegenstand instanceof Fahrzeug) {
				raster2[ix][iy] = gegenstand;
			} else {
				throw new IllegalArgumentException("Feld bereits belegt: " + x + y);
			}
		} else {
			raster1[ix][iy] = gegenstand;
		}
	}

	public Gegenstand getGegenstand(char x, int y) {

		int ix = x - 'A';
		int iy = y - 1;

		if (ix < 0 || ix >= SIZE || iy >= SIZE) {
			throw new IllegalArgumentException("Ungültige Position: " + x + y);
		}
		return raster1[ix][iy];
	}

	public void zeigeRaster() {
		System.out.println(
				"===========================================================================================================================================================================================");
		System.out.println(String.format("  %-40s %-40s %-40s %-40s %-40s", "A", "B", "C", "D", "E"));

		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				if (raster1[x][y] == null) {
					System.out.print(String.format("%-40s", "Leer"));
				} else if (raster1[x][y] != null && raster2[x][y] != null) {
					System.out.print(String.format("%-40s", raster1[x][y].getTyp() + ", " + raster2[x][y].getTyp()));
				} else {
					System.out.print(String.format("%-40s", raster1[x][y].getTyp()));
				}
			}
			System.out.println();
		}
		System.out.println(
				"===========================================================================================================================================================================================");
	}
}
