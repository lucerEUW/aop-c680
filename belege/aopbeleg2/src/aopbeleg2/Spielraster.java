package aopbeleg2;

public class Spielraster {
	
	private static final int SIZE = 5;
	private Gegenstand[][] raster = new Gegenstand[SIZE][SIZE];
	
	public void platziereGegenstand(Gegenstand gegenstand, char x, int y) {
		
		int ix = x -'A';
		int iy = y - 1;
		
		if(ix < 0 || ix >= SIZE || iy >= SIZE) {
			throw new IllegalArgumentException("Ungültige Position: " + x + y);
		}
		
		if(raster[ix][iy] != null) {
			throw new IllegalArgumentException("Feld ist bereits belegt: " + x + y);
		}
		
		raster[ix][iy] = gegenstand;
	}
	
	public Gegenstand getGegenstand (char x, int y) {
		
		int ix = x -'A';
		int iy = y - 1;
		
		if(ix < 0 || ix >= SIZE || iy >= SIZE) {
			throw new IllegalArgumentException("Ungültige Position: " + x + y);
		}
		return raster[ix][iy];
	}
	
	public void zeigeRaster() {
		for(int y = 0; y < SIZE; y++) {
			for(int x = 0; x < SIZE; x++) {
				if(raster[x][y] == null) {
					System.out.print("Leer ");
				}else {
					System.out.print(raster[x][y].getTyp() + " ");
				}
			}
			System.out.println();
		}
	}
}
