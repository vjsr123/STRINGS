package com.learning.StringProgram;

import java.util.Scanner;

public class StringLengthApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1= scan.next();
		int L1= s1.length();
		System.out.println("Enter the String 2: ");
		String s2= scan.next();
		int L2= s2.length();
		StringLength.length(L1,L2);


	}

}
