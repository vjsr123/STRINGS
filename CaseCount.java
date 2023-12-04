package com.learning.CaseCount;

public class CaseCount {
	public static void casecount(char []arr)
	{
		int count =0;
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>=65 && arr[i]<=91)
			{
				count++;
			}
			if(arr[i]>=97 && arr[i]<=123)
			{
				sum++;
			}
		}
		System.out.println("The Uppercase letters in the given String :"+count);
		System.out.println("The Lowercase letters in the given String :"+sum);
	}

}
