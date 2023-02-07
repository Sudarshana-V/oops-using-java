import java.io.*;
import java.util.*;
public class Intersection_array
{
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4,5};
		int arr2[]={1,5,3,9,7};
		int i,j;
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.print(arr1[i]+ " ");
			}
		}
	}
}