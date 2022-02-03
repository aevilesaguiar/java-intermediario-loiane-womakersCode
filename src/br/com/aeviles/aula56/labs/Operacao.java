package br.com.aeviles.aula56.labs;

public enum Operacao {
	
	/*Escrever um enum que represente as quatro opera��es*/
	
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
	 
	 /*construtor que receba as opera��es*/
	 Operacao(String simbolo) {
		 this.simbolo=simbolo;
	}
	 
	 /*implemente um m�todo abstrat*/
	 
	 public abstract double executarOperacao(double x, double y);
	 
	 
	 /*sobrescreva o metodo toString que retorne o s�mbolo da opera��o*/
	 public String toString() {
		 return this.simbolo;
	 }
	 
	 

	
}
