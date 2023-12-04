package com.learn.Strings.VowelReplace;

import java.util.Scanner;

public class VowelReplaceApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		VowelReplace.replace(str);
		// TODO Auto-generated method stub

	}

}
