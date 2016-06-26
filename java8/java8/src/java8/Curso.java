package java8;

public class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public int getAlunos() {
		return alunos;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", alunos=" + alunos + "]";
	}
}
