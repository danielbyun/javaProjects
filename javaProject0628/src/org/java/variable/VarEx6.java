package org.java.variable;

public class VarEx6 {
	public static void main(String[] args) {
		int num = 10;
		char ch = 'a';
		double dbl = 4.20;
		
		VarSub2 class1 = new VarSub2();
		class1.num1 = 5;
		class1.num2 = 10;
		
		// accessed the method we provided in the VarSub2 file
		class1.add(69, 420);
		
		class1.speak("barkbark haha", "what's up");
		
		class1.forLoop(0, 20);
		
		System.out.println(num);
		System.out.println(ch);
		System.out.println(dbl);
	}
}
