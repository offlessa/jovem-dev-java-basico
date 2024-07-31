package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		Map<Character, List<String>> mapa = new HashMap<>();
		mapa.put('a', new ArrayList<>());
		mapa.put('e', new ArrayList<>());
		mapa.put('i', new ArrayList<>());
		mapa.put('o', new ArrayList<>());
		mapa.put('u', new ArrayList<>());

		while (true) {
			String palavra = JOptionPane.showInputDialog("Digite uma palavra (ou 'fim' para encerrar):");
			if (palavra.equals("fim")) {
				break;
			}
			if (palavra.contains("a")) {
				mapa.get('a').add(palavra);
			}
			if (palavra.contains("e")) {
				mapa.get('e').add(palavra);
			}
			if (palavra.contains("i")) {
				mapa.get('i').add(palavra);
			}
			if (palavra.contains("o")) {
				mapa.get('o').add(palavra);
			}
			if (palavra.contains("u")) {
				mapa.get('u').add(palavra);
			}
		}

		Collections.sort(mapa.get('a'));
		Collections.sort(mapa.get('e'));
		Collections.sort(mapa.get('i'));
		Collections.sort(mapa.get('o'));
		Collections.sort(mapa.get('u'));

		System.out.println(mapa);
	}

}