package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {
	public static void main(String[] args) {

		try {

			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));

			int resultado = dividir(num1, num2);
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(null, "Você deve digitar um número inteiro.");
		} catch (ZeroException e) {

			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public static int dividir(int num1, int num2) throws ZeroException {
		if (num2 == 0) {

			throw new ZeroException("O segundo número não pode ser zero");
		}
		return num1 / num2;
	}
}
