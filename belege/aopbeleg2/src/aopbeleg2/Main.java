package aopbeleg2;
public class Main {
    public static void main(String[] args) {
        Spielraster raster = new Spielraster();
        GegenstandFactory gebäudeFactory = new GebaeudeFactory();
        GegenstandFactory fahrzeugFactory = new FahrzeugFactory();
        GegenstandFactory grundstückFactory = new GrundstueckFactory();

        // Beispielhafte Platzierung
        raster.platziereGegenstand(gebäudeFactory.createGegenstand("Wohngebäude", new Position('A', 4)), 'A', 4);
        raster.platziereGegenstand(fahrzeugFactory.createGegenstand("Traktor", new Position('B', 1)), 'B', 1);
        raster.platziereGegenstand(grundstückFactory.createGegenstand("Waldgrundstück", new Position('C', 3)), 'C', 3);

        raster.zeigeRaster();

        // Weitere Logik für Regen und Gewitter hier...
    }
}