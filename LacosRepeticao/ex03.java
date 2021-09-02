package lacosderepeticao;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idade=0, contMenos=0, contMais=0;
		
		while(idade >= 0) {
			
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			
			if(idade < 21){
				contMenos++;
			}
			if(idade > 50) {
				contMais++;
			}
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é de: "+ contMenos);
		System.out.println("\nO total de pessoas com mais de 50 anos é de: "+contMais);
	}

}
