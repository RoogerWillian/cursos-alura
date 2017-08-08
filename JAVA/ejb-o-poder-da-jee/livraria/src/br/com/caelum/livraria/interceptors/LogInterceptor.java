package br.com.caelum.livraria.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
public class LogInterceptor {

	@AroundInvoke
	public Object logar(InvocationContext context) throws Exception {
		long millis = System.currentTimeMillis();

		// chamada do método do dao
		Object o = context.proceed();
		String metodo = context.getMethod().getName();
		String className = context.getTarget().getClass().getName();
		System.out.print(className + " | " + metodo);
		System.out.println("   Tempo gasto: " + (System.currentTimeMillis() - millis));

		return o;
	}
}
