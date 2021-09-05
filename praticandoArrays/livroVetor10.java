package treinamento;

import java.util.Scanner;

public class livroVetor10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int m1[][] = new int [2][2];
		int m2[][] = new int [2][2];
		int m3[][] = new int [2][2];
		int op;
		
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 2; c++) {
				
				System.out.println("\nDigite o valor da matriz 1: ");
				m1[l][c] = ler.nextInt();
				System.out.println("\nDigite o valor da matriz 2: ");
				m2[l][c] = ler.nextInt();
				
			}
		}
		
		do {
			System.out.println("\n\n");
			System.out.println("\n\t\tEscolha uma das opções a baixo");
			System.out.println("\n1 - Soma das matrizes");
			System.out.println("\n2 - Diferença das matrizes");
			System.out.println("\n3 - Produto das matrizes");
			System.out.println("\n4 - Sair do sistema");
			op = ler.nextInt();
			
		switch(op) {
		
		case 1: 
			System.out.println("\n\tA soma das matrizes é: ");
			System.out.println("\n");
			for(int l = 0; l < 2; l++) {
				for(int c = 0; c < 2; c++) {
					
					m3[l][c] = m1[l][c] + m2[l][c];
					System.out.print("\t[" +m3[l][c] +"]");
				}
			}break;
		case 2:
			System.out.println("\n\tA diferença das matrizes é: ");
			System.out.println("\n");
			for(int l = 0; l < 2; l++) {
				for(int c = 0; c < 2; c++) {
					
					m3[l][c] = m1[l][c] - m2[l][c];
					System.out.print("\t["+m3[l][c]+ "]");
				}
			}break;
			
		case 3:
			System.out.println("\n\tO produto das matrizes é: ");
			System.out.println("\n");
			for(int l = 0; l < 2; l++) {
				for(int c = 0; c < 2; c++) {
					
					m3[l][c] = m1[l][c] * m2[l][c];
					System.out.print("\t["+m3[l][c]+ "]");
				}
			}break;
			
		case 4:
			System.out.println("\n\t\tObrigado por usar o nosso sistema");
			default:
				if(op > 4) {
					System.out.println("\n\t\tOpção invalida!! tente novamente");
				}
				else if(op <= 0){
					System.out.println("\n\t\tOpção invalida!! tente novamente");
				}
			}
		}while(op != 4);
	}

}
