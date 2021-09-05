package treinamento;

import java.util.Scanner;

public class livroVetor5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int v1[] = new int [10];
		
		for(int x = 0; x < 10; x++) {
			System.out.println("\nDigite um valor: ");
			v1[x] = ler.nextInt();
		}
		
		for(int x = 0; x < 10; x++) {
			if(v1[x] > 0) {
				System.out.println("Positivos: "+v1[x]+ " ");
			}
		}
		
	}

}
