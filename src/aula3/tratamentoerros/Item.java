package aula3.tratamentoerros;

public class Item {
	String nome;
	double preco;

	public Item(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Item:" + nome + "Preço:" + preco;
	}
}
