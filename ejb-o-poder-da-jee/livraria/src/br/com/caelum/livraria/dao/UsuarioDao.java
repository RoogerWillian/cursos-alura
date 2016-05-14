package br.com.caelum.livraria.dao;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

import br.com.caelum.livraria.modelo.Usuario;

@Stateless
public class UsuarioDao {

	@PersistenceContext
	private EntityManager manager;

	public Usuario buscaPeloLogin(String login) {
		return this.manager.createQuery("SELECT u from Usuario u WHERE u.login = :login", Usuario.class)
				.setParameter("login", login).getSingleResult();
	}

}
