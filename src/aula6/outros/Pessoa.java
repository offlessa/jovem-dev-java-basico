package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String nome;
	private String telefone;
	private LocalDate dataNascimento;

	public Pessoa(String nome, String telefone, LocalDate dataNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public int idadeAtual() {
		return LocalDate.now().getYear() - dataNascimento.getYear();
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ").append(nome).append(", Telefone: ").append(telefone).append(", Data de Nascimento: ")
				.append(dataNascimento.format(formatter));
		return sb.toString();
	}
}
