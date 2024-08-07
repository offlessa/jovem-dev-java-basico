package aula6.outros.enums;

import java.util.function.BiFunction;

public enum Calculadora2Enum {
    SOMA("Soma", (a, b) -> a + b),
    SUBTRACAO("Subtração", (a, b) -> a - b),
    DIVISAO("Divisão", (a, b) -> b != 0 ? a / b : 0),  
    MULTIPLICACAO("Multiplicação", (a, b) -> a * b);

    private final String nomeAmigavel;
    private final BiFunction<Integer, Integer, Integer> calculo;

    Calculadora2Enum(String nomeAmigavel, BiFunction<Integer, Integer, Integer> calculo) {
        this.nomeAmigavel = nomeAmigavel;
        this.calculo = calculo;
    }

    public String getNomeAmigavel() {
        return nomeAmigavel;
    }

    public int calcula(int a, int b) {
        return calculo.apply(a, b);
    }
}