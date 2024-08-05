package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Random lista = new Random();
		for (int i = 0; i < 50; i++) {
			numeros.add(lista.nextInt(100));

		
		}
		int soma = numeros.stream().mapToInt(Integer::intValue).sum();
		System.out.println(soma);
	}
}
