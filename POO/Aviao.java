package POO;

public class Aviao {

	private String nomeDoPassageiro;
	private String nomeDoAviao;
	private String destino;
	
	public Aviao(String nomeDoPassageiro, String nomeDoAviao, String destino) {
		
		this.nomeDoPassageiro = nomeDoPassageiro;
		this.nomeDoAviao = nomeDoAviao;
		this.destino = destino;
	}
	
	public void imprimirInfo() {
		
		System.out.println("\n"+nomeDoPassageiro+ "\nEst� a bordo do avi�o: "+nomeDoAviao+ 
				" \nO voou est� indo em dire��o ao:"+ destino);
	}

	public String getNomeDoPassageiro() {
		return nomeDoPassageiro;
	}

	public void setNomeDoPassageiro(String nomeDoPassageiro) {
		this.nomeDoPassageiro = nomeDoPassageiro;
	}

	public String getNomeDoAviao() {
		return nomeDoAviao;
	}

	public void setNomeDoAviao(String nomeDoAviao) {
		this.nomeDoAviao = nomeDoAviao;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}
