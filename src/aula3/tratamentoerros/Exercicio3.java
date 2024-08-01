package aula3.tratamentoerros;

public class Exercicio3 {
	public static void main(String[] args) {

		try {
			int resultado = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Disparando Arithmetic Exception.");
			e.printStackTrace();
		}

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Disparando NullPointerException.");
			e.printStackTrace();
		}

		try {
			String s = "Guilherme";
			char c = s.charAt(10);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Disparando StringIndexOutOfBoundsException");
			e.printStackTrace();
		}
		try {
			throw new IllegalStateException("Exemplo de IllegalStateException"); 
		} catch (IllegalStateException e) {
			System.out.println("Disparando IllegalStateException:");
			e.printStackTrace();
		}
	}

}
