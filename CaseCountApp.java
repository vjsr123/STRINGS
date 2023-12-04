package com.learning.CaseCount;

import java.util.Scanner;

public class CaseCountApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String");
		String str =scan.next();
		char []arr=str.toCharArray();
		CaseCount.casecount(arr);
		// TODO Auto-generated method stub

	}

}
