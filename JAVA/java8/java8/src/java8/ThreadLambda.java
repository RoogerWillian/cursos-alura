package java8;

public class ThreadLambda {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Executando Runnable Thread II")).start();
	}
}
