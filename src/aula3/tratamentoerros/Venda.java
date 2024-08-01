package aula3.tratamentoerros;

import java.util.List;
import java.util.ArrayList;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;

public class Venda {

	String nomeCliente;
	List<Item> itens;

	public Venda(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.itens = new ArrayList<>();
	}

	public void addItem(String nome, double preco) throws PrecoIncorretoException {
		if (preco <= 0) {
			throw new PrecoIncorretoException("O preço deve ser maior que zero.");

		}
		Item item = new Item(nome, preco);
		itens.add(item);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public List<Item> getItens() {
		return itens;
	}

}
