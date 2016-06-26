package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		// cursos.forEach(c -> System.out.println(c.getNome()));
		
		/* Filtrando todos os cursos que tem mais de 100 alunos 
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.forEach(c -> System.out.println(c.getNome()));*/
		
		/* Filtrando todos os cursos que tem mais de 100 alunos e exibindo o numero de alunos de cada curso 
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);*/
		
		/* Filtrando todos os cursos que tem mais de 100 alunos e somando o numero de alunos de cada curso 
		int sum = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos)
			.sum();
		System.out.println(sum);*/
		
		/* Todos os curso que contenham mais Java no seu nome */
		cursos.stream().filter(c -> c.getNome().contains("Java")).forEach(c -> System.out.println(c));
	}
}
