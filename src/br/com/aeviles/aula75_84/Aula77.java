package br.com.aeviles.aula75_84;

import java.util.Arrays;

public class Aula77 {

	public static void main(String[] args) {
		String java="java";
		
		//acessar cada caractere 

		for (int i = 0; i < java.length(); i++) {
			System.out.println(java.charAt(i));
		}
		
		//extrair caracteres da string e atribuir a um array de chars
		
		
		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.err.println(jav);
		
		
		//seria o mesmo
		
		for (int i = 0,j=0; i < 3; i++,j++) {
			jav[j]=java.charAt(i);
			
		}
		System.out.println(jav);
		
		
		byte[] javBytes = new byte[3];
		java.getBytes(0,3,javBytes,0);
		System.out.println(javBytes);
		
		System.out.println(Arrays.toString(javBytes));//caracteres na tabela ASCII
		
		
		char[] javaChars=java.toCharArray();
		System.out.println(javaChars);
		
		
		
	}

}
