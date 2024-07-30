package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static class Main {
		public static void main(String[] args) {

			double numeroComVirgula = Double.parseDouble(JOptionPane.showInputDialog("Digite um número com vírgula: "));
			JOptionPane.showMessageDialog(null, "A parte inteira do número é: " + (int) numeroComVirgula);

		}
	}
}