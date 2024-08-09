package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class OperacaoListasTest {

    private List<Integer> numerosTeste;

    @BeforeEach
    void setup() {
        numerosTeste = new ArrayList<>();
    }

    @DisplayName("Testa lista vazia")
    @Test
    void deveRetornarZeroParaSomaEmListaVazia() {
        int resultado = OperacaoListas.calcularSoma(numerosTeste);
        assertEquals(0, resultado, "A soma deve ser zero para uma lista vazia");
    }

    @DisplayName("Testa soma de elementos na lista")
    @Test
    void deveRetornarSomaCorreta() {
        numerosTeste.addAll(Arrays.asList(10, 20, 30));
        int resultado = OperacaoListas.calcularSoma(numerosTeste);
        assertEquals(60, resultado, "A soma deve ser 60");
    }

    @DisplayName("Testa média em lista vazia")
    @Test
    void deveRetornarMenosUmParaMediaEmListaVazia() {
        double resultado = OperacaoListas.calcularMediaAcimaDe50(numerosTeste);
        assertEquals(-1, resultado, "A média deve ser -1 para uma lista vazia");
    }

    @DisplayName("Testa média dos números maiores que 50")
    @Test
    void deveRetornarMediaCorreta() {
        numerosTeste.addAll(Arrays.asList(60, 70, 80));
        double resultado = OperacaoListas.calcularMediaAcimaDe50(numerosTeste);
        assertEquals(70, resultado, "A média deve ser 70");
    }

    @DisplayName("Testa contagem de números 25")
    @Test
    void deveRetornarContagemCorretaDe25() {
        numerosTeste.addAll(Arrays.asList(25, 30, 25, 40));
        int resultado = OperacaoListas.contarNumeros25(numerosTeste);
        assertEquals(2, resultado, "A contagem de números 25 deve ser 2");
    }

    @DisplayName("Testa contagem de números 25 em lista vazia")
    @Test
    void deveRetornarZeroParaContagemEmListaVazia() {
        int resultado = OperacaoListas.contarNumeros25(numerosTeste);
        assertEquals(0, resultado, "A contagem de números 25 deve ser 0 para uma lista vazia");
    }
}
