package br.com.aeviles.aula56.labs;

public class Calculadora {
	
	public static void main(String[] args) {
		
		/*Implementar a Calculadora*/
		
		System.out.println("=========Calculadora==============");
		double x = 2.0;
		double y = 3.0;
		
		/*
		for (Operacao op : Operacao.values()) {
			System.out.println(x + " ");
			System.out.println(op.toString() +" " );
			System.out.println(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}*/
		
		for (Operacao op : Operacao.values()) {
			System.out.println(x + " " +op.toString() +" " +y + " = "+op.executarOperacao(x, y));
		}
		
		
		
	}

}
