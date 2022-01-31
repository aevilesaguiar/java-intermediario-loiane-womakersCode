package br.com.aeviles.aula53;

public class Teste {

	public static void main(String[] args) {
		usandoConstantes();
		usandoEnum();

	}
	
	private static void usandoConstantes() {
		int segunda= DiaSemanaConstantes.SEGUNDA;
		int terca= DiaSemanaConstantes.TERCA;
		int quarta= DiaSemanaConstantes.QUARTA;
		int quinta= DiaSemanaConstantes.QUINTA;
		int sexta= DiaSemanaConstantes.SEXTA;
		int sabado= DiaSemanaConstantes.SABADO;
		int domingo= DiaSemanaConstantes.DOMINGO;
		System.out.println("Teste utilizando constantes no java");
		imprimeDiaSemana(domingo);
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
	}

	private static void imprimeDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Segunda-Feira");
			break;
		case 2:
			System.out.println("Terça-Feira");
			break;
		case 3:
			System.out.println("Quarta-Feira");
			break;
		case 4:
			System.out.println("Quinta-Feira");
			break;
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6:
			System.out.println("Sábado-Feira");
			break;
		case 7:
			System.out.println("Domingo-Feira");
			break;

		}
	}

	/*UTILIZANDO ENUM*/
	private static void usandoEnum() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		System.out.println("Teste utilizando enum no java");
	}
	
	private static void imprimeDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-Feira");
			break;
		case TERCA:
			System.out.println("Terça-Feira");
			break;
		case QUARTA:
			System.out.println("Quarta-Feira");
			break;
		case QUINTA:
			System.out.println("Quinta-Feira");
			break;
		case SEXTA:
			System.out.println("Sexta-Feira");
			break;
		case SABADO:
			System.out.println("Sábado-Feira");
			break;
		case DOMINGO:
			System.out.println("Domingo-Feira");
			break;

		}
	}
	
}
