package br.com.aeviles.aula75_84;

public class Aula80 {

	public static void main(String[] args) {

		String teste = "Isso � um teste. ";
		System.out.println(teste);
		
		//substring -extrai um peda�o da string
		//m�todo muito utilizado  quando estamos fazendo integra��o de sistemas com tipo de arquivo
		//especial flat file
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10,15));

		
		String ola="ol�";
		String mundo=" mundo";
		String olaMundo=ola.concat(mundo); //ola + mundo
		System.out.println(olaMundo);
		
		String espacos = "i s p a � o";
		String semEspacos= espacos.replace('i','e');
		System.out.println(semEspacos);
		
		semEspacos=semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		String nome = " meu nome �: ";
		System.out.println(nome);
		//remove os espa�os que est�o no in�cio e no fim
		System.out.println(nome.trim());
		
	}

}
