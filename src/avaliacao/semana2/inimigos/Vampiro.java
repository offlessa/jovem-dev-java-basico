package avaliacao.semana2.inimigos;

import avaliacao.semana2.Personagem;
import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public class Vampiro extends Personagem {
	
	public Vampiro() {
		super("Vampiro", 35, 35, 10, 10);
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


