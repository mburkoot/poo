package encapsulamento1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc;
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			acc = new Account(numero, nome, depositoInicial);
		}
		
		else {
			acc = new Account(numero, nome);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valorDeposito = sc.nextDouble();
		acc.deposito(valorDeposito);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valorSaque = sc.nextDouble();
		acc.saque(valorSaque);
		System.out.println("Updated account data: ");
		System.out.println(acc);	
		
		sc.close();
	}

}
