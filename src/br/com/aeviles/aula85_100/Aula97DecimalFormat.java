package br.com.aeviles.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class Aula97DecimalFormat {

	public static void main(String[] args) {
	
		//Decimal format é filha de Number format
		//cada jogo da velha é um digito
		

		String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);
		
		// df.applyPattern(padrao);
		System.out.println(df.format(1234567890.123));
		
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');//para separar os decimais utilizamos o char
		dfs.setGroupingSeparator('.');
		
		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(1234567890.123));
		
		String padrao3 = "###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);
		System.out.println(df.format(1234567890.123));
		
		String padrao4 = "###,###,###.00";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(1234567890.123));
		System.out.println(df.format(0.1));
		
		String padrao5 = "###,###,##0.00";
		df = new DecimalFormat(padrao5, dfs);
		System.out.println(df.format(0.15));
		
		String padrao6 = "\u00A4###,###,000.00%";
		df = new DecimalFormat(padrao6, dfs);
		System.out.println(df.format(0.15));
		
		
	}

}
