package br.com.alura.auron.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.alura.auron.modelo.Participante;
import br.com.alura.auron.modelo.Sorteador;
import br.com.alura.auron.modelo.Sorteio;

@Named
@RequestScoped
public class SorteioBean {

	private Sorteio sorteio;
	
	public Sorteio getSorteio() {
		if(this.sorteio == null){
			this.sorteio = new Sorteio();
		}
		return sorteio;
	}
	
	public void sortear(){
		List<Participante> participantes = new ArrayList<>();
		Sorteador sorteador = new Sorteador(sorteio, participantes);
		
		sorteador.sortear();
	}
}
