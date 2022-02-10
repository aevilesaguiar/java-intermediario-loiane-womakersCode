package br.com.aeviles.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDate {

	public static void main(String[] args) {
		
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z Z");
		 SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss a Z");
		 SimpleDateFormat day = new SimpleDateFormat("d");
		 SimpleDateFormat mes = new SimpleDateFormat("M");
		 
		 Calendar data = new GregorianCalendar(2022,1,22,14,32,25);
		 
		 System.out.println(sdf.format(data.getTime()));
		 System.out.println(sdf1.format(data.getTime()));
		 System.out.println(day.format(data.getTime()));
		 System.out.println(mes.format(data.getTime()));
		 
		 
		 Date hoje = new Date();
		 System.out.println(sdf.format(hoje));
		 
		 
		 SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
		 String minhaData= "10/02/2022";
		 
		 try {
			Date minhaDataEmDate = sdf2.parse(minhaData);
			System.out.println(minhaDataEmDate);
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 
	
	}

}
