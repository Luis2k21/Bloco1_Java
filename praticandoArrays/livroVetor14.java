package treinamento;

import java.util.Scanner;

public class livroVetor14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int V[] = new int[5];
		
		for(int l = 0; l < 5; l++) {
			
			System.out.println("\nDigite um valor");
			V[l] = ler.nextInt();
		}
		
		System.out.println("\n\t\tOrdem decrescente");
		System.out.println("\n");
		
		for(int l = 4; l >= 0; l--) {
			System.out.print("\t "+ " [" + V[l]+ "]");
		}
		
	}

}
