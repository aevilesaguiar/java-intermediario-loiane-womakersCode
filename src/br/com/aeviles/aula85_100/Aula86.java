package br.com.aeviles.aula85_100;

import java.util.Date;

public class Aula86 {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("Milisegundos desde 1 jan de 1970"+hoje.getTime());
		
		System.out.println(hoje.getDate());
		System.out.println(hoje.getMinutes());
		System.out.println(hoje.getHours());

	}

}
