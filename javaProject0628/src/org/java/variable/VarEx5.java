package org.java.variable;

public class VarEx5 {
	public static void main(String[] args) {
		System.out.println("º¯¼ö (variable)");
		
		// directly assigning a value to a variable (primitive data type)
		int num = 10;
		char ch = 'a';
		double dbl = 4.20;
		
		// str == object reference variable
		String str = new String("what's good");
//		String str = "What's good";
		System.out.println(str.length());
		System.out.println(str.toString());
		System.out.println(str.toUpperCase());
		
		System.out.println(num);
		System.out.println(ch);
		System.out.println(dbl);
	}
}
