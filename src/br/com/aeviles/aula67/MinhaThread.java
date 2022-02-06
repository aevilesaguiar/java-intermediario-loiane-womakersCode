package br.com.aeviles.aula67;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	// Construtor
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo=tempo;
		start();// incluindo dentro do contrutor já executa a thread
	}

	public void run() {

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				//exceção verificada 
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nome+" terminou a execucao");
		
	}
}
