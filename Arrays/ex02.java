package Arrays;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeros[] = new int [6];
		int contImpar=0, somaImpar=0, contPar=0, somaPar=0;
		
		for(int x = 0; x < 6; x++) {
			
			System.out.println("\nDigite um número: ");
			numeros[x] = leia.nextInt();
	
		}
		
		for(int x = 0; x < 6; x++) {
			
			if(numeros[x] % 2 == 0) {
				System.out.println("\nNúmero Par: "+ numeros[x]);
				somaPar += numeros[x];
			}
			else {
				System.out.println("\nNúmero Impar: "+ numeros[x]);
				contImpar++;
			}
		}
		
		System.out.println("\nA soma dos números pares é: "+ somaPar);
		System.out.println("\nA contagem dos impares é: "+ contImpar);
		
	}

}
