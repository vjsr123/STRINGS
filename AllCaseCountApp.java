package com.learn.Strings.AllCaseCount;

import java.util.Scanner;

public class AllCaseCountApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Taking user input
		System.out.println("Enter the String ");
		//Storing the String in variable
		String str=scan.nextLine();
		//Method invoking
		AllCaseCount.allcasecount(str);
	}

}
