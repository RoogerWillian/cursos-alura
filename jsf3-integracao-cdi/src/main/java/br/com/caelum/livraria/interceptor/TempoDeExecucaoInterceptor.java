package br.com.caelum.livraria.interceptor;

import java.io.Serializable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import br.com.caelum.livraria.annotation.Log;

@SuppressWarnings("serial")
@Interceptor
@Log
public class TempoDeExecucaoInterceptor implements Serializable {

	@AroundInvoke
	public Object log(InvocationContext context) throws Exception {

		String className = context.getTarget().getClass().getName();
		String method = context.getMethod().getName();

		long inicio = System.currentTimeMillis();
		Object proceed = context.proceed();
		long fim = System.currentTimeMillis();

		System.out.println("LogInterceptor: " + className + "." + method + "() | Tempo execução : " + (fim - inicio));
		return proceed;
	}

}
