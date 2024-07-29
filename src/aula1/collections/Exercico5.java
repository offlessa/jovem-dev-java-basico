package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;

public class Exercico5 {

	public static void main(String[] args) {

		Set<Integer> conjunto1 = new HashSet<>();
		Set<Integer> conjunto2 = new HashSet<>();

		preencher(conjunto1);
		preencher(conjunto2);
		
		JOptionPane.showMessageDialog(null,"Conjunto 1: " + conjunto1);
		JOptionPane.showMessageDialog(null,"Conjunto 2: " + conjunto2);

		conjunto1.retainAll(conjunto2);

		JOptionPane.showMessageDialog(null,"Números presentes em ambos os conjuntos: " + conjunto1);
	}

	public static void preencher(Set<Integer> conjunto) {
		Random random = new Random();
		while (conjunto.size() < 10) {
			int numero = random.nextInt(30) + 1;
			conjunto.add(numero);
		}
	}
}
