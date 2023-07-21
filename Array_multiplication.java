import java.io.*;
import java.util.*;
public class Array_multiplication
{
	public static void main(String args[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter the array elements :");
		int a[]=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=s.nextInt();
		int multiple=1;
		for(i=0;i<a.length;i++)
			multiple*=a[i];
		System.out.println("The multiple value : " +multiple);
	}
}