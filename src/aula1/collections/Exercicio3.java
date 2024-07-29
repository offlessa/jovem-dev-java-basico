package aula1.collections;

import javax.swing.JOptionPane;

import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercicio3 {
	public static void main(String[] args) {
		new Exercicio3();

		Random gerador = new Random(20);

		List<Integer> lista = new ArrayList<>();
		int numero;
		for (int i = 0; i < 50; i++) {
			numero = gerador.nextInt(20);
			lista.add(numero);

		}

		Set<Integer> numerosSemRepeticao = new HashSet<>(lista);

		JOptionPane.showMessageDialog(null, numerosSemRepeticao);

	}
}