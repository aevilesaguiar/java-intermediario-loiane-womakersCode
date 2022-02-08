package br.com.aeviles.aula69;

public class MinhaThreadRunnable implements Runnable {

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		
	//	Thread t = new Thread(this);//instanciou a thread 
	//	t.start();

	}

	// método obrigatório quando implemento Runnable
	@Override
	public void run() {

		try {
			for (int i = 0; i < 6; i++) {

				System.out.println(nome + " contador " + i);
			}
			Thread.sleep(tempo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Terminou a execução");
	}

}
