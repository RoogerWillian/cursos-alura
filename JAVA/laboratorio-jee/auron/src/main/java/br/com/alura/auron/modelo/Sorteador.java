package br.com.alura.auron.modelo;

import java.util.List;

public class Sorteador {

	private Sorteio sorteio;
	private List<Participante> participantes;

	public Sorteador(Sorteio sorteio, List<Participante> participantes) {
		this.sorteio = sorteio;
		this.participantes = participantes;
	}

	public void sortear() {
		int indiceAtual = 0;
		int quantidadeParticipantes = participantes.size();

		while (indiceAtual < quantidadeParticipantes) {
			if (indiceAtual == participantes.size() - 1) {
				Par par = new Par(participantes.get(indiceAtual), participantes.get(indiceAtual + 1), sorteio);
				sorteio.adicionaPar(par);
				break;
			}
			Par par = new Par(participantes.get(indiceAtual), participantes.get(indiceAtual + 1), sorteio);
			sorteio.adicionaPar(par);
		}
	}

}
