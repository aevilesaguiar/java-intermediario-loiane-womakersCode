package br.com.aeviles.aula71;

public class MinhaThreadSoma implements Runnable{
	
	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora(); //instancia estatica para a classe soma, recurso compartilha a classe calculadora

	
	public MinhaThreadSoma(String nome, int[]nums) {
		this.nome=nome;
		this.nums=nums;
		new Thread(this, nome).start();
		
//		
//		Thread t = new Thread(this,nome);
//		t.start();
//		
	}


	@Override
	public void run() {
		
		System.out.println(this.nome + "Iniciada");
		int soma = calc.somaArray(this.nums);
		
		System.out.println(" Resultado da soma pra a thread "+this.nome+" é: "+soma);
		System.out.println(this.nome + "terminada");
		
	}
}
