import java.io.*;
import java.util.*;
public class Commonelements_from_threeSortedArray
{
	public static void main(String args[])
	{
		int array1[]={2,4,8};
		Arrays.sort(array1);
		int array2[]={2,3,4,8,10,16};
		Arrays.sort(array2);
		int array3[]={4,8,14,40};
		Arrays.sort(array3);
		int i,j,k,count=0;
		int a[]=new int[count];
		System.out.println("Common elements from three sorted (in non-decreasing order ) arrays:");
		for(i=0;i<array1.length;i++)
		{
			for(j=0;j<array2.length;j++)
			{
				for(k=0;k<array3.length;k++)
				{
					if(array1[i]==array2[j] && array2[j]==array3[k])
				         System.out.print(array1[i]+ " ");
				}
			}
		
	}
}