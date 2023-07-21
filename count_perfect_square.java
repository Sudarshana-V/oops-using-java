import java.io.*;
import java.util.*;
public class count_perfect_square
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<25;j++)
			{
				if(j*j==a[i])
					count++;
			}
		}
		System.out.println(count);
	}
}