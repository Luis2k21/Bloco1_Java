package Familia32;

import java.util.Scanner;

public class LacosdeDecisao3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14)
		{
			System.out.println("Você está na categoria infantil");
		}
		if(idade >= 15 && idade <= 17) {
			System.out.println("Você está na categoria juvenil");
		}
		if(idade >= 18 && idade <= 25)
		{
			System.out.println("Você está na categoria adulto");
		}
		else
		{
			System.out.println("Você não está em nenhuma categoria");
		}
		
	}

}
