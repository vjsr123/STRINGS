package com.learn.Strings.Panagram;

public class Panagram {
	public static void panagram(String str)
	{
		String newstr="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(!newstr.contains(str.charAt(i)+""))
			{
				newstr=newstr+str.charAt(i)+"";
			}
		}
		int length = newstr.length();
		if(length==26)
		{
			System.out.println("The String is panagram");
		}
		else
		{
			System.out.println("The String is not a panagram");
		}
	}

}
