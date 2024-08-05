package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {
	public static void main(String[] args) {

		String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
		int quantidadeItens = 0;
		boolean quantidadeValida = false;
		while (!quantidadeValida) {
			try {
				int quantidadeDeItens = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens (entre 1 e 10): "));

				if (quantidadeItens < 1 || quantidadeItens > 10) {

					throw new VendaException("Quantidade de itens deve estar entre 1 e 10.");

				}
				quantidadeValida = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite um número válido.");

			} catch (VendaException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				return;
			}
		}
		Venda venda = new Venda(nomeCliente);

		for (int i = 0; i < quantidadeItens; i++) {
			JOptionPane.showMessageDialog(null, "\nItem " + (i + 1));
			JOptionPane.showInputDialog("Digite o nome do item:");

			double precoItem = 0;
			boolean precoValido = false;
			while (!precoValido) {
				try {
					precoItem = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item: "));

					if (precoItem <= 0) {
						throw new PrecoIncorretoException("O preço deve ser maior que zero.");
					}

					venda.addItem(nomeCliente, precoItem);
					precoValido = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite um número válido.");

				} catch (PrecoIncorretoException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}

		}

		JOptionPane.showMessageDialog(null, "\nDetalhes da venda:");
		JOptionPane.showMessageDialog(null, "Cliente: " + venda.getNomeCliente());
		JOptionPane.showMessageDialog(null, "Itens:");
		for (Item item : venda.getItens()) {
			JOptionPane.showMessageDialog(null, "- " + item.getNome() + ": R$" + item.getPreco());
		}

	}
}
