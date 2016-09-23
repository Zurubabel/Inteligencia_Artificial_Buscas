package buscas;

import java.util.Stack;

import nos.No;

public class BuscaEmProfundidade {

	private Stack<No> pilhaNos;
	
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
	
	
	public void exibirResultado(No no) {
		
	}
	
	
	
}
