package aula5.stream;

import java.util.ArrayList;
import java.util.Optional;

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

		Optional<String> nomesBerto = nomes.stream().filter(nome -> nome.endsWith("berto")).findFirst();

		System.out.println(nomesBerto);
		
		throw new ZeroBertoException("nenhum nome terminado em 'berto' ");

	}
		
}

















/* nomeComTerminoBerto.ifPresentOrElse(
        System.out::println,
        () -> { throw new ZeroBertoException("Nenhum nome termina com 'berto'."); }
