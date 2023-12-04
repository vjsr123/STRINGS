package com.learn.Strings.CommonLetter;

import java.util.Scanner;

public class CommonLetterApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the names");
		String name1=scan.nextLine();
		String name2=scan.nextLine();
		CommonLetter.common(name1, name2);
		
	}

}
