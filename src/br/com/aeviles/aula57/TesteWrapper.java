package br.com.aeviles.aula57;

public class TesteWrapper {

	public static void main(String[] args) {

		/* Tipos primitivos do Java */
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.5;
		boolean flag = true;
		char a = 'a';

		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);

		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');

		// Integer num13 = new Integer("10000hh");
		Double num14 = new Double("3.5");
		// consigo fazer conversões através das classes Wrappers
		System.out.println(num14.intValue());
		System.out.println(num14.compareTo(num12));
		System.out.println(num14.equals(num6));
		int num15 = (int) num14.longValue();
		int num16 = Integer.parseInt("10000");
		double num17 = Double.parseDouble("3.555");
		System.out.println(num17);

		Integer num18 = Integer.valueOf(1343);
		System.out.println(num18);

		System.out.println(num9 == num15);

	}

}
