package romanNumbers;

public class romanNumbers {
	
	public static void main(String[] args) {
		
		int dez = 1111; //max 3999
		int dez2 = dez;
		
		int[] dwerte = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] rwerte = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		String rom = "";
		
		for(int i=0; i<dwerte.length; i++) 
		{
			String r = rwerte[i];
			int d = dwerte[i];
			while (dez >= d)
			{
				dez -= d;
				rom += r;
			}
		}
		System.out.println("Dezimal: " + dez2);
		System.out.println("Die r�mische Zahl: " + rom);
		
	}

}