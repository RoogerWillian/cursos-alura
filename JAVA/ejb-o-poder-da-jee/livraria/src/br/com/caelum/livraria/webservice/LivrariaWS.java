package br.com.caelum.livraria.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.livraria.dao.LivroDao;
import br.com.caelum.livraria.modelo.Livro;

@WebService
@Stateless
public class LivrariaWS {

	@Inject
	private LivroDao dao;
	
	@WebResult(name="livro")
	public List<Livro> getPeloTitulo(@WebParam(name="titulo")String titulo){
		return dao.getPeloTitulo(titulo);
	}
}