package ExemploTratamentoErros;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		try {
			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
			System.out.println(d);
		} catch (NumberFormatException e) {
			System.out.println("O valor digitado é inválido.");
			e.printStackTrace();
		}
		System.out.println("Terminando o programa...");
	}

}
