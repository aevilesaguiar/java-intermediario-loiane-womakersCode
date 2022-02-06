package br.com.aeviles.aula66;

import br.com.aeviles.aula61.Contato;

public class ColetorDeLixo {
	
	public static void obterMemoriaUsada() {
		final int MB=1024*1024;
		
		Runtime runtime = Runtime.getRuntime();//singleton  só tem uma instancia da classe 

		System.out.println((runtime.totalMemory()-runtime.freeMemory())/MB);
		
	}

	public static void main(String[] args) {

		Contato[] contatos = new Contato[1000000];

		for (int i = 0; i < contatos.length; i++) {
			Contato contato = new Contato("Contato" + i, "123-5656" + i, " contato" + i + "@email.com");

		}
		
		System.out.println("Contatos Criados:");
		
		obterMemoriaUsada();
		
		contatos = null;
		
		Runtime.getRuntime().runFinalization();//executar a finalização do objeto
	
		Runtime.getRuntime().gc();
		System.out.println("Contatos removidos da memoria");
		
		obterMemoriaUsada();
	}

}
