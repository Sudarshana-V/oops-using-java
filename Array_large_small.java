import java.io.*;
import java.util.*;
public class Array_large_small
{
	public static void main(String args[])
	{
		int a[]={43,19,25,6,50};
		int i,j,small=0,large=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
					large=a[i];
				else if(a[i]<a[j])
					small=a[i];
				else
					continue;
			}
		}
		System.out.println("Large value : " +large);
		System.out.println("Small value : " +small);
	}
}