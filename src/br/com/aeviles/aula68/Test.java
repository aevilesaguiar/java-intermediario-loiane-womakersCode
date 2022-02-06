package br.com.aeviles.aula68;

public class Test {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 800);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 100);
		MinhaThreadRunnable thread4 = new MinhaThreadRunnable("#4", 1000);
		//está sendo chamado no construtor
		//Thread t1 = new Thread(thread1);
		//t1.start();
	}

}
