package com.learn.Strings.CommonLetter;

public class CommonLetter {
	public static void common(String name1,String name2)
	{
		String newname1="";
		for(int i=0;i<name1.length();i++) {
			if(!newname1.contains(name1.charAt(i)+""))
			{
				newname1=newname1+name1.charAt(i);
			}
		}
		String newname2="";
		for(int i=0;i<name2.length();i++) {
			if(!newname2.contains(name2.charAt(i)+""))
			{
				newname2=newname2+name2.charAt(i);
			}
		}
		String newstr="";
		for(int i=0;i<=newname1.length()-1;i++)
		{
			for(int j=0;j<=newname2.length()-1;j++)
			{
				if(newname2.charAt(j)==newname1.charAt(i))
				{
					if(newname2.charAt(j)==' ')
					{
						newstr=newstr;
					}
					else
					{
						newstr = newstr+newname2.charAt(j);
					}
				}
			}
		}
		System.out.println(newstr);
	}
}


