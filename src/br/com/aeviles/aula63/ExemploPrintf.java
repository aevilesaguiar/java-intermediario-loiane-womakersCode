package br.com.aeviles.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.println("Esta e uma string");
		System.out.printf("Hello %s", "Ola, Mundo");
		System.out.println("\n");
		System.out.printf("Qual o seu nome %s", "My name is Anne");
		System.out.printf("%S", " Ola, Mundo!!!");
		System.out.println("\n");
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');
		System.out.println();
		int valor = 1234567890;

		System.out.printf("%d", valor);
		System.out.println();

		double pontoFlutuante = 3.145698989;
		System.out.printf("%f", pontoFlutuante);
		System.out.println();

		String olaMundo = "Olá, Mundo";
		System.out.printf("%20s", olaMundo);
		System.out.printf("%-20s", olaMundo);

		System.out.println("\n");

		System.out.printf("%+d", valor);

		System.out.println("\n");

		System.out.printf("%015d", valor);// ele completa com 0 até 15 digitos
		System.out.println("\n");

		System.out.printf("%,d", valor);// separar milhares
		System.out.println("\n");

		int valor2 = -1234567890;
		System.out.printf("%d", valor2);// irá aparecer o numero negativo

		System.out.println("\n");
		System.out.printf("%.4f", pontoFlutuante);// ele permite apenas 4 digitos após a vírgula

		System.out.println("\n");
		System.out.printf("R$%8.4f", pontoFlutuante); // limita o total de 8 digitos e 4 digitos após a vívula

		testeMaisCompleto();
	}

	private static void testeMaisCompleto() {
		double[] precos = { 10000, 123.54, 7843.542, 12, 4.895674, 0.56 };

		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", (i + 1), precos[i]);
		}

		// Java.util.Formater
	}

}
