package nos;

public class No {

	private int valor;
	
	private No noPai;	
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
		this.noEsquerda.setNoPai(this);
	}

	public No getNoDireita() {
		return noDireita;
	}

	public void setNoDireita(No noDireita) {
		this.noDireita = noDireita;
		this.noDireita.setNoPai(this);
	}

	public No getNoPai() {
		return noPai;
	}

	public void setNoPai(No noPai) {
		this.noPai = noPai;
	}
	
	
	
}
