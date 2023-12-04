package com.learning.Strings.UnicodeValue;

import java.util.Scanner;

public class UnicodeValueApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String 1 :");
		String s1= scan.next();
		char []arr1 = s1.toCharArray();
		UnicodeValue.unicode(arr1);

	}

}
