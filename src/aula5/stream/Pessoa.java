package aula5.stream;

import java.time.LocalDate;

public class Pessoa {

	String nome;
	String telefone;
	LocalDate dataNascimento;

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

	@Override
	public String toString() {
		return nome;
	}

}
