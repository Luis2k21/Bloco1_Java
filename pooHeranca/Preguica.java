package pooHierarquia;

public class Preguica extends Animal{

	private String cor;
	private double altura;
	private double peso;
	
	public Preguica(String nome, int idade, String emitirSom, 
			String acao, String cor, double altura, double peso) {
		
		super(nome, idade, emitirSom, acao);
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void imprimirInfo() {
		
		System.out.println("\nNome: "+getNome()+ "\nIdade: "+getIdade()+ "\nSom emitido: "+getEmitirSom()+
				"\nAção aplicada: "+getAcao()+ "\nCor: "+cor+ "\nAltura: "+altura+" cm"+"\nPeso: "+peso+ " KG");
	}
}
