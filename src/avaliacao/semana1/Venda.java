package avaliacao.semana1;

import java.util.List;
import java.util.ArrayList;

public class Venda {

	List<ItemVenda> itens;

	public Venda() {

		this.itens = new ArrayList<>();
	}

	public void addItemVenda(String nomeItem, double precoItem) {
		if (precoItem <= 0) {

		}
		ItemVenda item = new ItemVenda(nomeItem, precoItem);
		itens.add(item);
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

}