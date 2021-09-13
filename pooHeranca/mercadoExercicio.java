package Familia32;

import java.util.ArrayList;
import java.util.Scanner;

public class mercadoExercicio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList();
		int op;

		do {
			System.out.println("\n\t\tLista de opções");
			System.out.println("\n1 - Adicionar produtos ao estoque");
			System.out.println("\n2 - Remover produtos do estoque");
			System.out.println("\n3 - Atualizar produtos do estoque");
			System.out.println("\n4 - Mostrar os produtos do estoque");
			System.out.println("\n0 - Sair do estoque");
			op = ler.nextInt();
			
			switch(op) {
			
			case 1:
				ler.nextLine();
				System.out.println("\nEscreva o nome do produto que queira adicionar");
				String produto = ler.nextLine();
				estoque.add(produto);		
				System.out.print("\n");
				System.out.println(estoque);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\nEscreva o nome do produto que deseja remover");
				System.out.print("\n");
				System.out.println(estoque);			
				String produto1 = ler.nextLine();
				
				if(estoque.contains(produto1)) {
					
					estoque.remove(produto1);
				}
				else {
					
					System.out.println("\nO produto não existe no estoque");
				}
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("\nEscreva o nome do produto que deseja atualizar");
				System.out.print("\n");
				System.out.println(estoque);
				String atualizar = ler.nextLine();
				
				System.out.println("\nEscreva um novo produto");
				String novo = ler.nextLine();
				
				if(estoque.contains(atualizar)) {
					
					estoque.remove(atualizar);
					estoque.add(novo);
				}
				else {
					System.out.println("\nO produto que deseja atualizar não existe!!");
				}
				
			case 4:
				System.out.println("\nProdutos no estoque");
			    System.out.println(estoque);
			    
			    default:
			    	if(op > 4 && op < 0) {
			    		System.out.println("\nOpção invalida!!");
			    	}
			}		
		}while(op != 0);
	}

}
