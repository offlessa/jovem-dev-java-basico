package aula2.poo.exercicio4;

public class Principal {
	public static void main(String[] args) {

		Carro carro1 = new Carro("Fusca", 1987, "Azul");
		Carro carro2 = new Carro("Clio", 2010, "Cinza");
		Carro carro3 = new Carro("Civic", 2024, "Branco");

		System.out.println(
				"Carro1: \n" + "Modelo: " + carro1.getModelo() + " - Ano: " + carro1.getAno() + " - Cor: " + carro1.getCor());
		System.out.println(
				"Carro2: \n" + "Modelo: " + carro2.getModelo() + " - Ano: " + carro2.getAno() + " - Cor: " + carro2.getCor());
		System.out.println(
				"Carro3: \n" + "Modelo: " + carro3.getModelo() + " - Ano: " + carro3.getAno() + " - Cor: " + carro3.getCor());

	}

}
