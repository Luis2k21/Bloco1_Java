package POO;

public class Cliente {

	private String nome;
	private double altura;
	private int idade;
	private String cor;
	
	public Cliente(String nome, double altura, int idade, String cor){
		
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.cor = cor;
	}
	
	public void imprimirInfo() {
		
		System.out.println("\n"+nome+ " \nPossui altura de "+ altura+ "\nTem "+ idade+ " Anos"+ " \nEtnia" +cor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
