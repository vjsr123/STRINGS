package com.learn.Strings.PreservingSpace;

public class PreservingSpace {
	public static void space(String str)
	{
		char[]arr=str.toCharArray();
		char []newarr=new char[str.length()];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				newarr[i]=' ';
			}
		}
		
		int j=arr.length-1;
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]!=' ')
				{
					while(newarr[j]==' ')
					{
						j--;
					}
					newarr[j]=arr[i];
					j--;
				}
			}
			String newstr=new String(newarr);
		System.out.println(newstr);
	}


}
