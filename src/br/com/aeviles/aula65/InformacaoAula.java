package br.com.aeviles.aula65;

@interface InformacaoAula {

	String autor();
	int aulaNumero();
	String linkedin() default "https://www.linkedin.com/in/aeviles-aguiar-silva/";
	
}
