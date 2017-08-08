package br.com.caelum.livraria.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.livraria.annotation.Log;
import br.com.caelum.livraria.modelo.Autor;

@SuppressWarnings("serial")
public class AutorDao implements Serializable{

	@Inject
	private EntityManager manager;
	
	private DAO<Autor> dao;

	@PostConstruct
	public void init() {
		this.dao = new DAO<Autor>(manager, Autor.class);
	}
	
	@Log
	public void adiciona(Autor t) {
		dao.adiciona(t);
	}

	@Log
	public void remove(Autor t) {
		dao.remove(t);
	}

	@Log
	public void atualiza(Autor t) {
		dao.atualiza(t);
	}

	@Log
	public List<Autor> listaTodos() {
		return dao.listaTodos();
	}

	@Log
	public Autor buscaPorId(Integer id) {
		return dao.buscaPorId(id);
	}

}
