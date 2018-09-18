package org.java.variable;

public class VarEx3 {
	public static void main(String [] args) {
		System.out.println("naming variables");
		// int int i; 
		
		int num1 = 100; // good
		int _num = 10; // not common
		int $Num = 200; // not common
		int NUM = 20; // good
		int num = 20; // good
		int numSumMember = 100; // good
		int numsummember = 100; // not standard
		// int �ѱ� = 200; // not standard
		
		System.out.println("num1 = " + num1);
		System.out.println("_num = " + _num);
		System.out.println("$Num = " + $Num);
		System.out.println("NUM = " + NUM);
		System.out.println("num = " + num);
		System.out.println("numSumMember = " + numSumMember);
		System.out.println("numsummember = " + numsummember);
		// System.out.println("�ѱ� = " + �ѱ�);
	}
}
