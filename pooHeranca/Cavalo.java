package Polimorfismo;

public class Cavalo extends Animal{

	public Cavalo() {
		
		super("Jefferson", 10);
	}
	@Override
	public void barulho(String barulho) {
		
		System.out.println("Hiin in in");
	}
	@Override
	public void acao(String acao) {
		
		System.out.println("Pular");
	}
}
