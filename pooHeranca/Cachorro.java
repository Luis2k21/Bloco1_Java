package Polimorfismo;

public class Cachorro extends Animal{

	public Cachorro() {
		
		super("Francisco", 6);
	}

	@Override
	public void barulho(String barulho) {
		
		System.out.println("Au au");
	}
	@Override
	public void acao(String acao) {
		
		System.out.println("Correr");
	}
}
