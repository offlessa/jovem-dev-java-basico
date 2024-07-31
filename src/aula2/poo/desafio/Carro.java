package aula2.poo.desafio;

public class Carro {
	String modelo;
	int ano;

	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int calcularIdade(int anoAtual) {
		return anoAtual - ano;
	}

	@Override
	public String toString() {
		return "Modelo: " + modelo + ", Ano: " + ano;
	}
}