package org.java.variable;

// class > ����� ���� Ÿ�� (definition type)
public class VarSub {
	public int num; // instance member
	public static int num2; // class member
	
					  // local variables
	public void method(int num1, int num2) {
		// local variable
		int sum = num1 + num2;
		System.out.println(sum);
	}
}
