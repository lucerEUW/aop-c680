package pi_raten;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random zufall = new Random();
		int n = 10000000;
		int imKreis = 0;
		for(int i = 0; i < n; i++) {
			double x = zufall.nextDouble();
			double y = zufall.nextDouble();
			
			if((x*x + y*y) <= 1.0)
			{
				imKreis += 1;
			}
		}
		System.out.printf("pi/4 = %10.9f",4*((double)imKreis)/n);
	}

}
