package br.com.caelum.livraria.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.livraria.annotation.Log;
import br.com.caelum.livraria.modelo.Venda;

@SuppressWarnings("serial")
public class VendaDao implements Serializable {

	@Inject
	private EntityManager manager;

	@Log
	public List<Venda> findAll() {
		return manager.createQuery("from Venda", Venda.class).getResultList();
	}
}
