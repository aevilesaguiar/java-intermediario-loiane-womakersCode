package br.com.aeviles.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {
		//Brasil-pt_BR - dd/MM/yyyy   - 1.000,02
		//EUA-en_US -  MM/dd/yyyy - 1,000.02

		
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);// padr�o pt_BR
		
		//LOCAIS DE INTERNACIONALIZA��O DISPONIVEIS NA API
		
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale loc : locales) {
			System.out.println("Nome: "+loc.getDisplayName());
			System.out.println("Código da língua: "+loc.getLanguage());
			System.out.println("Língua: "+loc.getDisplayLanguage());
			System.out.println("Código País: "+loc.getDisplayCountry());
			System.out.println("*******************************");
		}
		
		
		//No Brasil precisa usar o new Locale ("pt","BR") , e irá mostrar o símbolo de real
		Locale br= new Locale("pt", "Brazil");
		System.out.println(br);
		
		
		Locale.setDefault(br);
		
		System.out.println(Locale.getDefault());
		
		
		NumberFormat nf=NumberFormat.getCurrencyInstance();
		System.out.println(nf);
		System.out.println(nf.format(50000000000000d));
		System.out.println("*******************************");
		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);

		System.out.println(nf1.format(50000000000000d));
		System.out.println("*******************************");
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.ITALY);
		
		System.out.println(nf2.format(50000000000000d));
		System.out.println("*******************************");
	
		
		
	}

}
