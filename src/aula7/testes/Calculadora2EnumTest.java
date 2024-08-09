package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula6.outros.enums.Calculadora2Enum;

public class Calculadora2EnumTest {

    @DisplayName("Testa soma")
    @Test
    void deveRetornarSomaCorreta() {
        int resultado = Calculadora2Enum.SOMA.calcula(5, 3);
        assertEquals(8, resultado, "A soma de 5 e 3 deve ser 8");
    }

    @DisplayName("Testa subtração")
    @Test
    void deveRetornarSubtracaoCorreta() {
        int resultado = Calculadora2Enum.SUBTRACAO.calcula(5, 3);
        assertEquals(2, resultado, "A subtração de 5 e 3 deve ser 2");
    }

    @DisplayName("Testa multiplicação")
    @Test
    void deveRetornarMultiplicacaoCorreta() {
        int resultado = Calculadora2Enum.MULTIPLICACAO.calcula(5, 3);
        assertEquals(15, resultado, "A multiplicação de 5 e 3 deve ser 15");
    }

    @DisplayName("Testa divisão")
    @Test
    void deveRetornarDivisaoCorreta() {
        int resultado = Calculadora2Enum.DIVISAO.calcula(6, 3);
        assertEquals(2, resultado, "A divisão de 6 por 3 deve ser 2");
    }

    @DisplayName("Testa divisão por zero")
    @Test
    void deveRetornarZeroAoDividirPorZero() {
        int resultado = Calculadora2Enum.DIVISAO.calcula(5, 0);
        assertEquals(0, resultado, "A divisão por zero deve retornar 0");
    }
}
