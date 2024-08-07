package aula6.outros;

import aula6.outros.enums.Calculadora2Enum;

public class Exercicio3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		for (Calculadora2Enum operacao : Calculadora2Enum.values()) {

			int resultado = operacao.calcula(a, b);

			System.out.println(operacao.getNomeAmigavel() + " de " + a + " e " + b + " é " + resultado);
		}
	}
}
