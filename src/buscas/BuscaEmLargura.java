package buscas;

import java.util.LinkedList;
import java.util.Queue;

import nos.No;

public class BuscaEmLargura extends Busca {
	
	// Fila de dados FiFo
	private Queue<No> filaNos;
		
	public BuscaEmLargura(int valorBusca) {
		this.filaNos = new LinkedList<No>();
		this.setValorBusca(valorBusca);
	}
	
	@Override
	public boolean buscarResultado(No no) {
		if (isResultadoBusca(no)) {
			// Se for o objetivo
			obterResultadoPaternal(no);
			return true;
		} else {			
			// Adicionar os nós na fila
			if (no.getNoEsquerda() != null) {
				this.filaNos.add(no.getNoEsquerda());
			}
			if (no.getNoDireita() != null) {
				this.filaNos.add(no.getNoDireita());
			}
			
			No noPonta = this.filaNos.poll();
			if (noPonta != null && buscarResultado(noPonta)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int contarNosFolha() {
		if (this.filaNos != null) {
			return this.filaNos.size();
		}
		return 0;
	}
	
}
