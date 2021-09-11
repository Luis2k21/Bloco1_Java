package Polimorfismo;

public class Preguica extends Animal{

	public Preguica() {
		
		super("Adilson", 7);
	}
	@Override
	public void barulho(String barulho) {
		
		System.out.println("Zzzzzzzzzz");
	}
	@Override
	public void acao(String acao) {
		
		System.out.println("Dormir");
	}
}
