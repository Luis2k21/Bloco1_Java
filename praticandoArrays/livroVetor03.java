package treinamento;

import java.util.Scanner;

public class livroVetor03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int K[] = new int[2];
		int N[] = new int[2];		
		int M[] = new int[2];
		
		for(int l = 0; l < 2; l++) {
			
			System.out.println("\nInsira o valor de K: ");
			K[l] = ler.nextInt();
			System.out.println("\nInsira o valor de N: ");
			N[l] = ler.nextInt();
		}
		
		for(int l = 0; l < 2; l++) {
			
			M[l] = K[l] - N[l];
			System.out.println("\nDiferença "+" ["+ M[l]+ "]");
		}
		
	}

}
