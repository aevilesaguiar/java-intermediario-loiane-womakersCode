package br.com.aeviles.aula75_84;

public class Aula80 {

	public static void main(String[] args) {

		String teste = "Isso é um teste. ";
		System.out.println(teste);
		
		//substring -extrai um pedaço da string
		//método muito utilizado  quando estamos fazendo integração de sistemas com tipo de arquivo
		//especial flat file
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10,15));

		
		String ola="olá";
		String mundo=" mundo";
		String olaMundo=ola.concat(mundo); //ola + mundo
		System.out.println(olaMundo);
		
		String espacos = "i s p a ç o";
		String semEspacos= espacos.replace('i','e');
		System.out.println(semEspacos);
		
		semEspacos=semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		String nome = " meu nome é: ";
		System.out.println(nome);
		//remove os espaços que estão no início e no fim
		System.out.println(nome.trim());
		
	}

}
