package avaliacao.semana1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class Principal {

	static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	LocalDate dataNascimentoPessoa = null;

	public static void main(String[] args) {

		while (true) {

			String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");

			String dataNascimentoPessoaStr = JOptionPane.showInputDialog(null,
					"Digite a data de nascimento da pessoa (dd/MM/yyyy):");

			LocalDate dataNascimentoPessoa = null;
			try {
				dataNascimentoPessoa = LocalDate.parse(dataNascimentoPessoaStr, formato);
			} catch (DateTimeParseException e) {
				JOptionPane.showMessageDialog(null, "Data inválida.");
			}

			String nomeProduto = JOptionPane.showInputDialog(null,
					"Digite o nome do produto (ou 'fim' para encerrar):");
			if ("fim".equalsIgnoreCase(nomeProduto)) {
				break;
			}

			String precoUnidadeStr = JOptionPane.showInputDialog("Digite o preço por unidade de " + nomeProduto + ":");
			double precoUnidade = Double.parseDouble(precoUnidadeStr);

			int quantidadeProduto = 0;
			boolean quantidadeValida = false;

			while (!quantidadeValida) {
				try {
					int quantidadeDeProdutos = Integer
							.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos (entre 1 e 50): "));

					if (quantidadeDeProdutos < 1 || quantidadeDeProdutos > 50) {

						throw new ProdutoException("Quantidade de produtos deve estar entre 1 e 50.");

					}
					quantidadeValida = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite um número válido.");

				} catch (ProdutoException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
					return;
				}

			}

			Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento: \n "
					+ "1 - Cartão de crédito \n" + "2 - Cartão de débito \n" + "3 - Dinheiro"));

	//		double valorTotal = precoUnidade * quantidadeDeProdutos;

	//		JOptionPane.showMessageDialog(null, "************ CUPOM ************ \n\n" + "\n" + quantidadeDeProdutos
	//				+ "x " + precoUnidade + " ................. " + valorTotal);

		}
	}
}


    // FALTOU FAZER DESCONTOS, NOME MÁSCARADO, METHOD REFERENCE, CUPOM
