package br.com.alura.auron.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.alura.auron.modelo.Participante;

@Stateless
public class ParticipanteDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void inserir(Participante participante){
		this.em.persist(participante);
	}

	public List<Participante> findAll() {
		return em.createQuery("select p from Participante p", Participante.class).getResultList();
	}
}
