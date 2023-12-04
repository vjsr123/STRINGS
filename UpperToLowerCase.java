package com.learning.uppertolowercase;

public class UpperToLowerCase {

	public static void uppertolower(char []arr,char []newarr)
	{
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>=65 && arr[i]<=91)
			{
				int uni=arr[i];
				uni = uni+32;
				char ch = (char)uni;
				newarr[i]= ch;
			}	
			
		}
		String newstr =new String(newarr);
		System.out.println(newstr);
	}

}
