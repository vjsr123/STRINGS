package com.learn.Strings.wordsCount;

public class WordsCount {
	public static void wordscount(String str)
	{
		//Splitting the sentence with split method
		String []arr = str.split(" ");
		//Displaying count of words present in string by arr.length
		System.out.println("The total number of words are:"+arr.length);
		//Traverse from first to last index
		for(int i=0;i<=arr.length-1;i++)
		{
			//Displaying each word 
			System.out.println("word"+(i+1)+":"+arr[i]);
		}
	}

}
