package uebung4;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		Card karte = new Card();
		karte.setFarbe("Kreuz");
		karte.setWert("acht");
		
		System.out.println(karte);
		
		Card[] skatspiel = new Card[32];
		
		genCardDeck(skatspiel);
		System.out.println("-----ungemisch-----");
		showCardDeck(skatspiel);
		shuffleCardDeck(skatspiel);
		System.out.println("-----gemischt-----");
		showCardDeck(skatspiel);
		
		Card[] s1 = new Card[10];
		Card[] s2 = new Card[10];
		Card[] s3 = new Card[10];
		Card[] skat = new Card[2];
		
		dealCards(skatspiel,s1,s2,s3,skat);
		
		System.out.println("-----Spieler1-----");
		showCardDeck(s1);
		System.out.println("-----Spieler2-----");
		showCardDeck(s2);
		System.out.println("-----Spieler3-----");
		showCardDeck(s3);
		System.out.println("-----Skat-----");
		showCardDeck(skat);
	}

	private static void dealCards(Card[] deck, Card[] s1, Card[] s2, Card[] s3, Card[] skat) {
//		erste Runde 3 Karten
		for(int i=0; i<3; i++) {
			s1[i] = deck[i];
			s2[i] = deck[i+3];
			s3[i] = deck[i+6];
		}
//		skat
		skat[0] = deck[9];
		skat[1] = deck[10];
//		zweite Runde 4 Karten
		for(int i=0; i<4; i++) {
			s1[i+3] = deck[i+11];
			s2[i+3] = deck[i+11+4];
			s3[i+3] = deck[i+11+8];
		}
//		dritte Runde 3 Karten
		for(int i=0; i<3; i++) {
			s1[i+7] = deck[i+23];
			s2[i+7] = deck[i+23+3];
			s3[i+7] = deck[i+23+6];
		}
	}

	private static void shuffleCardDeck(Card[] deck) {
		for(int i=0; i<deck.length; i++) {
			Random zufall = new Random();
			int j = zufall.nextInt(32);
			Card tmp = deck[i];
			deck[i] = deck[j];
			deck[j] = tmp;
		}
	}

	private static void showCardDeck(Card[] deck) {
		for(Card card : deck) {
			System.out.println(card);
		}
	}

	private static void genCardDeck(Card[] deck) {
		final String[] farben = {"Karo", "Herz", "Pik", "Kreuz"};
		final String[] werte = {"7", "8", "9", "10", "Bube", "Dame", "K�nig", "Ass"};
		
		int i = 0;
		for(String f : farben) {
			for (String w : werte) {
				Card c = new Card();
				c.setFarbe(f);
				c.setWert(w);
				deck[i] = c;
				i++;
			}
		}
		
	}
}
