package com.learn.Strings.AllCaseCount;

public class AllCaseCount {
	public static void allcasecount(String str)
	{	
		//Converting the string to character array
		char []arr =str.toCharArray();
		String uppstr="";
		String lowstr="";
		String digstr="";
		String splstr="";
		int uppcnt = 0,lowcnt = 0,digcnt = 0,splcnt=0;
		//Traverse from first index to last index 
		for(int i=0;i<=arr.length-1;i++)
		{
			//Checking for upper case letters 
			if(arr[i]>='A' && arr[i]<='Z')
			{
				uppcnt ++;
				uppstr=uppstr+arr[i]+",";
			}
			//checking for lower case letters 
			else if(arr[i]>='a' && arr[i]<='z')
			{
				lowstr=lowstr+arr[i]+",";
				lowcnt++;
			}
			//Checking for digits 
			else if(arr[i]>='0'&& arr[i]<='9')
			{
				digstr=digstr+arr[i]+",";
				digcnt++;
			}
			//otherwise add remaining to splstr
			else
			{
				splstr=splstr+arr[i]+",";
				splcnt++;
			}
		}
		System.out.println("Count of uppercase Letters: "+uppcnt);
		System.out.println("Uppercase Letters : "+uppstr);
		System.out.println("Count of Lowercase Letters: "+lowcnt);
		System.out.println("Lowercase Letters : "+lowstr);
		System.out.println("Count of digits :"+digcnt);
		System.out.println("Numbers: "+digstr);
		System.out.println("Count of special characters:"+splcnt);
		System.out.println("Special characters : "+splstr);
	}

}
