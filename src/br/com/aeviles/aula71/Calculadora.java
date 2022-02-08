package br.com.aeviles.aula71;

public class Calculadora {

	private int soma;

	public synchronized int somaArray(int[] array) {
		// synchronized apenas uma thread pode acessar um método por vez
		soma = 0;

		for (int i = 0; i < array.length; i++) {
			soma += array[i];

			System.out.println("Executando a soma " + Thread.currentThread().getName() + // a thread atual que está
																							// usando esse recurso
					" somando o valor " + array[i] + " com total de " + soma);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //
		}
		return soma;
	}

}
