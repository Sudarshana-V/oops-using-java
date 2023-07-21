import java.io.*;
import java.util.*;
public class Array_from_user
{
	public static void main(String args[])
	{
		int n,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the index value");
		n=s.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the number");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The elements of array are :");
		/*for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}*/
		System.out.println(Arrays.toString(a));
		System.out.print("Using for each loop");
		for(i:a)
			System.out.println(i);
	}
}