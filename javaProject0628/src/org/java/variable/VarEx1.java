package org.java.variable;

public class VarEx1 {
	public static void main(String[] args) {		
		for (int variable = 1; variable < 11; variable++) {
			if (variable == 1) {
				System.out.println(variable + " duck");
			} else {
				// print out
				System.out.println(variable + " ducks");
			}
		}
		
		int i;
		i = 10;
		System.out.println(i);
		
		i = 100;
		System.out.println(i);
		
		int i2=120;
		System.out.println(i2);
		
		// add two integers
		System.out.println(i + i2);
		
		String hello = "what's good";
		System.out.println(hello);
	}
}
