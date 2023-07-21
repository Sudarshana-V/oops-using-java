import java.io.*;
import java.util.*;
class uncommon_int_in_two_array
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		for(int i=0;i<n1;i++)
			arr1[i]=s.nextInt();
		for(int i=0;i<n2;i++)
			arr2[i]=s.nextInt();
		//count uncommon integer from two array
		int count=0;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(arr1[i]==arr2[j])
					count++;
			}
		}
		System.out.println(n1+n2-count-count);
	}
}