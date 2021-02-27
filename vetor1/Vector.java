package vetor1;

import java.util.Locale;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetor = new double[N];
		
		for(int i=0; i<N; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i=0;i<N; i++) {
			soma += vetor[i];
		}
		
		double resultado = soma/N;
		
		System.out.printf("AVARAGE HEIGHT = %.2f", resultado);
		
		
		sc.close();
	}

}
