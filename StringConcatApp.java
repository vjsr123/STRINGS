package com.learning.StringConcat;

import java.util.Scanner;

public class StringConcatApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String 1 :");
		String s1= scan.next();
		int L1= s1.length();
		System.out.println("Enter the String 2: ");
		String s2= scan.next();
		int L2= s2.length();
		String s3 = StringConcat.concat(L1, L2,s1,s2);
		System.out.println(s3);
		StringConcat.concat(L1, L2,s1,s2);
		// TODO Auto-generated method stub

	}

}
