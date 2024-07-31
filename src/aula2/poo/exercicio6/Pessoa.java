package aula2.poo.exercicio6;

import java.time.LocalDate;

public class Pessoa {

	String nome;
	LocalDate dataNascimento;

	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento;
	}
}