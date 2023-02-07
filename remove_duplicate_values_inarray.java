import java.io.*;
import java.util.*;
public class remove_duplicate_values_inarray
{
	public static void main(String args[])
	{
		int a[]={1,1,2,3,2,5};
		int i,j,temp;
		int n=a.length;
		Arrays.sort(a);
		System.out.print("Array without duplicate elements : ");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j;k<n;k++)
					{
						a[k]=a[k+1];
					}
					j--;
					n--;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+ " ");
	}
}