package com.learn.Strings.PossibleSubStrings;

public class PossibleSubStrings {
	public static void substrings(String str)
	{
		char []arr=str.toCharArray();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String newstr="";
			for(int j=i;j<=arr.length-1;j++)
			{
				newstr= newstr+arr[j];
				System.out.println(newstr);
			}
		}
	}

}
