package br.com.aeviles.aula75_84;

public class Aula79 {

	public static void main(String[] args) {

		String banana = "banana";
		String ana="ana";
		
		//procurar dentro da string banana onde está o caracter -1 elemento não existe,
		//elemento existe retorna 1, 
		System.out.println(banana.indexOf('x'));
		System.out.println(banana.indexOf('a'));
		System.out.println(banana.indexOf('b'));
		
		//a ultima vez que o existe
		System.out.println(banana.lastIndexOf('a'));
		System.out.println(banana.lastIndexOf(ana));
		
		//constains retorna true or false se existe
		
		System.out.println(banana.contains(ana));
		System.out.println(banana.contains("ceu"));
		System.out.println(banana.contains("a"));
		

	}

}
