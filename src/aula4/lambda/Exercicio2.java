package aula4.lambda;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Exercicio2 {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();

		alunos.add(new Aluno(1, "Guilherme", LocalDate.of(2003, 10, 31)));
		alunos.add(new Aluno(2, "Vinícius", LocalDate.of(2001, 10, 03)));
		alunos.add(new Aluno(3, "Augusto", LocalDate.of(1995, 03, 10)));
		alunos.add(new Aluno(4, "Bruno", LocalDate.of(2010, 05, 27)));
		alunos.add(new Aluno(5, "Gabriel", LocalDate.of(1990, 11, 02)));

		alunos.sort(Comparator.comparing(Aluno::getDataNascimento));

		alunos.forEach(System.out::println);
	}

}
