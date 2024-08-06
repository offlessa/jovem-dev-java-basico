package aula6.outros;

import aula6.outros.enums.DiaSemanaEnum;

public class Exercicio1 {
	public static void main(String[] args) {
		
		DiaSemanaEnum[] dias = DiaSemanaEnum.values();
		
		for (int i = 0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
			
		}
		
	}


