package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		Random lista = new Random();
		for (int i = 0; i < 50; i++) {
			numeros.add(lista.nextInt(100));

		}

		long num25 = numeros.stream().filter(num -> num == 25).count();

		System.out.println("Números 25 na lista: " + num25);

	}

}
