package buscas;

import java.util.Stack;

import nos.No;

public class BuscaEmProfundidade {

	private Stack<No> pilhaNos;
	
	private String textoResposta;
	
	private int valorBusca;
	
	public BuscaEmProfundidade(int valorBusca) {
		this.pilhaNos = new Stack<>();
		
		this.valorBusca = valorBusca;
	}
	
	
	public boolean isResultadoBusca(No no) {
		return no.getValor() == valorBusca;
	}


	public void buscar(No no) {
		this.pilhaNos.add(no);
		if (isResultadoBusca(no)) {
			// Exibir o caminho
			exibirResultadoPaternal(no);
		} else {
			// Expandir os próximos nós (esquerda -> direita)
			if (no.getNoEsquerda() != null) { 
				// Tem o nó da esquerda
				this.buscar(no.getNoEsquerda());
			} else if (no.getNoDireita() != null) {
				// Tem o nó da direita
				this.buscar(no.getNoDireita());
			}
		}
		this.pilhaNos.pop();
		
	}
	
	
	public void exibirResultadoPaternal(No no) {
		String retorno = "";
		
		No noValor = no;
		
		retorno += noValor.getValor();
		
		while (noValor.getNoPai() != null) {
			noValor = noValor.getNoPai();
			retorno += noValor.getValor() + " " + retorno;
		}
		this.textoResposta = retorno;
	}
	
	
	
}
