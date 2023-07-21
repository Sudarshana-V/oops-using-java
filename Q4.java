import java.io.*;
import java.util.*;
public class Q4
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int q=s.nextInt();
		int a,b,n,i;
		for(i=1;i<=q;i++)
		{
		   a=s.nextInt();
		   b=s.nextInt();
		   n=s.nextInt();
		   int series=a;
		   for(i=0;i<n;i++)
		  {
		    	series+=(2^i * b);
			    System.out.print(" " +series);
		   }
		}
	}
}