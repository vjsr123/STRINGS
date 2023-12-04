package com.learn.Strings.charcaterscount;

public class CharactersCount {
	public static void characterscount(String str)
	{
		//Splitting the sentence with split method
		String []arr = str.split(" ");
		//Traverse from first to last index
		for(int i=0;i<=arr.length-1;i++)
		{
			//Displaying characters count present in each word
			System.out.println("Charcaters present in \" "+arr[i]+" \"is "+arr[i].length());
		}
	}


}
