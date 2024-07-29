package aula1.collections;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {

		Map<String, double[]> mapaAlunos = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno " + (i + 1) + ":");

		}

		double[] notas = new double[3];
		for (int j = 0; j < 3; j++) {
			String notaStr = JOptionPane.showInputDialog(null, "Digite a nota " + (j + 1) + " do aluno " + nome + ":");
			notas[j] = Double.parseDouble(notaStr);
		}

		mapaAlunos.put(nome, notas);
	}

}
