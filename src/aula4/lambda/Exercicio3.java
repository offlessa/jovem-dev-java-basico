package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
	public static void main(String[] args) {
		List<Alunoex3> alunos = new ArrayList<>();

		alunos.add(new Alunoex3("Guilherme"));
		alunos.add(new Alunoex3("Vinícius"));
		alunos.add(new Alunoex3("Thiago"));
		alunos.add(new Alunoex3("Bruno"));
		alunos.add(new Alunoex3("Taylor"));

		alunos.removeIf(aluno -> aluno.getNome().startsWith("T") && aluno.getNome().endsWith("o"));

		alunos.forEach(System.out::println);

	}

}
