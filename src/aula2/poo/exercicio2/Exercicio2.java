package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		String frase1 = JOptionPane.showInputDialog("Digite a primeira frase: ");
		String frase2 = JOptionPane.showInputDialog("Digite a segunda frase: ");

		if (frase1.equals(frase2)) {
			JOptionPane.showMessageDialog(null, "As frases são iguais!");

		} else {
			JOptionPane.showMessageDialog(null, "As frases não são iguais!");

		}

		int qtdFrase1 = frase1.length();
		int qtdFrase2 = frase2.length();

		JOptionPane.showMessageDialog(null,"Quantidade de caracteres frase 1: " + qtdFrase1 + " Quantidade de caracteres frase 2: " + qtdFrase2);

	}

}
