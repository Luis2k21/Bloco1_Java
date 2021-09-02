package lacosderepeticao;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		int x, cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 1000; x <= 1999; x++)
		{
			
			if(x >= 1000 && x <= 1999) 
				if(x % 11 == 5) {
					cont++;
					System.out.println("\nContagem: "+ x);
					System.out.println("\nTotal de contagem: "+ cont);
				}
			
		}
	}

}
