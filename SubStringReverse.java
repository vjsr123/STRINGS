package com.learn.SubStringReverse;

public class SubStringReverse {
	public static void substringsreverse(String str)
	{
		char []arr=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			String newstr="";
			System.out.println();
			for(int j=arr.length-1;j>=i;j--)
			{
				newstr= arr[j]+newstr;
				System.out.println(newstr);
			}
		}
	}

}
