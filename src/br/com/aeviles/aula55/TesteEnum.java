package br.com.aeviles.aula55;

import br.com.aeviles.aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values();
		
		//saidas de todos os enumeradores dias da semana
		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		System.out.println("----------Obter todos os valores dentro do enum através do For Melhorado--------------");
		
		for (DiaSemana diaSemana : DiaSemana.values()) {
			System.out.println(diaSemana);
		}
	}

}
