package br.com.aeviles.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Ana Maria", "(11)1234-5678", "ana@email.com.br");
		int valor = 10;
		System.out.println("========Valore Originais========");
		System.out.println(contato);
		System.out.println(valor);
		System.out.println("============Exemplo 1============");
		testePassagemValorReferencia(valor, contato);
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("============Exemplo 2============");
		testePassagemValorReferencia2(valor, contato);
		System.out.println(contato);
		System.out.println(valor);

	}

	private static void testePassagemValorReferencia(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Inez Silva", "(11)2345-6789", "inez@email.com");
	}

	private static void testePassagemValorReferencia2(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato: " + novoValor);
	}

}
