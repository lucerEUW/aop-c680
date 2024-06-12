package uebung7;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Main 
{

	
	public static void main(String[] args) throws Exception 
	{
		//Pfad anpassen!
		File f = new File("./Tiere.txt");
		OutputStream ostream = new FileOutputStream(f);
		
		PrintWriter writer = new PrintWriter(ostream);
		Random zufall = new Random();
		Scanner reader = new Scanner(System.in);
		
		List<Feloidea> katzen = new ArrayList<Feloidea>();
		List<Canoidea> hunde = new ArrayList<Canoidea>();
		List<Haustier> streichelzoo = new ArrayList<Haustier>();
		
		System.out.print("Anzahl > ");
		int anzahl = reader.nextInt();
		
		for(int i = 0; i < anzahl; i++){
			switch(zufall.nextInt(8)){
				case 0:
					writer.println("Amurtiger");
					katzen.add(new Armurtiger());
					break;
				case 1:
					writer.println("Maine-Coon");
					katzen.add(new MaineCoon());
					break;
				case 2:
					writer.println("Beagle");	
					hunde.add(new Beagle());
					break;
				case 3:
					writer.println("Erdmaennchen");		
					katzen.add(new Erdmaennchen());
					break;
				case 4:
					writer.println("Wolf");		
					hunde.add(new Wolf());
					break;
				case 5:
					writer.println("Tuerkisch Van");					
					katzen.add(new TuerkischVan());
					break;
				case 6:
					writer.println("Bernhardiner");					
					hunde.add(new Bernhardiner());
					break;
				case 7:
					writer.println("Kodiakbaer");					
					hunde.add(new Kodiakbaer());
					break;
				default:
			}
		}
		
		System.out.println("Alle Katzen: ");
		for(Feloidea felo : katzen) {
			System.out.println(felo);
		}
		
		System.out.println("Alle Hunde: ");
		for(Canoidea cano : hunde) {
			System.out.println(cano);
		}
		
		String[] katzenNamen = {"Onion", "Bernd", "Pumpkin", "Pommes", "Mokka", "Sissy", "King", "Findus"};
		String[] hundeNamen = {"Fenchel", "Bello", "Ceaser", "Ulbricht", "Rufus", "Richard", "Wagner", "Ferdinand", "Pedro", "Rudofl"};
		
		System.out.println("\nTiere verfügbar im Streichelzoo: ");
			
		for(Feloidea felo : katzen) {
			if(felo instanceof Haustier) {
				((Haustier) felo).setName(katzenNamen[zufall.nextInt(katzenNamen.length)]);
				streichelzoo.add((Haustier) felo);
			}
		}
		for(Canoidea cano : hunde) {
			if(cano instanceof Haustier) {
				((Haustier) cano).setName(hundeNamen[zufall.nextInt(hundeNamen.length)]);
				streichelzoo.add((Haustier) cano);
			}
		}
		
		for(Haustier h : streichelzoo) {
			System.out.println("\nName: " + h.getName());
			System.out.println(h);
			h.streicheln();
		}
		
		reader.close();
		writer.close();
	}

}
