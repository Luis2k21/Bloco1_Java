package Polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("\nNome: "+cachorro.getNome()+ "\nIdade: "+cachorro.getIdade()+" Anos");
		cachorro.barulho("barulho");
		cachorro.acao("acao");
		System.out.println("\n*************************");
		
		System.out.println("\nNome: "+cavalo.getNome()+ "\nIdade: "+cavalo.getIdade()+ " Anos");
		cavalo.barulho("barulho");
		cavalo.acao("acao");
		System.out.println("\n**************************");
		
		System.out.println("\nNome: "+preguica.getNome()+ "\nIdade: "+preguica.getIdade()+ " Anos");
		preguica.barulho("barulho");
		preguica.acao("acao");
	}
}
