package aula7.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OperacaoListas {

	public static void main(String[] args) {
		List<Integer> numeros = gerarNumerosAleatorios(50);

		int soma = calcularSoma(numeros);
		System.out.println("Soma dos números: " + soma);

		double media = calcularMediaAcimaDe50(numeros);
		if (media != -1) {
			System.out.println("Média dos números maiores que 50: " + media);
		} else {
			System.out.println("Não há números maiores que 50.");
		}

		int count25 = contarNumeros25(numeros);
		System.out.println("Números 25 na lista: " + count25);
	}

	private static List<Integer> gerarNumerosAleatorios(int quantidade) {
		List<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < quantidade; i++) {
			numeros.add(random.nextInt(100));
		}
		return numeros;
	}

	static int calcularSoma(List<Integer> numeros) {
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		return soma;
	}

	static double calcularMediaAcimaDe50(List<Integer> numeros) {
		int soma = 0;
		int contador = 0;
		for (int num : numeros) {
			if (num > 50) {
				soma += num;
				contador++;
			}
		}

		if (contador > 0) {
			return (double) soma / contador;
		} else {
			return -1;
		}
	}

	static int contarNumeros25(List<Integer> numeros) {
		int contador = 0;
		for (int num : numeros) {
			if (num == 25) {
				contador++;
			}
		}
		return contador;
	}
}
