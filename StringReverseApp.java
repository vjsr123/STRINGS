package com.learning.StringReverse;

import java.util.Scanner;

public class StringReverseApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str= scan.next();
		char []arr = str.toCharArray();
		int size = str.length();
		char []revarr=new char [size];
		String revstr = StringReverse.reversestring(arr,str,revarr);
		System.out.println("The reverse of the String : "+revstr);
		StringReverse.reversestring(arr,str,revarr);
	}

}
