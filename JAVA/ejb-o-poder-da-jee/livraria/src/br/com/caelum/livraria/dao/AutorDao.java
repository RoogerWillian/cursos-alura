package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Autor;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AutorDao {

	@PersistenceContext
	private EntityManager manager;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void salva(Autor autor) {
		manager.persist(autor);
	}

	public List<Autor> todosAutores() {
		return manager.createQuery("from Autor", Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = this.manager.createQuery("select a from Autor a where a.id = :id",Autor.class)
				.setParameter("id", autorId)
				.getSingleResult();
		return autor;
	}

}
