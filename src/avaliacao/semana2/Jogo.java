package avaliacao.semana2;

import avaliacao.semana2.exceptions.PersonagemDerrotadoException;
import avaliacao.semana2.herois.Barbaro;
import avaliacao.semana2.herois.Mago;
import avaliacao.semana2.herois.Paladino;
import avaliacao.semana2.inimigos.Arok;
import avaliacao.semana2.inimigos.Morcego;
import avaliacao.semana2.inimigos.Urso;
import avaliacao.semana2.inimigos.Vampiro;
import avaliacao.semana2.inimigos.Zumbi;

public class Jogo {
	public static void main(String[] args) {
		Personagem[] herois = { new Mago(), new Barbaro(), new Paladino() };
		Personagem[] inimigos = { new Morcego(), new Zumbi(), new Urso(), new Vampiro(), new Arok() };

		for (Personagem heroi : herois) {
			System.out.println(heroi.getNome() + " está começando a batalha!");
			try {
				for (Personagem inimigo : inimigos) {
					System.out.println("Lutando contra o " + inimigo.getNome());
					heroi.batalhar(inimigo);
				}
				System.out.println(heroi.getNome() + " é o campeão!");
				break;
			} catch (PersonagemDerrotadoException e) {
				System.out.println(e.getMessage());
			}
			System.out.println();
		}
	}
}


/*Erros que encontrei:
 *  1- inversão de vencedor e perdedor - Exemplo: Mago atacou Arok, Mestre Supremo e causou 3 de dano. Vida restante do inimigo: 0/50 
 *  Mago foi derrotado pelo Arok, Mestre Supremo
 *  
 *  2- Batalha continua depois de Arok ser derrotado.
 */