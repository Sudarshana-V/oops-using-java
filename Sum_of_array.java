import java.io.*;
import java.util.*;
public class Sum_of_array
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,i,sum=0;
		System.out.println("Enter the index of array :");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element :");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.print("The sum of elements in a array : "+sum);
	}
}