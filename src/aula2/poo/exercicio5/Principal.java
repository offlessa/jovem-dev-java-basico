package aula2.poo.exercicio5;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Guilherme", LocalDate.of(2003, 10, 31), 20);
		Pessoa pessoa2 = new Pessoa("Vinícius", LocalDate.of(2001, 10, 03), 22);

		JOptionPane.showMessageDialog(null, "A pessoa mais velha entre " + pessoa1.getNome() + " e "
				+ pessoa2.getNome() + " é: \n" + pessoa2.getNome() + " \nIdade: " + pessoa2.getIdade() + " anos.");

	}

}
