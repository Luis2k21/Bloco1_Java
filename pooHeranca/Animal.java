package pooHeranca;

public class Animal {

	private String nome;
	private int idade;
	private String emitirSom;
	private String acao;
	
	public Animal(String nome, int idade, String emitirSom, String acao) {
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.emitirSom = emitirSom;
		this.acao = acao;
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

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}
