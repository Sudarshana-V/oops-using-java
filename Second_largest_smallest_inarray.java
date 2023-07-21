import java.io.*;
import java.util.*;
public class Second_largest_smallest_inarray
{
	public static void main(String args[])
	{
		int a[]={43,19,25,6,50};
		int i,j,temp;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second largest value : " +a[a.length-2]);
		System.out.println("Second smallest value : " +a[1]);
	}
}