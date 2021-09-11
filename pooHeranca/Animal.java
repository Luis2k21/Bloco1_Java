package Polimorfismo;

public abstract class Animal {

	private String nome;
	private int idade;
	protected abstract void barulho(String som);
	protected abstract void acao(String acao);
	
	public Animal(String nome, int idade) {
		
		super();
		this.idade = idade;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
