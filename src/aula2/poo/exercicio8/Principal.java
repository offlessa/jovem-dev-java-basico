package aula2.poo.exercicio8;

public class Principal {
	public static void main(String[] args) {

		Automovel meuCarro = new Automovel("Ferrari", "Vermelha", 120.0);

		System.out.println(meuCarro);

		meuCarro.acelerar();
	}
}