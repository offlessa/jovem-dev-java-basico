package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		Random lista = new Random();
		for (int i = 0; i < 50; i++) {
			numeros.add(lista.nextInt(100));

		}

		OptionalDouble media = numeros.stream().filter(num -> num > 50).mapToDouble(Integer::doubleValue).average();
		System.out.println("Média dos números maiores que 50: " + media);

	}
}
