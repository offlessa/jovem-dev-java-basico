package aula2.poo.exercicio8;

public abstract class Veiculo {

	String nome;
	String cor;
	double velocidade;

	public Veiculo(String nome, String cor, double velocidade) {
		this.nome = nome;
		this.cor = cor;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public abstract void acelerar();

	@Override
	public String toString() {
		return "Nome: " + nome + ", Cor: " + cor + ", Velocidade: " + velocidade + " km/h";
	}
}