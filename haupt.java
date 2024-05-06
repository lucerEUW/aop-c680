package befzahlen;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class haupt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int maxZahl = scanner.nextInt();
		scanner.close();
		System.out.println("befreundete Zahlen [0-" + maxZahl + "]: " + FindBefZahlen(maxZahl));
	}
	
	public static int DivisorSum(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}	
	
	public static List<Integer> FindBefZahlen(int maxZahl){
		List<Integer> befZahlen = new ArrayList<>();
		for(int j = 1; j <= maxZahl; j++) {
			int divSum = DivisorSum(j);
			if(divSum > j && DivisorSum(divSum) == j && divSum <= maxZahl) {
				befZahlen.add(j);
				befZahlen.add(divSum);
			}
		}
		return befZahlen;
	}
}
