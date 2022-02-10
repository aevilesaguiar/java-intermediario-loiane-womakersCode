package br.com.aeviles.aula85_100;

public class Aula85Math {

	public static void main(String[] args) {

		System.out.println(Math.pow(2, 3));
		
		System.out.println(Math.round(4.7));
		System.out.println(Math.round(4.4));
		//arredondar numero para cima
		System.out.println(Math.ceil(4.4));
		System.out.println(Math.ceil(6.7));
		//arredondar numero para baixo
		System.out.println(Math.floor(4.4));
		System.out.println(Math.floor(5.1));
		//função para gerae numero aleatório
		System.out.println(Math.round(Math.random()*100));
		
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(1)));
		System.out.println(Math.tan(Math.toRadians(45)));
	}

}
