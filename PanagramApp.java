package com.learn.Strings.Panagram;

import java.util.Scanner;

public class PanagramApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		Panagram.panagram(str);
		// TODO Auto-generated method stub

	}

}
