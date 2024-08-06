package aula5.stream;

import java.util.ArrayList;
import java.util.Optional;

import aula5.stream.exceptions.ZeroBertoException.ZeroBertoException;

public class Exercicio5 {
	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Adalberto");
		nomes.add("Zé roberto");
		nomes.add("Alberto");
		nomes.add("Humberto");
		nomes.add("Yuri Alberto");
		nomes.add("Liberto");
		nomes.add("Norberto");
		nomes.add("Aberto");
		nomes.add("Rodoberto");
		nomes.add("Gilberto");

	try {
		Optional<String> nomesBerto = Optional.ofNullable(nomes.stream().filter(nome -> nome.endsWith("berto")).findFirst().orElseThrow(() -> new ZeroBertoException("Nenhum nome termina com 'berto'. ")));

		System.out.println(nomesBerto);
		
		
	}catch (ZeroBertoException e)        {
		System.out.println(e.getMessage());
		
	}

	}
		
}
