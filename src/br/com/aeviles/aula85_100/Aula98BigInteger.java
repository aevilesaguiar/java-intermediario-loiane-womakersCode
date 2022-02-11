package br.com.aeviles.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigInteger {

	public static void main(String[] args) {
		//double e float não é adequado para fazer calculos com precisão
		double a=0.03;
		double b=0.04;
		double c=b-a;
		
		System.out.println(c);
		
		BigDecimal _a= new BigDecimal("0.03");
		BigDecimal _b= new BigDecimal("0.04");
		BigDecimal _c= _b.subtract(_a);
		System.out.println(_c);
		
		
		BigDecimal bd1= new BigDecimal("1234567890.012345678901");
		BigDecimal bd2= new BigDecimal("2345678901.1234567890");
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.divide(new BigDecimal(2)));
		
		
		BigInteger bi = new BigInteger("1125879656323");
		System.out.println(bi);
		
		
		
	}

}
