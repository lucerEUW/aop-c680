package befzahlen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class befzahlen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Maximale Zahl eingeben: ");
    int maxZahl = scanner.nextInt();
    scanner.close();
    System.out.println("befreundete Zahlen [0-" + maxZahl + "]: " + BefZahlenSammeln(maxZahl));
  }

  public static int DivisorSum(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static List<List<Integer>> BefZahlenSammeln(int maxZahl) {
    List<List<Integer>> befZahlen = new ArrayList<>();
    for (int j = 1; j <= maxZahl; j++) {
      int divSum = DivisorSum(j);
      if (divSum > j && DivisorSum(divSum) == j && divSum <= maxZahl) {
        List<Integer> tupel = new ArrayList<>();
        tupel.add(j);
        tupel.add(divSum);
        befZahlen.add(tupel);
      }
    }
    return befZahlen;
  }
}
