package nos;

public class No {

	private int valor;
	
	private No noEsquerda;
	private No noDireita;
	
	public No(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public No getNoEsquerda() {
		return noEsquerda;
	}

	public void setNoEsquerda(No noEsquerda) {
		this.noEsquerda = noEsquerda;
	}

	public No getNoDireita() {
		return noDireita;
	}

	public void setNoDireita(No noDireita) {
		this.noDireita = noDireita;
	}
	
	
	
}
