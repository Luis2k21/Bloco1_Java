package Familia32;

import java.util.Scanner;

public class LacosdeDecisao1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float a ,b ,c ,maior;
		
		System.out.println("Digite um número inteiro");
		a = leia.nextFloat();
		System.out.println("Digite outro número inteiro");
		b = leia.nextFloat();
		System.out.println("Digite outro número inteiro");
		c = leia.nextFloat();
		
		if(a > b && a > c)
		{
			System.out.println("O valor maior é de: "+a);
		}
		if(b > a && b > c)
		{
			System.out.println("O valor maior é de: "+b);
		}
		if(c > a && c > b)
		{
			System.out.println("O valor maior é de: "+c);
		}
	}

}
