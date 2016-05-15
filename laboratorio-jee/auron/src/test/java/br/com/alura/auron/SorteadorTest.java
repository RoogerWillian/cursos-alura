package br.com.alura.auron;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.alura.auron.modelo.Participante;
import br.com.alura.auron.modelo.Sorteador;
import br.com.alura.auron.modelo.Sorteio;

public class SorteadorTest {
	
	private Participante p1;
	private Participante p2;
	private Participante p3;
	private List<Participante> participantes = new ArrayList<>();
	private Sorteio sorteio;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Participante();
		p1.setNome("Roger");
		
		p2 = new Participante();
		p2.setNome("Derik");
		
		p3 = new Participante();
		p3.setNome("Natalia");
		
		participantes.add(p1);
		participantes.add(p2);
		participantes.add(p3);
		
		sorteio = new Sorteio();
	}

	@Test
	public void aQuantidaDeParesEParticipanteDeverSerAMesma(){
		int quantidadeParticipante = participantes.size();
		
		Sorteador sorteador = new Sorteador(sorteio, participantes);
		sorteador.sortear();
		int quantidadePares = sorteio.getQuantidadePares();
		
		assertTrue(quantidadePares == quantidadeParticipante);
	}

}
