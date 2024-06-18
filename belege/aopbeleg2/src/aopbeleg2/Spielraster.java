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
		 System.out.println("=========================================================================================================");
		 System.out.println(String.format("  %-20s %-20s %-20s %-20s %-20s", "A", "B", "C", "D", "E"));
		 
		for(int y = 0; y < SIZE; y++) {
			for(int x = 0; x < SIZE; x++) {
				if(raster[x][y] == null) {
					System.out.print(String.format("%-20s", "Leer"));
				}else {
					System.out.print(String.format("%-20s", raster[x][y].getTyp()));
				}
			}
			System.out.println();
		}
		System.out.println("=========================================================================================================");
	}
}
