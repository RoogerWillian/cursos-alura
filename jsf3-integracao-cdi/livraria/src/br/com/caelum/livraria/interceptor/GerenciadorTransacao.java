package br.com.caelum.livraria.interceptor;

import java.io.Serializable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;

import br.com.caelum.livraria.annotation.Transacional;

@SuppressWarnings("serial")
@Transacional
@Interceptor
public class GerenciadorTransacao implements Serializable{

	@Inject
	private EntityManager manager;
	
	@AroundInvoke
	public Object executaTx(InvocationContext contexto) throws Exception {
		// abre transacao
		String method = contexto.getMethod().getName();
		manager.getTransaction().begin();
		System.out.println("Iniciando transacao para o metodo : " + method);
		// chama os daos que precisam de uma transacao
		Object proceed = contexto.proceed();
		
		// commita a transacao
		manager.getTransaction().commit();
		System.out.println("Commitando transacao para o metodo : " + method);
		
		// retorno do metodo que chamaou a transacao
		return proceed;
	}
}
