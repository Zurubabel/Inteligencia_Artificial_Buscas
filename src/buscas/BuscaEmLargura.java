package buscas;

import java.util.LinkedList;
import java.util.Queue;

import nos.No;

public class BuscaEmLargura {
	
	// Fila de dados FiFo
	private Queue<No> filaNos;
	
	private String textoResposta;
	
	private int valorBusca;
	
	public BuscaEmLargura(int valorBusca) {
		this.filaNos = new LinkedList<No>();
		this.valorBusca = valorBusca;
	}
	
	public boolean buscarResultado(No no) {
		if (isResultadoBusca(no)) {
			// Se for o objetivo
			obterResultadoPaternal(no);
			return true;
		} else {
			// Se não for o objetivo
			
			// Adicionar os nós na fila
			if (no.getNoEsquerda() != null) {
				this.filaNos.add(no.getNoEsquerda());
			}
			
			if (no.getNoDireita() != null) {
				this.filaNos.add(no.getNoDireita());
			}
			
			No noPonta = this.filaNos.poll();
			if (noPonta != null && buscarResultado(this.filaNos.poll())) {
				return true;
			}
		}
		return false;
	}
	
	private void obterResultadoPaternal(No no) {
		String retorno = "";
		No noValor = no;
		retorno += noValor.getValor();
		while (noValor.getNoPai() != null) {
			noValor = noValor.getNoPai();
			retorno = noValor.getValor() + " " + retorno;
		}
		this.textoResposta = retorno;
	}
	
	public boolean isResultadoBusca(No no) {
		return no.getValor() == valorBusca;
	}
	
	public void exibirTextoResultado() {
		if (this.textoResposta != null) {
			System.out.println("O caminho percorrido será: " + this.textoResposta);
		} else {
			System.out.println("O valor " + this.valorBusca + " não foi encontrado.");
		}
	}
	
}
