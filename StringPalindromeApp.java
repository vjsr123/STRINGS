package com.learning.StringPalindrome;

import java.util.Scanner;

import com.learning.StringReverse.StringReverse;

public class StringPalindromeApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str= scan.next();
		char []arr = str.toCharArray();
		int size = str.length();
		char []revarr=new char [size];
		String revstr = StringReverse.reversestring(arr,str,revarr);
		System.out.println("The reverse of the String : "+revstr);
		if(str==revstr)
		{
			System.out.println("The given String is palindrome");
		}
		else
		{
			System.out.println("The given String is not a palindrome");
		}
		StringReverse.reversestring(arr,str,revarr);
		}

}
