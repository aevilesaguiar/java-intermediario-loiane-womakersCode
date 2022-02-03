package br.com.aeviles.aula56.labs;

public enum Operacao {
	
	/*Escrever um enum que represente as quatro operações*/
	
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			 
			return x+y;
		}
	}, SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			
			return x-y;
		}
	}, MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			
			return x*y;
		}
	}, DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			
			return x/y;
		}
	};
	
	 private String simbolo;
	 
	 /*construtor que receba as operações*/
	 Operacao(String simbolo) {
		 this.simbolo=simbolo;
	}
	 
	 /*implemente um método abstrat*/
	 
	 public abstract double executarOperacao(double x, double y);
	 
	 
	 /*sobrescreva o metodo toString que retorne o símbolo da operação*/
	 public String toString() {
		 return this.simbolo;
	 }
	 
	 

	
}
