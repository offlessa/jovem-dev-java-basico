package aula1.collections;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		String frase = JOptionPane.showInputDialog(null, "Digite uma frase:");

		Map<Character, Integer> contador = new HashMap<>();

		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);

			if (contador.containsKey(caractere)) {
				contador.put(caractere, contador.get(caractere) + 1);
			} else {
				contador.put(caractere, 1);
			}
		}

		JOptionPane.showMessageDialog(null,contador);
	}

}