package pooHierarquia;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro animal1 = new Cachorro("Pipoca", 4, "Au Au", "Correr", "Avermelhado", 32, 1.25);
		animal1.imprimirInfo();
		
		System.out.println("\n***************************");
		
		Cavalo animal2 = new Cavalo("Trov�o", 9, "iiirrrr�, rilinchin", "Correr", "Marrom", 1.76, 80);
		animal2.imprimirInfo();
		
		System.out.println("\n***************************");
		
		Preguica animal3 = new Preguica("Adilson", 7, "Zzzzzz", "Dorme", "Cinza", 50, 18);
		animal3.imprimirInfo();
	}

}
