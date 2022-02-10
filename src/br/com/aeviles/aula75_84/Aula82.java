package br.com.aeviles.aula75_84;

public class Aula82 {

	public static void main(String[] args) {
		//juntar strings com join
		String alfabeto = String.join(" ,","A","B","C");
		System.out.println(alfabeto);

		//separar strings com split
		//split muito usado para ler arquivos flat files
		String[] letras = alfabeto.split(", ");
		for (String letra : letras) {
			System.out.println(letra);
		}
		
		
		String doArquivo = "1;Antonio;30;";
		String[] infos =doArquivo.split(";");
		for (String info : infos) {
			System.out.println(info);
		}
		
		
		
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		
		System.out.println(pessoa);
		
		
		
	}

}
