package br.com.aeviles.aula85_100;

import java.util.Random;

public class Aula99RandomAleatorios {

	public static void main(String[] args) {
		 System.out.println(Math.floor(Math.random()*100)); 
		 
		 
		 Random aleatorio = new Random();
		 
		 System.out.println(aleatorio.nextInt(5+1));//limita o numero aleatorio até 5 , por que 5+1 (incluindo o 5)

	}

}
