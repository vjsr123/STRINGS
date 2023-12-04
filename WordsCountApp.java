package com.learn.Strings.wordsCount;

import java.util.Scanner;

public class WordsCountApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		//Taking the user input
		System.out.println("Enter the sentence");
		//Storing the in a variable
		String str=scan.nextLine();
		//Method calling/invoking
		WordsCount.wordscount(str);
		// TODO Auto-generated method stub

	}

}
