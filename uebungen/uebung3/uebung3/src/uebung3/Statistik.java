package uebung3;

import java.util.Arrays;
import java.util.Random;

public class Statistik {
	
	public static void main(String[] args) {
		Random zufall = new Random();
		
		int n = 100000;
		double[] werte = new double[n];
		
		for(int i = 0; i < werte.length; i++){
			werte[i] = zufall.nextDouble()*10;
		}
		
		double summe = 0.0;
		for(double d : werte) {
			summe += d;
		}
		double mittelwert = summe/n;
		
		double quadratAbweichung = 0.0;
		for(double d : werte) {
			quadratAbweichung += (d - mittelwert) * (d - mittelwert);
		}
		
		double sigma = Math.sqrt(quadratAbweichung*(1.0/(n-1)));
		
		Arrays.sort(werte);
		double median = 0.0;
		if((n & 1) == 0)
		{
			median = 0.5 * (werte[n/2] + werte[n/2 - 1]);
		}
		else
		{
			median = werte[(n-1)/2];
		}
		
		System.out.printf("Mittelwert:	%8.2f\n",mittelwert);
		System.out.printf("Sigma:		%8.2f\n",sigma);
		System.out.printf("Median:		%8.2f\n",median);
	}
}
