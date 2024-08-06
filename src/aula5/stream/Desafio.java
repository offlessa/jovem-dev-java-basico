package aula5.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio {
	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Guilherme", "991234567", LocalDate.of(2003, 10, 31)),
				new Pessoa("Guilherme", "991234567", LocalDate.of(2003, 10, 31)),
				new Pessoa("João", "994536789", LocalDate.of(1995, 5, 27)),
				new Pessoa("Carol", "998765456", LocalDate.of(2010, 2, 5)),
				new Pessoa("Alice", "991463780", LocalDate.of(2000, 5, 10)),
				new Pessoa("Caio", "991213476", LocalDate.of(2001, 6, 30)),
				new Pessoa("Bruno", "991098775", LocalDate.of(1990, 3, 17)),
				new Pessoa("Jehnnifer", "991198854", LocalDate.of(1997, 7, 2)),
				new Pessoa("Anakin", "991224513", LocalDate.of(2024, 5, 1)),
				new Pessoa("Théo", "991667810", LocalDate.of(1980, 3, 19)));

		String resultado = pessoas.stream().filter(p -> {
			char primeiroCaractere = p.getNome().toLowerCase().charAt(0);
			boolean inicioVogal = "aeiou".indexOf(primeiroCaractere) != -1;
			boolean anoBissexto = p.getDataNascimento().isLeapYear();
			return inicioVogal || anoBissexto;
		}).map(Pessoa::getNome).sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.joining("; "));

		System.out.println(resultado);
	}
}
