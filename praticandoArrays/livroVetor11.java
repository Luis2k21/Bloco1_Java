package treinamento;

import java.util.Scanner;

public class livroVetor11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int m1[] = new int [5];
		int num;
		
		for(int l = 0; l < 5; l++) {
			
			System.out.println("\nDigite um valor: ");
			m1[l] = ler.nextInt();
		}
		
		for(int l = 0; l < 5; l++) {
			
			System.out.println("\nOrdem crescente " +m1[l]);
		}
		
		for(int l = 4; l >= 0; l--) {
				
			System.out.println("\nOrdem decrescente " +m1[l]);
		}
	}

}
