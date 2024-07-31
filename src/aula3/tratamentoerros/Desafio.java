package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Desafio {
	public static void main(String[] args) {
		
		try {
			String nomeCliente = JOptionPane.showInputDialog("Digite o nome do clinte:");
			int qtdItens =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens (1 a 10):"));
			
			if (qtdItens < 1 || qtdItens > 10) {
				
				throw new vendaException("número de itens deve ser entre 1 e 10");
			}
			
			Venda venda = new Venda(nomeCliente);
			
			for (int i = 0; i < qtdItens; i++) {
				
				String nomeItem = JOptionPane.showInputDialog("Digite o nome do item:" + (i+1) + ": ");
				
				double precoItem = -1;
				
			}
		}
		
	}

}
