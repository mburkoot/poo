package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter convert = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		convert.price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		convert.bought = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought? %.2f", convert.pagar());
		
		sc.close();
	}

}
