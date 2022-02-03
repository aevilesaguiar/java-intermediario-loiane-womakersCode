package br.com.aeviles.aula55;

import br.com.aeviles.aula53.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		//TRANSFORMANDO ELA NUMA PROPRIA INSTANCIA DE ENUMERADOR
		DiaSemana dia =Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(dia);

	}

}
