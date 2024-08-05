package aula5.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio4 {

	public static void main(String[] args) {

		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Guilherme", "991234567", LocalDate.of(2003, 10, 31)),
				new Pessoa("Guilherme", "991234567", LocalDate.of(2003, 10, 31)),
				new Pessoa("João", "994536789", LocalDate.of(1995, 05, 27)),
				new Pessoa("Carol", "998765456", LocalDate.of(2010, 02, 05)),
				new Pessoa("Alice", "991463780", LocalDate.of(2000, 05, 10)),
				new Pessoa("Caio", "991213476", LocalDate.of(2001, 06, 30)),
				new Pessoa("Bruno", "991098775", LocalDate.of(1990, 03, 17)),
				new Pessoa("Jehnnifer", "991198854", LocalDate.of(1997, 07, 02)),
				new Pessoa("Augusto", "991224513", LocalDate.of(2024, 05, 01)),
				new Pessoa("Théo", "991667810", LocalDate.of(1980, 03, 19)));

		pessoas.stream().filter(p -> p.getDataNascimento().getMonthValue() == 5)
				.sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome())).collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
