package br.com.aeviles.aula67;

public class Test {

	//executando tres tarefas ao mesmo tempo, com tempos diferentes
	public static void main(String[] args) {
		MinhaThread thread = new MinhaThread("Thread #1",600);
		//thread.start();
		MinhaThread thread2=new MinhaThread("Thread #2",900);
		
		MinhaThread thread3=new MinhaThread("Thread #3",500);
	}
	


}
