package Arrays;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeros[] = new int [6];
		int contImpar=0, somaImpar=0, contPar=0, somaPar=0;
		
		for(int x = 0; x < 6; x++) {
			
			System.out.println("\nDigite um n�mero: ");
			numeros[x] = leia.nextInt();
	
		}
		
		for(int x = 0; x < 6; x++) {
			
			if(numeros[x] % 2 == 0) {
				System.out.println("\nN�mero Par: "+ numeros[x]);
				somaPar += numeros[x];
			}
			else {
				System.out.println("\nN�mero Impar: "+ numeros[x]);
				contImpar++;
			}
		}
		
		System.out.println("\nA soma dos n�meros pares �: "+ somaPar);
		System.out.println("\nA contagem dos impares �: "+ contImpar);
		
	}

}
