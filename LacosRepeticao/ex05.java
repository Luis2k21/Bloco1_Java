package lacosderepeticao;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num=0, somaNum=0;
		
		do {
			somaNum += num;
			
			System.out.println("\nDigite n�meros de um digito: ");
			num = leia.nextInt();
			
		}
		while(num != 0 && num <= 9);
		
		System.out.println("\nA soma dos n�meros � de: "+ somaNum);
	}
}
