package br.com.aeviles.aula54;

import br.com.aeviles.aula54.Formulario.Genero;

public class TesteEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString()+ " - "+dia.getValor() );
	
		Data data = new Data(02,02,2022, DiaSemana.QUARTA);
		
		System.out.println(data);
		
		Genero genero = Genero.FEMININO;
		Genero genero2= Genero.MASCULINO;
		
		System.out.println(genero + " - " + genero2);
	
	}
	
	
}
