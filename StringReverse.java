package com.learning.StringReverse;

public class StringReverse {
	public static String reversestring(char[]arr,String str,char[]revarr)
	{
		int j= revarr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			revarr[j]=arr[i];
			j--;
		}
		String revstr = new String(revarr);
		return revstr;	
	}

}
