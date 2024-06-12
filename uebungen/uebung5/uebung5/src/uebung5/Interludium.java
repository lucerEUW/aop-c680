package uebung5;

import java.util.Random;
import java.util.Scanner;

public class Interludium {

	public static void main(String[] args) {
		System.out.println("Gib die Dimension ein: n = ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Random rand = new Random();
		double[] a = new double[n];
		double[] b = new double[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = rand.nextGaussian();
			b[i] = rand.nextGaussian();
		}
		
		System.out.println("Skalarprodukt: " + Skalarprodukt(a,b));
		System.out.println("Norm von a: " + norm(a) + '\n' + "Norm von b: " + norm(b));
		System.out.println("Winkel zwischen den Vektoren: " + winkel(a,b));
	}

	private static String winkel(double[] a, double[] b) {
		
		return null;
	}

	private static double norm(double[] a) {
		double sum = 0;
		for(int i = 0; i<a.length; i++)
		{
			sum = sum + a[i] * a[i];
		}
		return Math.sqrt(sum);
	}

	private static double Skalarprodukt(double[] a, double[] b) {
		double sum = 0;
		for(int i = 0; i<a.length; i++)
		{
			sum = sum + (a[i] * b[i]);
		}
		return sum;
	}

}
