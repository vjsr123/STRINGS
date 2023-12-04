package com.learn.Strings.VowelReplace;

public class VowelReplace {
	public static void replace(String str)
	{
		String newstr="";
		String Str1="99";
		char []arr =str.toCharArray();
		char []newarr=new char[str.length()];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				newstr=newstr+Str1;
			}
			else
			{
			newstr=newstr+arr[i];
			}
		}
		System.out.println(newstr);
	}

}
