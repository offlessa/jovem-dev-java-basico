package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;
import aula5.stream.Desafio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Pessoa;

class DesafioTest {

	public List<Pessoa> listaPessoas;

	@BeforeEach
	void setup() {
		listaPessoas = new ArrayList<>();
	}

	@DisplayName("Testa lista vazia")
	@Test

	void deveRetornarListaVaziaParaListaVazia() {
		List<String> resultado = Desafio.filtrarPessoas(listaPessoas);
		assertTrue(resultado.isEmpty(), "A lista deve estar vazia");

	}

	@DisplayName("Testa lista com elementos válidos e inválidos.")
	@Test

	void deveRetornarNomesFiltradosEOrdenados() {
		listaPessoas.add(new Pessoa("Alice", "991234567", LocalDate.of(2003, 10, 31)));
		listaPessoas.add(new Pessoa("Bruno", "991098775", LocalDate.of(1990, 3, 17)));
		listaPessoas.add(new Pessoa("Théo", "991234567", LocalDate.of(2020, 2, 29)));
		listaPessoas.add(new Pessoa("Guilherme", "991234567", LocalDate.of(2003, 10, 31)));

		List<String> resultado = Desafio.filtrarPessoas(listaPessoas);

		List<String> esperado = Arrays.asList("Théo", "Ana");
		assertEquals(esperado, resultado);

	}

}
