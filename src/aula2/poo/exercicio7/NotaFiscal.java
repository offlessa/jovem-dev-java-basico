package aula2.poo.exercicio7;

public class NotaFiscal {

	String emitente;
	double valor;

	public NotaFiscal(String emitente) {
		this.emitente = emitente;
	}

	public void calculaValor(double precoBruto, double desconto) {
		this.valor = precoBruto - desconto;
	}

	public String getEmitente() {
		return emitente;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Emitente: " + emitente + ", Valor: R$ " + valor;
	}

}