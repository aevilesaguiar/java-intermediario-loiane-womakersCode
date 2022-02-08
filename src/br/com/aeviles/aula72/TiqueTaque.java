package br.com.aeviles.aula72;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExecutando) {
		
		//enquanto tique estiver executando não passa por esse if
		if (!estaExecutando) {
			tique = true;
			notify();
			return;
		}
		//imprime tique

		System.out.println("Tique ");
		tique = true;
		notify();

		//enquanto for tique , deve esperar
		while (tique) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	synchronized void taque(boolean estaExecutando) {
		
		//enquanto tique estiver executando não passa por esse if
		if (!estaExecutando) {
			tique = false;
			notify();
			return;
		}
		//imprime tique

		System.out.println("Taque ");
		tique = false;
		notify();

		//enquanto for tique , deve esperar
		while (!tique) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
