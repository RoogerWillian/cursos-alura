package br.com.alura.xstream;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;

public class ProdutoTest {
	
	
	@Test
	public void deveGerarOXmlComNomePrecoAdequados() {
		String xmlEsperado =  "<produto codigo=\"1587\">\n"+
									"  <nome>Geladeira</nome>\n" +
									"  <preco>1000.0</preco>\n" +
									"  <descrição>geladeira bonita</descrição>\n" +
							   "</produto>";

		Produto geladeira = new Produto(1587, "Geladeira", 1000.0, "geladeira bonita");
		XStream xStream = new XStream();
		
		//
		xStream.alias("produto", Produto.class);
		xStream.aliasField("descrição", Produto.class, "descricao");
		xStream.useAttributeFor(Produto.class, "codigo");
		String xmlGeraldo = xStream.toXML(geladeira);
		System.out.println(xmlGeraldo);
		assertEquals(xmlEsperado,xmlGeraldo);
	}
}
