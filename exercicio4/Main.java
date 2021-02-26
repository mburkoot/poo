package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + aluno.media());
		
		if (aluno.media()<60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f", aluno.falta());
		}
		else {
			System.out.println("PASS");
		} 
			
		sc.close();
	}

}
