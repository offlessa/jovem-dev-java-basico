package aula6.outros.enums;

import aula6.outros.CalculoInterface;

public enum Calculadora1Enum {
	
	SOMA("Soma", (a, b) -> a + b),
	SUBTRAÇÃO("Subtração", (a, b) -> a - b),
	DIVISÃO("Divisão", (a, b) -> a / b),
	MULTIPLICAÇÃO ("Multiplicação", (a, b) -> a * b);
	
	private final String nomeAmigavel;
	private final CalculoInterface operacao;
	
	Calculadora1Enum (String nomeAmigavel, CalculoInterface operacao) {
		this.nomeAmigavel = nomeAmigavel;
		this.operacao = operacao;
	}

	public String getNomeAmigavel() {
	    return nomeAmigavel;
	}
	    
	public CalculoInterface getOperacao() {
	    return operacao;
	}

	@Override

	public String toString() {
		
		return nomeAmigavel + ("Soma" + (SOMA) + "Subtração" + (SUBTRAÇÃO) + "Divisão" + (DIVISÃO) + "Multiplicação" + (MULTIPLICAÇÃO));
		
	}

	}