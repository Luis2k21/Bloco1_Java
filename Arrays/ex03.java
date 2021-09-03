package Arrays;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float numeros[][] = new float [3][3];
		int menorQue=0, maiorQue=0, valor;
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				
				System.out.println("\nDigite um valor: ");
				valor = leia.nextInt();
				
				if(valor > 10) {
					maiorQue++;
				}
				if(valor < 10) {
					menorQue++;
				}
			}	
		}
		System.out.println("\nNúmeros maiores que 10: "+maiorQue);
		System.out.println("\nNúmeros menores que 10: "+menorQue);
	}

}
