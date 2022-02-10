package br.com.aeviles.aula75_84;

public class Aula75 {

	public static void main(String[] args) {
		
		String vazia = new String();//String vazia ""
		System.out.println(vazia);

		String java = new String("JAVA");
		System.out.println(java);

		String java1 = new String(java);
		
		char[] charsDoJava= {'J','A','V','A'};
		String java2 = new String(charsDoJava);
		
		System.out.println(java2);
		
		//arrays de char
		char[] abcdef = {'a','b','c','d','e','f'};
		String abc = new String(abcdef,0,4);//offset- pega as posições 
		System.out.println(abc);
		
		//arrays de byte
		byte[] ascii = {65,66,67,68,69,70,71,72};
		String abcdefgh = new String(ascii);//offset- pega as posições 
		System.out.println(abcdefgh);
		
		
		String bcd=new String(ascii,1,3);
		System.out.println(bcd);
		
		String java3 = "JAVA";
		String java4 = "JAVA";
		
		System.out.println(java3);

		System.out.println(java4);
		
		boolean teste = java3.equalsIgnoreCase(java4);
		System.out.println(teste);
		
		
		
		
		
	}

}
