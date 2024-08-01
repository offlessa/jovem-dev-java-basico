package aula4.lambda;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Exercicio1 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Random lista = new Random();
		for (int i = 0; i < 50; i++) {
			numeros.add(lista.nextInt(100));

		}

		numeros.forEach(numero -> System.out.println(numero));
	}

}
