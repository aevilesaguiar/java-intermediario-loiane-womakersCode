package br.com.aeviles.aula75_84;

public class Aula83 {

	public static void main(String[] args) {
		String[] letras = {"B", "C", "D","E", "F"};
		
		String alfabeto = "";
		
		//fazendo a concatena��o de letras para dentro da variavel alfabeto
		
		//problemas de performance
		for (String letra : letras) {
			alfabeto+=letra;
		}
		
		System.out.println(alfabeto);
		
		
		//fazemos uma append(adicionar) novas strings e chamando toString fazendo uma string unica
		
		StringBuffer sb= new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);
		}
		
		alfabeto=sb.toString();
		
		System.out.println(alfabeto);
		
		
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		System.out.println(sb.reverse());
		System.out.println(sb.length());


		
		StringBuilder sb_= new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}
		
		alfabeto=sb_.toString();
		
		System.out.println(alfabeto);

		
	}

}
