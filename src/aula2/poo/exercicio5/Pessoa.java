package aula2.poo.exercicio5;

import java.time.LocalDate;

public class Pessoa {

	String nome;
	LocalDate dataNascimento;
	int idade;

	public Pessoa(String nome, LocalDate dataNascimento, int idade) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public int getIdade() {
		return idade;
	}
}
