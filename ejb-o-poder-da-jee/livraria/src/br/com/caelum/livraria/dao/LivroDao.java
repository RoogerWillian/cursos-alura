package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Livro;

@Stateless
public class LivroDao {

	@PersistenceContext
	private EntityManager manager;

	public void salva(Livro livro) {
		this.manager.persist(livro);
	}

	public List<Livro> todosLivros() {
		return this.manager.createQuery("from Livro", Livro.class).getResultList();
	}

}
