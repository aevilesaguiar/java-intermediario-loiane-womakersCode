package br.com.aeviles.aula70;

import br.com.aeviles.aula68.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

		Thread t1 = new Thread(thread1);

		Thread t2 = new Thread(thread2);

		Thread t3 = new Thread(thread3);

		t1.setPriority(5);

		t2.setPriority(3);

		t3.setPriority(1);
		
		//em vez de usar setPriorit podemos utilizar a constante
		
		//t1.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}
