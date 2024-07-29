package aula1.collections;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio1 {
	public static void main(String[] args) {
		new Exercicio1();

		Random gerador = new Random();

		List<Integer> lista = new ArrayList<>();
		int numero;
		for (int i = 0; i < 50; i++) {
			numero = gerador.nextInt(100);
			lista.add(numero);

		}
		Collections.sort(lista);

		JOptionPane.showMessageDialog(null, lista);

	}
}
