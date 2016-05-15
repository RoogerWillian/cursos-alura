package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.caelum.livraria.modelo.Livro;

@Stateless
public class LivroDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(Livro livro) {
		manager.persist(livro);
	}
	
	public List<Livro> todosLivros() {
		return manager.createQuery("from Livro", Livro.class).getResultList();
	}

	public List<Livro> getPeloTitulo(String titulo) {
		TypedQuery<Livro> query = manager.createQuery("select l from Livro l where l.titulo like :pTitulo",Livro.class);
		query.setParameter("pTitulo", "%" + titulo + "%");
		return query.getResultList();
	}
	
}
