package br.com.aeviles.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);

		System.out.println(Locale.getDefault());

		// Locale.setDefault(new Locale("pt", "Brazil"));
		

		Locale.setDefault(new Locale("en", "US"));

		//Transformar de Data para String , pois o método format retorna uma string
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		//pegar uma string e transformar em data, se atentar ao formato da data
		
		String data = "10-02-2022 17:03";
		
		try {
			Date dataDate=DateFormat.getInstance().parse(data);
			System.out.println(dataDate);
			
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);
			
			System.out.println(calendario);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
