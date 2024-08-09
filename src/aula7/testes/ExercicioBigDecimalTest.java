package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import aula6.outros.Exercicio5;

import java.math.BigDecimal;

class ExercicioBigDecimalTest {

	@Test
	void deveCalcularRaioCorretamente() {

		int circunferencia = 31;
		BigDecimal esperado = new BigDecimal("4.9265");

		BigDecimal resultado = Exercicio5.calcularRaio(circunferencia);

		assertEquals(esperado, resultado, "O raio deve ser 4.9265 para uma circunferência de 31.");
	}

	@Test
	void deveRetornarZeroParaCircunferenciaZero() {

		int circunferencia = 0;
		BigDecimal esperado = new BigDecimal("0.0000");

		BigDecimal resultado = Exercicio5.calcularRaio(circunferencia);

		assertEquals(esperado, resultado, "O raio deve ser zero para uma circunferência de zero.");
	}

	@Test
	void deveRetornarRaioNegativoParaCircunferenciaNegativa() {

		int circunferencia = -31;
		BigDecimal esperado = new BigDecimal("-4.9265");

		BigDecimal resultado = Exercicio5.calcularRaio(circunferencia);

		assertEquals(esperado, resultado, "O raio deve ser -4.9265 para uma circunferência de -31.");
	}
}
