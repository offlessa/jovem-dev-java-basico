package avaliacao.semana2.inimigos;

import avaliacao.semana2.Personagem;
import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public class Morcego extends Personagem {
	public Morcego() {
		super("Morcego", 10, 10, 5, 5);
	}

	@Override
	public void batalhar(Personagem inimigo) throws PersonagemDerrotadoException {
		while (this.hp > 0 && inimigo.hp > 0) {
			this.atacar(inimigo);
			if (inimigo.hp > 0) {
				inimigo.atacar(this);
			}
		}
	}
}