package aula2.poo.desafio;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<>();
		int ANO_ATUAL = 2024;

		while (true) {

			String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do carro (ou 'fim' para encerrar):");

			if ("fim".equalsIgnoreCase(modelo)) {
				break;
			}

			int ano = 0;
			boolean entradaValida = false;
			while (!entradaValida) {
				try {
					String anoStr = JOptionPane.showInputDialog(null, "Digite o ano do carro:");
					ano = Integer.parseInt(anoStr);
					entradaValida = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Ano inválido.");
				}
			}

			carros.add(new Carro(modelo, ano));
		}

		Collections.sort(carros, new Comparator<Carro>() {
			@Override
			public int compare(Carro c1, Carro c2) {
				return Integer.compare(c1.calcularIdade(ANO_ATUAL), c2.calcularIdade(ANO_ATUAL));
			}
		});

		String carrosOrdenados = "Carros em ordem decrescente de idade:\n";
		for (Carro carro : carros) {
			carrosOrdenados += carro.toString() + "\n";
		}

		JOptionPane.showMessageDialog(null, carrosOrdenados);
	}
}