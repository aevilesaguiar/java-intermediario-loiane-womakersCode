package br.com.aeviles.aula74.labs;

public enum CorSemaforo {

	VERDE(1000), AMARELO(300), VERMELHO(2000);

	private int tempoDeEspera;

	CorSemaforo(int tempoEspera) {
		this.tempoDeEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoDeEspera;
	}

}
