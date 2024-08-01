package aula4.lambda;

import java.time.LocalDate;

public class Aluno {
	int numeroChamada;
	String nome;
	LocalDate dataNascimento;

	public Aluno(int numeroChamada, String nome, LocalDate dataNascimento) {
		this.numeroChamada = numeroChamada;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public int getNumeroChamada() {
		return numeroChamada;
	}

	public void setNumeroChamada(int numeroChamada) {
		this.numeroChamada = numeroChamada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Número da chamada = " + numeroChamada + " - Nome = " + nome + " - Data de nascimento = "
				+ dataNascimento;

	}

}
