package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	String nomeCliente;
	List<Item> itens;

	public Venda(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.itens = new ArrayList<>();
	}

	public void addItem(Item item) {
		itens.add(item);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public List<Item> getItens() {
		return itens;
	}


	@Override
	public String toString() {
		return "nome:" + nomeCliente + "itens:" + itens;
	}
}
