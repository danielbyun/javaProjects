package org.java.variable;
import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		System.out.println("what is your username: ");
		
		Scanner scn = new Scanner(System.in);
		String myline = scn.nextLine();
		
		System.out.println("your username is: " + myline);
		
		scn.close();
	}
}
