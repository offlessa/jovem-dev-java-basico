package aula6.outros;

import aula6.outros.enums.Calculadora1Enum;

public class Exercicio2 {
	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		Calculadora1Enum[] operacoes = Calculadora1Enum.values();

		for (int i = 0; i < operacoes.length; i++) {
			Calculadora1Enum operacao = operacoes[i];
			int resultado = operacao.calcula(a, b);

			System.out.println(operacao.getNomeAmigavel() + resultado);

		}
	}

}
