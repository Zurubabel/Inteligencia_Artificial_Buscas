package buscas;

import java.util.Stack;

import nos.No;

public class BuscaEmProfundidade extends Busca{

	private Stack<No> pilhaNos;
	
	private int valorBusca;
	
	public BuscaEmProfundidade(int valorBusca) {
		this.pilhaNos = new Stack<>();
		
		this.valorBusca = valorBusca;
	}
	
	
	public boolean isResultadoBusca(No no) {
		return no.getValor() == valorBusca;
	}


	public boolean buscarResultado(No no) {
		this.pilhaNos.add(no);
		if (isResultadoBusca(no)) {
			// Exibir o caminho
			//obterResultadoPaternal(no);
			obterResultadoViaPilha();
			return true;
		} else {
			// Expandir os próximos nós (esquerda -> direita)
			if (no.getNoEsquerda() != null && this.buscarResultado(no.getNoEsquerda())) { 
				return true;
			}
			
			if (no.getNoDireita() != null && this.buscarResultado(no.getNoDireita())) {
				return true;
			}
		}
		this.pilhaNos.pop();
		return false;
	}
	
	private void obterResultadoViaPilha() {
		String retorno = "";
		
		while (this.pilhaNos.size() > 0) {
			retorno = this.pilhaNos.pop().getValor() + " " + retorno;
		}
		
		this.setTextoResposta(retorno);
	}		
	
}
