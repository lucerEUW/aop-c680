package aopbeleg2;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Spielraster raster = new Spielraster();
        GegenstandFactory gebäudeFactory = new GebaeudeFactory();
        GegenstandFactory fahrzeugFactory = new FahrzeugFactory();
        GegenstandFactory grundstückFactory = new GrundstueckFactory();

        Random random = new Random();
        char[] buchstaben = {'A', 'B', 'C', 'D', 'E'};
        int[] zahlen = {1, 2, 3, 4, 5};

        int anzahlGebäude = 5;
        int anzahlFahrzeuge = 5;
        int anzahlGrundstücke = 5;

        for (int i = 0; i < anzahlGebäude; i++) {
            platziereGegenstandZufaellig(raster, gebäudeFactory, new String[]{"Wohngebäude", "Stall", "Wirtschaftsgebäude"}, buchstaben, zahlen, random);
        }

        for (int i = 0; i < anzahlFahrzeuge; i++) {
            platziereGegenstandZufaellig(raster, fahrzeugFactory, new String[]{"Traktor", "Mähdrescher", "Transporter"}, buchstaben, zahlen, random);
        }

        for (int i = 0; i < anzahlGrundstücke; i++) {
            platziereGegenstandZufaellig(raster, grundstückFactory, new String[]{"Waldgrundstück", "Wiesengrundstück", "Feldgrundstück"}, buchstaben, zahlen, random);
        }

        raster.zeigeRaster();

        WetterSimulator wetterSimulator = new WetterSimulator(raster);
        wetterSimulator.regnenLassen();
        wetterSimulator.gewitternLassen();
    }

    private static void platziereGegenstandZufaellig(Spielraster raster, GegenstandFactory factory, String[] typen, char[] buchstaben, int[] zahlen, Random random) {
        boolean platziert = false;
        while (!platziert) {
            char zufallsBuchstabe = buchstaben[random.nextInt(buchstaben.length)];
            int zufallsZahl = zahlen[random.nextInt(zahlen.length)];

            try {
                Gegenstand gegenstand = factory.createGegenstand(typen[random.nextInt(typen.length)], new Position(zufallsBuchstabe, zufallsZahl));
                raster.platziereGegenstand(gegenstand, zufallsBuchstabe, zufallsZahl);
                platziert = true;
            } catch (IllegalArgumentException e) {
            }
        }
    }
}