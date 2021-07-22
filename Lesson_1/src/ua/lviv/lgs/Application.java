package ua.lviv.lgs;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		byte a;
		short b;
		int c;
		long d;

		float e;
		double f;

		boolean g;

		char h;

		System.out.println(Byte.MIN_VALUE + " <= Byte => " + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + " <= Short => " + Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + " <= Integer => " + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + " <= Long => " + Long.MAX_VALUE);

		System.out.println(Float.MIN_VALUE + " <= Float => " + Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + " <= Double => " + Double.MAX_VALUE);
		
		System.out.println();
		
		int[] array1 = {98, 4, -9, 16, 111, -22, 14, 44, 6, 99};

		
	
		/*
		 * for(int k = 0; k < array1.length; k++) { System.out.println(array1[k]); }
		 */
		Arrays.sort(array1);
		
		
		System.out.println("min " + array1[0]);
		System.out.println("max " + (array1[array1.length - 1]));
	}

}

//First commit to gitHub
