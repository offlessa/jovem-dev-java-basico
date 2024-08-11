package avaliacao.semana2;

import java.util.Random;

import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public abstract class Personagem {
	String nome;
	int maxHP;
	public int hp;
	int ataque;
	int defesa;
	private Random dado;

	public Personagem(String nome, int maxHP, int hp, int ataque, int defesa) {
		this.nome = nome;
		this.maxHP = maxHP;
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;
		this.dado = new Random();
	}

	public abstract void batalhar(Personagem inimigo) throws PersonagemDerrotadoException;

	public void atacar(Personagem inimigo) throws PersonagemDerrotadoException {
		int rolarDado = dado.nextInt(6) + 1;
		int ataqueTotal = rolarDado + this.ataque;
		int dano = ataqueTotal - inimigo.defesa;

		if (dano > 0) {
			inimigo.hp -= dano;
			if (inimigo.hp <= 0) {
				System.out.println(this.nome + " atacou " + inimigo.nome + " e causou " + dano 
						+ " de dano. Vida restante do inimigo: " + 0 + "/" + inimigo.maxHP);	
			}else {
			System.out.println(this.nome + " atacou " + inimigo.nome + " e causou " + dano 
					+ " de dano. Vida restante do inimigo: " + inimigo.hp + "/" + inimigo.maxHP); 
			}
			if (inimigo.hp == 0) {
				throw new PersonagemDerrotadoException(this.nome, inimigo.nome);
			}
		} else {
			System.out.println(this.nome + " atacou o " + inimigo.nome + " e falhou.");

		}

	}

	public String getNome() {
		return nome;
	}

	public int getHp() {
		return hp;
	}

}
