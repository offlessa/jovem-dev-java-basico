package avaliacao.semana2.herois;

import avaliacao.semana2.Personagem;
import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public class Barbaro extends Personagem{
	public Barbaro() {
		super("Bárbaro", 100, 100, 20, 18);
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



