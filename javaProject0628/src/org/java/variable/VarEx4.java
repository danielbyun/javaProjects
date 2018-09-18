package org.java.variable;

public class VarEx4 {
	public static void main(String[] args) {
		System.out.println("자바의 변수 자료형(타임)");
		
		System.out.println("자바의 기본자료형(타입)...primitive types");
		
		System.out.println("정수형 자료형(type)");
		byte b = 10; //  1byte -128 ~ +127
		short s = 10; // 2byte (-2^15) ~ (2^15 - 1)
		int i = 10; // 4 byte -2^31 ~ + 2^31 - 1
		long l = 10; // 8 byte -2^63 ~ + 2^63 - 1
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println("실수형 자료형(타임)");
		
		//float uses 4 bytes.
		float f = 1.1f; 
				
		// double is the standard, not float
		double d = 1.1; // 8byte
		
		System.out.println("문자형 자료형(type)");
		
		char ch = 'a'; // 2 bytes damn!
		
		System.out.println("논리형 자료형(type)");
		
		boolean bool = false; // 1 byte
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
	}
}
