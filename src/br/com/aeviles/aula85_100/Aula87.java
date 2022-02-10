package br.com.aeviles.aula85_100;

import java.util.Calendar;

public class Aula87 {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance();// padrão de projeto singleton

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia= hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		

		System.out.println(hoje);
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(dia);
		System.out.println(hora);
		System.out.println(minutos);
		System.out.println(segundos);
		
		System.out.printf("hoje é dia:%02d/%02d/%d %02d:%02d:%02d",dia, (mes+1), ano, hora, minutos, segundos);
		
		//adicionar e diminuir datas
		hoje.add(Calendar.DAY_OF_MONTH,4);
		hoje.add(Calendar.DAY_OF_MONTH,-4);
		
		System.out.println(Calendar.JANUARY);
		System.out.println(Calendar.FEBRUARY);
		System.out.println(Calendar.MARCH);
	}

}
