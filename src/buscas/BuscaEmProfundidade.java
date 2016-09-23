package buscas;

import java.util.Stack;

import nos.No;

public class BuscaEmProfundidade {

	private Stack<No> pilhaNos;
	
	private No noAtual;
	
	private int valorBusca;
	
	public BuscaEmProfundidade(int valorBusca) {
		this.pilhaNos = new Stack<>();
		
		this.valorBusca = valorBusca;
	}
	
	
	public boolean isResultadoBusca(No no) {
		return no.getValor() == valorBusca;
	}


	public void buscar(No no) {
		if (isResultadoBusca(no)) {
			// Exibir o caminho
		} else {
			// Expandir os próximos nós (esquerda -> direita)
		}
		
	}
	
	
	
	
}
