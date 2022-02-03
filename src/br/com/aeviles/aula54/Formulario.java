package br.com.aeviles.aula54;

public class Formulario {
	
	enum Genero{
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		private Genero(char valor) {
			this.valor=valor;
		}

		public char getValor() {
			return valor;
		}

		public void setValor(char valor) {
			this.valor = valor;
		}
		
		
	}
	
	
	private String nome;
	private Genero genero;
	
}
