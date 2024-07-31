package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		boolean valorValido = false;
		int numero = 0;

		while (!valorValido) {
			try {

				String numValido = JOptionPane.showInputDialog("Digite um número inteiro:");

				numero = Integer.parseInt(numValido);

				valorValido = true;

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido. Tente novamente.");
			}
		}

		JOptionPane.showMessageDialog(null, "Você digitou o número: " + numero);
	}
}