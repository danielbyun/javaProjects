package org.java.variable;

public class VarSubMain {
	public static void main(String[] args) {
		int i = 10;
		
		// 객체 참조 변수 (object reference variable)
		VarSub class1 = new VarSub();
		
		class1.num = 10;
		class1.method(100,  200);
		
		System.out.println(i);
	}
}
