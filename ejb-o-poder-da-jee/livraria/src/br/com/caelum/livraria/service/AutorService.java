package br.com.caelum.livraria.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {
	
	@Inject
	private AutorDao autorDao;
	
	public void adiciona(Autor autor){
		this.autorDao.salva(autor);
	}
}
