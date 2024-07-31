package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		String emitente1 = JOptionPane.showInputDialog(null, "Digite o nome do emitente da primeira nota fiscal:");
		double precoBruto1 = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Digite o preço bruto do produto da primeira nota fiscal:"));
		double desconto1 = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do desconto da primeira nota fiscal:"));

		NotaFiscal notaFiscal1 = new NotaFiscal(emitente1);
		notaFiscal1.calculaValor(precoBruto1, desconto1);

		String emitente2 = JOptionPane.showInputDialog(null, "Digite o nome do emitente da segunda nota fiscal:");
		double precoBruto2 = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Digite o preço bruto do produto da segunda nota fiscal:"));
		double desconto2 = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do desconto da segunda nota fiscal:"));

		NotaFiscal notaFiscal2 = new NotaFiscal(emitente2);
		notaFiscal2.calculaValor(precoBruto2, desconto2);

		JOptionPane.showMessageDialog(null, "Nota Fiscal 1:\n" + notaFiscal1);
		JOptionPane.showMessageDialog(null, "Nota Fiscal 2:\n" + notaFiscal2);
	}

}