package avaliacao.semana2.exceptions;

public class PersonagemDerrotadoException extends Exception {
	public PersonagemDerrotadoException (String atacante, String inimigo) {
		super(atacante + " foi derrotado pelo " + inimigo);
	}
	

}


/*Erro de inversão de vencedor e perdedor - Exemplo: Mago atacou Arok, Mestre Supremo e causou 3 de dano. Vida restante do inimigo: 0/50
Mago foi derrotado pelo Arok, Mestre Supremo*/