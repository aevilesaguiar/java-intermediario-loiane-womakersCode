package br.com.aeviles.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {

	public static void main(String[] args) {

		System.out.println("Locale utilizado:"+Locale.getDefault());
		
		//resource bundle geralmente é criado na raiz do projeto
		//dentro da pasta source"src"
		
		ResourceBundle rb= ResourceBundle.getBundle("meu-texto");
		
		
		System.out.println("Hello EN: "+rb.getString("hello"));
		System.out.println("World EN: "+rb.getString("world"));
		System.out.println("Mensagem: "+rb.getString("hello")+" "+rb.getString("world"));
				
		
		//Locale.setDefault(new Locale("pt-BR", "pt_BR"));
		rb=ResourceBundle.getBundle("meu-texto", new Locale("pt-BR", "pt_BR"));
		
		System.out.println("Olá pt_BR: "+ rb.getString("hello"));
		System.out.println("Mundo pt_BR: "+rb.getString("world"));
		
	}

}
