package com.learn.Strings.AnagramCheck;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheckApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		String str1= scan.nextLine();
		System.out.println("Enter the String 2: ");
		String str2= scan.nextLine();
		char []arr1=str1.toCharArray();
		char []arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String newstr1=new String(arr1);
		String newstr2=new String(arr2);
		if(newstr1==newstr2)
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		



		// TODO Auto-generated method stub

	}

}
