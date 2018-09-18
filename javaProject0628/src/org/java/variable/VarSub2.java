package org.java.variable;

// class > definition type
public class VarSub2 {
	
	public int num1; // instance member (field, property)
	public int num2; // instance member (field, property)
	
	// same names but different blocks
	
	// instance member (method)
	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum of the two integers: " + sum);
	}
	
	public void speak(String string1, String string2) {
		System.out.println("The dog says " + string1 + " " + string2);		
	}
	
	public void forLoop(int init, int max) {
		String beginning = "how many ducks are in the pond: ";
		
		for(init = 1; init <= max; init++) {
			if (init == 1) {
				System.out.println(beginning + init + " duck");
			} else {
				System.out.println(beginning + init + " ducks");
			}
		}
	}
}

