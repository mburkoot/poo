package vetor3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vetor = new Quartos[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(); //apenas para separar
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Quartos(name, email);
		}
		
		System.out.println(); //apenas para separar
		System.out.println("Busy rooms:");
		
		for (int i=0; i<10; i++) {
			
			if (vetor[i] != null) {
			System.out.println(i + ": " + vetor[i]);
			}
		}
		sc.close();
	}

}
