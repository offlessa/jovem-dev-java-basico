package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio4 {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String nome1 = "Batman";
		String telefone1 = "(11) 9999-8888";
		LocalDate dataNascimento1 = LocalDate.parse("19/02/1972", formatter);

		String nome2 = "Superman";
		String telefone2 = "(21) 7777-6666";
		LocalDate dataNascimento2 = LocalDate.parse("29/02/1938", formatter);

		StringBuilder sb = new StringBuilder();
		sb.append("Dados da primeira pessoa:\n").append("Nome: ").append(nome1).append("\n").append("Telefone: ")
				.append(telefone1).append("\n").append("Data de Nascimento: ").append(formatter.format(dataNascimento1))
				.append("\n\n").append("Dados da segunda pessoa:\n").append("Nome: ").append(nome2).append("\n")
				.append("Telefone: ").append(telefone2).append("\n").append("Data de Nascimento: ")
				.append(formatter.format(dataNascimento2)).append("\n\n");

		String maisVelha;
		if (dataNascimento1.isBefore(dataNascimento2)) {
			maisVelha = nome1;
		} else {
			maisVelha = nome2;
		}

		sb.append("A pessoa mais velha é: ").append(maisVelha);

		System.out.println(sb.toString());
	}
}