import java.io.*;
import java.util.*;
public class duplicate_elements_array
{
	public static void main(String args[])
	{
		int a[]={1,1,2,3,2,5};
		int i,j;
		System.out.print("Duplicate values are ");
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.print(" " +a[i]);
			}
		}
	}
}