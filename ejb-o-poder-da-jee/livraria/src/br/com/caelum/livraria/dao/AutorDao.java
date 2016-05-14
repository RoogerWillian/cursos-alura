package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorDao {

	@PersistenceContext
	private EntityManager manager;

	public void salva(Autor autor) {
		manager.persist(autor);
	}

	public List<Autor> todosAutores() {
		return manager.createQuery("from Autor", Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = this.manager.createQuery("select a from Autor a WHERE a.id = :id", Autor.class)
				.setParameter("id", autorId).getSingleResult();
		return autor;
	}

}
