package br.com.aeviles.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		
		System.out.println(tz);
		
		//para saber os fusoHorarios de java
		
		/*
		 * String[] fusos = TimeZone.getAvailableIDs(); for (String fuso : fusos) {
		 * System.out.println(fuso); }
		 */
		
		//definir um fusoHORARIO padrão
		
		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
		System.out.println(tzSP.getDisplayName());
		System.out.println(tzSP.getID());
		
		
		//salvar um horario que estou agora e converter e salvar em algum lugar
		//como se fosse um horario do Brasil
		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraSP = Calendar.getInstance(tzSP);
		System.out.println(agoraSP.getTimeZone());
		System.out.println(sdf.format(agoraSP.getTime()));
		
		agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset((System.currentTimeMillis())) / 1000 / 60/ 60);
		System.out.println(sdf.format(agoraSP.getTime()));
		
		

	}

}
