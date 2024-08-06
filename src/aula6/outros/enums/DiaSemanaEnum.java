package aula6.outros.enums;

public enum DiaSemanaEnum {
	DOMINGO("Domingo", true),
	SEGUNDA("Segunda-Feira", false),
	TERÇA("Terça-Feira", false),
	QUARTA("Quarta-Feira", false),
	QUINTA("Quinta-Feira", false),
	SEXTA("Sexta-Feira", false),
	SÁBADO("Sábado", true);
	



private String nome;
private final boolean isFimDeSemana;

DiaSemanaEnum(String nome, boolean isFimDeSemana) {
    this.nome = nome;
    this.isFimDeSemana = isFimDeSemana;
}

public String getNome() {
    return nome;
}
    
public boolean getIsFimDeSemana() {
    return isFimDeSemana;
}

@Override

public String toString() {
	
	return nome + (" É fim de semana?" + "(" + isFimDeSemana + ")" );
	
}

}
