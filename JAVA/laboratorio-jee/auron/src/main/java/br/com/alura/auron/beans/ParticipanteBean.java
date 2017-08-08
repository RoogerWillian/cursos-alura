package br.com.alura.auron.beans;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import br.com.alura.auron.dao.ParticipanteDao;
import br.com.alura.auron.modelo.Participante;

@Named
@RequestScoped
public class ParticipanteBean {

	@Inject
	private ParticipanteDao dao;

	private Participante participante;
	
	@Inject
	private Subject user;
	
	@Inject
	private FacesContext context;
	
	public void cadastrar() {
		dao.inserir(participante);
		participante = new Participante();
	}

	public List<Participante> getParticipantes() {
		return this.dao.findAll();
	}

	public Participante getParticipante() {
		if (participante == null) {
			this.participante = new Participante();
		}
		return participante;
	}

	public String login() {
		try {
			UsernamePasswordToken token = new UsernamePasswordToken(participante.getEmail(), participante.getSenha());
			user.login(token);
			return "sorteio?faces-redirect=true";
		} catch (AuthenticationException e) {
			context.addMessage(null, new FacesMessage("Usuário ou senha incorretos"));
		}
		return null;
	}
}
