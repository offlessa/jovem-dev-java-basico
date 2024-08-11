package avaliacao.semana2.herois;

import avaliacao.semana2.Personagem;
import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public class Paladino extends Personagem {

	public Paladino() {
		super("Paladino", 50, 50, 20, 19);
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
