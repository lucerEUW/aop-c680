package uebung6;

import java.io.*;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
	private static File directory = new File(".//Daten");
	public static Random zufall = new Random();
	
	public static void main(String[] args) throws Exception
	{
		Matrix a;
		a = einMatrix();
		ausMatrix(a);
	}
	
	
	public static Matrix einMatrix() throws Exception
	{
		File matrixFile;
		InputStream istream;
		Matrix einMatrix = null;
		Scanner eingabe = new Scanner(System.in);
		
		int ausw;
		do {
			System.out.println("Quelle fuer Eingabematrix");
			System.out.println("\t1 Einlesen aus Datei");
			System.out.println("\t2 Eingabe von Tastatur");
			System.out.println("\t3 Zufallsbelegung");	
			System.out.print("Auswahl > ");
			ausw = eingabe.nextInt();
			
			switch (ausw) 
			{
				case 1:		matrixFile = selectFile(directory);
							if (matrixFile != null) 
							{
								istream = new FileInputStream(matrixFile);
								einMatrix = Matrix.read(istream);
								istream.close();
							} 
							else
							{
								System.out.println("Dateiauswahl fehlerhaft");
							}
							break;
				case 2:		System.out.println("Matrix eingeben:");
							einMatrix = Matrix.read(System.in);
							break;
				case 3:		int dim;
							System.out.print("Groesse: ");
							dim = eingabe.nextInt();
							einMatrix = new Matrix(dim);
							einMatrix.randomize();
							break;
				default:	System.out.println("Fehlerhafte Auswahl");				
			}
		}while(einMatrix == null);
		
	return einMatrix;
	}
	
	
	public static void ausMatrix(Matrix m) throws Exception
	{
		File matrixFile;
		OutputStream ostream;
		Scanner eingabe = new Scanner(System.in);
		
		int ausw;
		System.out.println("Ziel fuer Ausgabematrix");
		System.out.println("\t1 Ausgabe in neuer Datei");
		System.out.println("\t2 Ausgabe auf dem Bildschirm");
		System.out.print("Auswahl > ");
		ausw = eingabe.nextInt();
		boolean fehler = false;
		do 
		{
			switch (ausw) 
			{
				case 1: 	String dateiname;
							System.out.print("Dateiname > ");
							dateiname = eingabe.next();
							matrixFile = new File(directory + File.separator + dateiname);
							ostream = new FileOutputStream(matrixFile);
							m.print(ostream);
							ostream.close();
							break;
				case 2:		m.print(System.out);
							break;
				default:	System.out.println("Fehlerhafte Auswahl");
							fehler = true;
			}
		}while(fehler);
	}
	
	
	public static File selectFile(File actdir) throws IllegalArgumentException
	{
		if (!actdir.isDirectory())
			throw new IllegalArgumentException("Path is not a directory");
		File[] ls = null;
		int index;
		Scanner input = new Scanner(System.in);
		ls = actdir.listFiles(new FileFilter() 
					{
						public boolean accept(File f) 
						{
								return f.isFile();
						}
					}
							 );
		if (ls != null && ls.length != 0)
		{
			for (int i = 0; i < ls.length; i ++) 
			{
				System.out.println(i + " " + ls[i].getName());
			}
			
			do 
			{
				System.out.print("Auswahl (Nr) > ");
				index = input.nextInt();
				if ((0 <= index) && (index < ls.length) ) 
				{
					return ls[index];
				} 
				else 
				{
					System.out.println("Bitte korrekten Wert eingeben");
				}
			}while(true);
		}
		else 
		{
			System.out.println("Keine Dateien vorhanden");
			return null;
		}
	}
}
