package org.java.variable;

public class VarEx2 {
	public static void main(String[] args) {
		System.out.println("what's good");
		
		// whole number = integer variables use 4 bytes of memory
		int i = 50;
		i = i + 100;
		
		// should print 150; and does. boom.
		System.out.println(i);
	}
}
