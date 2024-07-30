package aula2.poo.exercicio4;

public class Carro {

	String Modelo;
	int Ano;
	String Cor;

	public Carro(String modelo, int ano, String cor) {
		this.Modelo = modelo;
		this.Ano = ano;
		this.Cor = cor;
	}

	public String getModelo() {

		return Modelo;

	}

	public Integer getAno() {

		return Ano;

	}

	public String getCor() {

		return Cor;

	}
}
