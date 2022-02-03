package br.com.aeviles.aula54;

public enum DiaSemana {

	SEGUNDA(1), TERCA(2),QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	

	//atributo
	private int valor; 
	
	//Construtor (esse contrutor está sem modificador)
	DiaSemana(int valor) {
		this.valor=valor;
	}
	//método para obter o valor do atributo
	public int getValor() {
		return valor;
	}
	
	
}
