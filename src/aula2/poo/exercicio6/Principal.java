package aula2.poo.exercicio6;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Principal {
	public static void main(String[] args) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String nomePessoa = JOptionPane.showInputDialog(null, "Digite o nome da pessoa:");
		String dataNascimentoPessoaStr = JOptionPane.showInputDialog(null,
				"Digite a data de nascimento da pessoa (dd/MM/yyyy):");

		LocalDate dataNascimentoPessoa = null;
		try {
			dataNascimentoPessoa = LocalDate.parse(dataNascimentoPessoaStr, formato);
		} catch (DateTimeParseException e) {
			JOptionPane.showMessageDialog(null, "Data inválida.");
		}

		Pessoa pessoa = new Pessoa(nomePessoa, dataNascimentoPessoa);

		String nomePessoaFisica = JOptionPane.showInputDialog(null, "Digite o nome da pessoa física:");
		String dataNascimentoPessoaFisicaStr = JOptionPane.showInputDialog(null,
				"Digite a data de nascimento da pessoa física (dd/MM/yyyy):");
		String cpfPessoaFisica = JOptionPane.showInputDialog(null, "Digite o CPF da pessoa física:");

		LocalDate dataNascimentoPessoaFisica = null;
		try {
			dataNascimentoPessoaFisica = LocalDate.parse(dataNascimentoPessoaFisicaStr, formato);
		} catch (DateTimeParseException e) {
			JOptionPane.showMessageDialog(null, "Data inválida.");
		}

		PessoaFisica pessoaFisica = new PessoaFisica(nomePessoaFisica, dataNascimentoPessoaFisica, cpfPessoaFisica);

		Pessoa pessoaMaisNova;
		if (pessoaFisica.getDataNascimento().isAfter(pessoa.getDataNascimento())) {
			pessoaMaisNova = pessoaFisica;
		} else {
			pessoaMaisNova = pessoa;
		}

		JOptionPane.showMessageDialog(null, "A pessoa mais nova é:\n" + pessoaMaisNova);
	}
}