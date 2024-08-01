package aula4.lambda;

import java.util.List;
import java.util.ArrayList;

public class Desafio {
	public static void main(String[] args) {

		List<String> listaStrings = new ArrayList<>();

		listaStrings.add("Guilherme");
		listaStrings.add("Paulo");
		listaStrings.add("João Pedro");
		listaStrings.add("Kauan");
		listaStrings.add("Caio");

		Mostrador mostrador = s -> System.out.println(s.toUpperCase());

		listaStrings.forEach(mostrador::mostra);

	}

}
